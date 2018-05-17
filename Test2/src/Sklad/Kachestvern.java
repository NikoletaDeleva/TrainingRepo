package Sklad;

import java.util.List;

public class Kachestvern extends Dostavchik {

	private static final double PRICE = 0.45f;

	public Kachestvern(String name, int money) {
		super(name, money);
	}

	@Override
	public void kupiStoka(List<Stoka> stoki) {
		if(stoki != null ) {
			for(Stoka stoka : stoki) {
				this.kupeniStoki.add(new Stoka(stoka.getName(), (int)(stoka.getPrice()*PRICE), Sklad.DEFAULT_KOL));
				this.uvelichiMiParite(stoka.getPrice()*PRICE);
			}
		}else {
			System.out.println("Nqma takuv list");
		}
		
	}
	
	

}
