package brokerAgency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {

	private static String getRandomName() {
		String[] firstNames = { "Ivan", "Stoycho", "Nikoleta", "Yanislav", "Minzuharka", "Pruch", "Petyr", "Stoycho",
				"Nikoleta", "Yanislav", "Pruch", "Huligancho", "Radoy", "Kalkulatorka", "Roza", "Qnica" };
		String[] lastNames = { "Tirbushonov", "Karatopraklieva", "Minzuharev", "Keleshev", "Ahilesov", "Tazobedrev",
				"Mirkoskopova", "Milicionerski", "Grozeva", "Ovcharov", "Deleva", "Mitev", "Chichkov", "Minkov",
				"Kolarov", "Milev" };

		return firstNames[(int) (Math.random() * firstNames.length)] + " "
				+ lastNames[(int) (Math.random() * lastNames.length)];
	}
	
	private static String getRandomNumber() {
		String number = "08";
		char digits[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for(int index = 0; index < 8; index++) {
			number +=  digits[(int)(Math.random() * 9)];
		}
		return number;
	}
	
	private static String getRandomAddress() {
		String[] address = {"Bulevard Bulgaria", "Orlov Most", "Mladost", "Kriva reka", 
				"Luvov Most", "Orlandovci", "Fakulteta", "Lozenec", "Hladilnika"};
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		String[] street = {"Daskal Manol", "Dospat", "Kostur", "6ti septemvri", "Todor Kableshkov",
				"Milin Kamuk", "Sofronii Vrachanski", "Patriarh Evtimiy", "Evlogi i Hristo Georgievi"};
		
		return address[(int)(Math.random() * address.length)] + " " + numbers[(int)(Math.random() * numbers.length)] + 
				" " + street[(int)(Math.random() * street.length)];
	}
	
	private static String getRandomMaterials() {
		String[] materials = {"EPK", "Tuhla", "Kirpich", "Panel"};
		
		return materials[(int)(Math.random() * materials.length)];
	}
	
	private static ApartmentSubtypes getRandomTypeApartment() {
		ApartmentSubtypes[] types = {ApartmentSubtypes.DVUSTAEN, ApartmentSubtypes.GARSONIERA,
				ApartmentSubtypes.MEZONET, ApartmentSubtypes.STUDIO, ApartmentSubtypes.TRISTAEN};
		
		return types[(int)(Math.random() * types.length)];
	}
	private static HouseSubtypes getRandomTypeHouse() {
		HouseSubtypes[] types = {HouseSubtypes.FLOOR, HouseSubtypes.FULLHOUSE};
		
		return types[(int)(Math.random() * types.length)];
	}
	private static PlotSubtypes getRandomTypePlot() {
		PlotSubtypes[] types = {PlotSubtypes.FIELD, PlotSubtypes.FOREST, PlotSubtypes.LAWN};
		
		return types[(int)(Math.random() * types.length)];
	}
	
	
	public static void main(String[] args) {
		Agency talants = new Agency("Talanti Esteits", "0899325476", "Bulevard Bulgaria", 50000.99f);
		talants.addAgent(new Agent(getRandomName(), getRandomNumber(), (float)Math.random() * 50000));
		talants.addAgent(new Agent(getRandomName(), getRandomNumber(), (float)Math.random() * 50000));
		talants.addAgent(new Agent(getRandomName(), getRandomNumber(), (float)Math.random() * 50000));
		talants.addAgent(new Agent(getRandomName(), getRandomNumber(), (float)Math.random() * 50000));
		talants.addAgent(new Agent(getRandomName(), getRandomNumber(), (float)Math.random() * 50000));
		
		Seller[] sellers = new Seller[30];
		
		for(int index = 0; index < sellers.length; index++) {
			Property property;
			float propertyType = (float)(Math.random());
			
			if(propertyType <= 0.33f) {
				property = new Apartment(getRandomAddress(), (float)(Math.random() * 70_000 + 80_001), (float)(Math.random() * 40 + 91),
						getRandomMaterials(), getRandomTypeApartment());
			}else {
				if(propertyType > 0.33f && propertyType <= 0.66f) {
					property = new House(getRandomAddress(), (float)(Math.random() * 50_000 + 30_001), (float)(Math.random() * 40 + 91), getRandomMaterials(),
							(byte)(Math.random()*10 + 1), (float)(Math.random() * 20 + 11), getRandomTypeHouse());
				}else {
					property = new Plot(getRandomAddress(), (float)(Math.random() * 30_000 + 55_001), (float)(Math.random() * 40 + 91),
							((Math.random() + 1) < 1 ? false : true), getRandomTypePlot());
				}
				
			}
			
			sellers[index] = new Seller(getRandomName(), getRandomNumber(), 
					(float)(Math.random()*50000));
			sellers[index].setProperty(property);
		}
		
		for(Seller seller : sellers) {
			talants.addAdvertisment(seller.getProperty());
		}
		
		Buyer[] buyers = new Buyer[10];
		for(int index = 0; index < buyers.length; index++) {
			buyers[index] = new Buyer(getRandomName(), getRandomNumber(), (float)(Math.random() * 30_000 + 120_001));
		}
		
		for(int index = 0; index < buyers.length; index++) {
			buyers[index].registerPropertyRequest(talants);
			for(int index2 = 0; index2 < 3; index2++) {
				buyers[index].requestInspection(sellers[(int)(Math.random()*sellers.length)].getProperty());
			}				
		}
		System.out.println();
		for(int index = 0; index < buyers.length; index++) {
			Inspection insp = buyers[index].getRandomInspection();
			buyers[index].requestPurchase(insp.getProperty());
		}
		
		System.out.println("Agency balance: " + talants.getMoney());
		Comparator<Agent> moneyComparator = new Comparator<Agent>() {
			@Override
			public int compare(Agent first, Agent second) {
				return (int)(first.getMoney() - second.getMoney());
			}
		};
		
		List<Agent> sortedAgents = new ArrayList<Agent>();
		sortedAgents.sort(moneyComparator);
		for(Agent agent : sortedAgents) {
			System.out.println("Name: " + agent.getName() + " Balance: " + agent.getMoney());
		}
	}

}
