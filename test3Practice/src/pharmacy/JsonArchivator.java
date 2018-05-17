package pharmacy;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JsonArchivator extends Thread {
	private static final int STATISTIC_TIME = 10000;
	private static int nextStatistic = 1;
	private List<Pharmacy> pharmacies;
	
	public JsonArchivator(List<Pharmacy> pharmacies) {
		this.pharmacies = pharmacies;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(STATISTIC_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			File file = new File("JsonStatistic" + nextStatistic++);
			try (PrintWriter pr = new PrintWriter(file)){
				for (Pharmacy pharmacy : pharmacies) {
					pr.println("Nai prodavanoto lekarstvo v apteka " + pharmacy.getName() + " e " + pharmacy.getMostSoldMedicament());
				}
				
				Map<MedicamentType, Long> medicamentTime = new HashMap<>();
				for (Pharmacy ph : this.pharmacies) {
					Map<MedicamentType, Long> currentPharacyMedicaments = ph.getMîstWaitingMedicament();
					for (Entry<MedicamentType, Long> medicament : currentPharacyMedicaments.entrySet()) {
						if (!medicamentTime.containsKey(medicament.getKey())) {
							medicamentTime.put(medicament.getKey(), 0L);
						}
						
						long currentMedicamentTime = medicamentTime.get(medicament.getKey());
						medicamentTime.put(medicament.getKey(), currentMedicamentTime + medicament.getValue());
					}
				}
				
				Entry<MedicamentType, Long> mostTimed = medicamentTime
															.entrySet()
															.stream()
															.sorted((m1, m2) -> m2.getValue().compareTo(m1.getValue())).findFirst().get();
				pr.println("Lekarstvoto za koeto se e chakalo nai-mnogo e " + mostTimed.getKey() + " vreme za chakane: " + mostTimed.getValue() + " ms");
				
				Map<MedicamentType, Double> turnoverMap = new HashMap<>();
				for (Pharmacy pharmacy : pharmacies) {
					Map<MedicamentType, Double> phTurnover = pharmacy.getTurnoverFromMedicaments();
					for (Entry<MedicamentType, Double> kvp : phTurnover.entrySet()) {
						if (!turnoverMap.containsKey(kvp.getKey())) {
							turnoverMap.put(kvp.getKey(), 0D);
						}
						
						Double currentTurnover = turnoverMap.get(kvp.getKey());
						turnoverMap.put(kvp.getKey(), kvp.getValue() + currentTurnover);
					}
				}
				
				Entry<MedicamentType, Long> mostTurnover = medicamentTime
						.entrySet()
						.stream()
						.sorted((m1, m2) -> m2.getValue().compareTo(m1.getValue())).findFirst().get();
				pr.println("Lekarstvoto ot koeto ima nai-mnogo oborot e " + mostTurnover.getKey() + " oborot: " + mostTurnover.getValue() + " ms");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
