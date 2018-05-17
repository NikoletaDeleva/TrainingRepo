package pharmacy;

import java.util.List;
import java.util.Random;

public class Client extends Thread {
	private static final String[] painPlaces = {"krak", "oko", "glava", "korem", "#iToiNeZnae"};
	private static final int TIME_FOR_BUYING = 1000;
	private static final int MEDICAMENT_BUYING_COUNT = 100;
	private List<Pharmacy> pharmacies;
	
	public Client(List<Pharmacy> pharmacies) {
		this.pharmacies = pharmacies;
	}
	
	@Override
	public void run() {
		for (int index = 0; index < MEDICAMENT_BUYING_COUNT; index++) {
			Random random = new Random();
			Pharmacy pharmacy = this.pharmacies.get(random.nextInt(this.pharmacies.size()));
			String painPlace = painPlaces[random.nextInt(painPlaces.length)];
			Medicament medicament = pharmacy.kupiLekarstvo(painPlace);
			System.out.println("CLIENT " + getName() + " si kupi " + medicament.getType() + " zashtoto go boli " + painPlace);
			
			try {
				Thread.sleep(TIME_FOR_BUYING);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
