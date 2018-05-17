package pharmacy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Provider extends Thread {
	private static final int DELIVERY_TIME = 3000;
	
	private List<Pharmacy> pharmacies;
	
	public Provider(List<Pharmacy> pharmacies) {
		this.pharmacies = new ArrayList<>(pharmacies);
	}
	
	@Override
	public void run() {
		while (true) {
			for (Pharmacy pharmacy : this.pharmacies) {
				Map<MedicamentType, List<Medicament>> lekarstva = MainPharmacy.getInstance().vzemiLekarstva();
				pharmacy.zarediLekarstva(lekarstva);
				//pharmacy.notifyAll();
			}
			
			try {
				Thread.sleep(DELIVERY_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
