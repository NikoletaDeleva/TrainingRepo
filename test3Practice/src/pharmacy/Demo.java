package pharmacy;

import java.util.ArrayList;
import java.util.List;


public class Demo {
	private static final int PHARMACIES_COUNT = 3;
	private static final int CLIENTS_COUNT = 30;
	
	public static void main(String[] args) {
		MainPharmacy mainPharmacy = MainPharmacy.getInstance();
		List<Pharmacy> pharmacies = new ArrayList<Pharmacy>();
		for (int index = 1; index <= PHARMACIES_COUNT; index++) {
			pharmacies.add(new Pharmacy("Pharmacy" + index));
		}

		JsonArchivator json = new JsonArchivator(pharmacies);
		json.setDaemon(true);
		json.start();
		
		Provider provider = new Provider(pharmacies);
		provider.setDaemon(true);
		provider.start();
		
		List<Client> clients = new ArrayList<Client>();
		for (int index = 1; index <= CLIENTS_COUNT; index++) {
			clients.add(new Client(pharmacies));
		}
		
		for (Client client : clients) {
			client.start();
		}
	}

}
