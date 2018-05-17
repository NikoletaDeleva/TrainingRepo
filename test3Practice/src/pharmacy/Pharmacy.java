package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Pharmacy {
	// ime na lekarstvo -> kolichestvo
	private Map<MedicamentType, List<Medicament>> lekarstva;
	private Map<MedicamentType, List<Medicament>> prodadeniLekarstva;
	private Map<MedicamentType, Long> lekarstvaIVremeZaChakane;
	
	private String name;
	private double turnover;

	public Pharmacy(String name) {
		this.setName(name);
		this.lekarstva = new ConcurrentHashMap<>();
		this.prodadeniLekarstva = new ConcurrentHashMap<>();
		this.lekarstvaIVremeZaChakane = new ConcurrentHashMap<>();
		this.turnover = 0;
		fillLekarstva();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void fillLekarstva() {
		for (MedicamentType medicamentType : MedicamentType.values()) {
			this.lekarstva.put(medicamentType, Collections.synchronizedList(new ArrayList<Medicament>()));
			this.prodadeniLekarstva.put(medicamentType, Collections.synchronizedList(new ArrayList<Medicament>()));
			this.lekarstvaIVremeZaChakane.put(medicamentType, 0L);
		}
	}

	public void zarediLekarstva(Map<MedicamentType, List<Medicament>> medicaments) {
		for (Entry<MedicamentType, List<Medicament>> kvp : medicaments.entrySet()) {
			if (this.lekarstva.containsKey(kvp.getKey())) {
				this.lekarstva.get(kvp.getKey()).addAll(kvp.getValue());
			}
		}
	}
	
	public String getMostSoldMedicament() {
		return	this.prodadeniLekarstva
								.entrySet()
								.stream()
								.sorted((kvp1, kvp2) -> kvp2.getValue().size() - kvp1.getValue().size())
								.limit(1)
								.map(kvp -> kvp.getKey() + " solded count: " + kvp.getValue().size())
								.findFirst()
								.get();
	}
	
	public Map<MedicamentType, Long> getMîstWaitingMedicament() {
		return Collections.unmodifiableMap(this.lekarstvaIVremeZaChakane);
	}
	
	public Map<MedicamentType, Double> getTurnoverFromMedicaments() {
//		return this.prodadeniLekarstva
//				.entrySet()
//				.stream()
//				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue().stream().mapToDouble(m -> m.getPrice()).sum());
		Map<MedicamentType, Double> medicamentPrices = new HashMap<>();
		
		for (Entry<MedicamentType, List<Medicament>> kvp : this.prodadeniLekarstva.entrySet()) {
			medicamentPrices.put(kvp.getKey(), kvp.getValue().stream().mapToDouble(m -> m.getPrice()).sum());
		}
		
		return medicamentPrices;
	}

	public synchronized Medicament kupiLekarstvo(String painPlace) {
		MedicamentType medicamentType = getTypeByPainPlace(painPlace);

		while (this.lekarstva.get(medicamentType).size() == 0) {
			try {
				long startTime = System.currentTimeMillis();
				this.wait();
				
				long waitingTime = System.currentTimeMillis() - startTime;
				long currentTime = this.lekarstvaIVremeZaChakane.get(medicamentType);
				this.lekarstvaIVremeZaChakane.put(medicamentType, currentTime + waitingTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		List<Medicament> currentMedicaments = this.lekarstva.get(medicamentType);
		Medicament medicament = currentMedicaments.get(currentMedicaments.size() - 1);
		currentMedicaments.remove(medicament);
		this.prodadeniLekarstva.get(medicamentType).add(medicament);
		return medicament;
	}

	private MedicamentType getTypeByPainPlace(String painPlace) {
		switch (painPlace.toLowerCase()) {
		case "glava":
			return MedicamentType.Paracetamol;
		case "korem":
			return MedicamentType.Espumizan;
		case "krak":
		case "oko":
			return MedicamentType.VitaminC;
		default:
			return MedicamentType.Aspirin;
		}
	}
}
