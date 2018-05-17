package Sklad;

import java.util.ArrayList;
import java.util.List;

public class DemoSklad {
	public static Magazin randomMagazin() {
		Magazin kaufland = new Magazin("Kaufland");
		Magazin lidl = new Magazin("Lidl");
		Magazin billa = new Magazin("Billa");
		Magazin fantastiko = new Magazin("Fantastiko");
		Magazin triChetiriPet = new Magazin("345");

		Magazin[] magazini = { kaufland, lidl, billa, fantastiko, triChetiriPet };

		return magazini[(int) (Math.random() * magazini.length)];
	}

	public static String randomStokaName() {
		String[] stokiName = { "banani", "krushi", "rakia","vino","sirene","meso", "slanina", "bira", "nadenica","kartofi"};

		return stokiName[(int) (Math.random() * stokiName.length)];
	}

	public static int randomKolichestvoStoka() {
		return (int) (Math.random() * 80 + 21);
	}
	
	public static double randomCenaStoka() {
		return (Math.random()*99.91) + 55;
	}

	public static void main(String[] args) {
		Sklad edno = new Sklad("Edno", "Shipka 1");
		Sklad dve = new Sklad("Dve", "Devnq 100");
		Sklad tri = new Sklad("Tri", "Pliska 23");

		Rabotnik gosho1 = new Rabotnik("Gosho1", edno);
		Rabotnik pesho1 = new Rabotnik("Pesho1", edno);
		Rabotnik sasho1 = new NeopitenRabotnik("Sasho1", edno);
		Rabotnik misho1 = new Rabotnik("Misho1", edno);

		Rabotnik gosho2 = new NeopitenRabotnik("Gosho2", dve);
		Rabotnik pesho2 = new Rabotnik("Pesho2", dve);
		Rabotnik sasho2 = new Rabotnik("Sasho2", dve);
		Rabotnik misho2 = new Rabotnik("Misho2", dve);

		Rabotnik gosho3 = new Rabotnik("Gosho3", tri);
		Rabotnik pesho3 = new Rabotnik("Pesho3", tri);
		Rabotnik sasho3 = new Rabotnik("Sasho3", tri);
		Rabotnik misho3 = new NeopitenRabotnik("Misho3", tri);
		
		edno.addRabotnik(gosho1);
		edno.addRabotnik(pesho1);
		edno.addRabotnik(sasho1);
		edno.addRabotnik(misho1);

		dve.addRabotnik(gosho2);
		dve.addRabotnik(pesho2);
		dve.addRabotnik(sasho2);
		dve.addRabotnik(misho2);
		
		tri.addRabotnik(gosho3);
		tri.addRabotnik(pesho3);
		tri.addRabotnik(sasho3);
		tri.addRabotnik(misho3);
		
		edno.addDistributor(new Distributor("Milen1"));
		edno.addDistributor(new Distributor("Petur1"));
		edno.addDistributor(new Distributor("Stanislav1"));
		edno.addDistributor(new Distributor("Mario1"));
		edno.addDistributor(new Distributor("Miroslav1"));

		dve.addDistributor(new Distributor("Milen2"));
		dve.addDistributor(new Distributor("Petur2"));
		dve.addDistributor(new Distributor("Stanislav2"));
		dve.addDistributor(new Distributor("Mario2"));
		dve.addDistributor(new Distributor("Miroslav2"));

		tri.addDistributor(new Distributor("Milen3"));
		tri.addDistributor(new Distributor("Petur3"));
		tri.addDistributor(new Distributor("Stanislav3"));
		tri.addDistributor(new Distributor("Mario3"));
		tri.addDistributor(new Distributor("Miroslav3"));

		edno.addDostavchik(new Burz("Stoqn1", 300));
		edno.addDostavchik(new Burz("Petkan1", 300));
		edno.addDostavchik(new Kachestvern("Svetlio1", 300));
		edno.addDostavchik(new Kachestvern("Viktor1", 300));
		edno.addDostavchik(new Burz("Ivan1", 300));

		dve.addDostavchik(new Burz("Stoqn2", 300));
		dve.addDostavchik(new Kachestvern("Petkan2", 300));
		dve.addDostavchik(new Kachestvern("Svetlio2", 300));
		dve.addDostavchik(new Burz("Viktor2", 300));
		dve.addDostavchik(new Burz("Ivan2", 300));

		tri.addDostavchik(new Kachestvern("Stoqn3", 300));
		tri.addDostavchik(new Burz("Petkan3", 300));
		tri.addDostavchik(new Burz("Svetlio3", 300));
		tri.addDostavchik(new Burz("Viktor3", 300));
		tri.addDostavchik(new Kachestvern("Ivan3", 300));

		List<Stoka> stoki = new ArrayList<Stoka>(10);
		
		for(int index = 0; index <10; index++) {
			stoki.add(new Stoka(randomStokaName(),randomKolichestvoStoka(), randomCenaStoka()));
		}
		
		edno.zarediSklad(stoki);
		stoki.clear();
		
		for(int index = 0; index <=10; index++) {
			stoki.add(new Stoka(randomStokaName(),randomKolichestvoStoka(), randomCenaStoka()));
		}
		
		dve.zarediSklad(stoki);
		stoki.clear();
		
		for(int index = 0; index <=10; index++) {
			stoki.add(new Stoka(randomStokaName(),randomKolichestvoStoka(), randomCenaStoka()));
		}
		
		tri.zarediSklad(stoki);
		stoki.clear();
		
		for(Distributor distributor : edno.getDistributori()) {
			distributor.addMagazin(randomMagazin());
		}
		
		for(Distributor distributor : dve.getDistributori()) {
			distributor.addMagazin(randomMagazin());
		}
		
		for(Distributor distributor : tri.getDistributori()) {
			distributor.addMagazin(randomMagazin());
		}
		
		edno.dostavi(randomMagazin(), stoki);
		dve.dostavi(randomMagazin(), stoki);
		tri.dostavi(randomMagazin(), stoki);
		
		System.out.println("---------------");
		edno.dificitniStoki();
		System.out.println("---------------");
		dve.dificitniStoki();
		System.out.println("---------------");
		tri.dificitniStoki();
		System.out.println("---------------");
		
		edno.loshiSlujiteli();
		dve.loshiSlujiteli();
		tri.loshiSlujiteli();
		
		edno.loshiSlujiteli();
		
		

	}
}
