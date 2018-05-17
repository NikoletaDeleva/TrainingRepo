package Sklad;

import java.util.List;

public class Burz extends Dostavchik {
	private final static float LOSS = 0.1f;
	private final static float PRICE = 0.15f;

	public Burz(String name, int money) {
		super(name, money);
	}

	@Override
	public void kupiStoka(List<Stoka> stoki) {
		if (stoki != null) {
			for (Stoka stoka : stoki) {
				if (Math.random() > LOSS) {
					this.kupeniStoki
							.add(new Stoka(stoka.getName(), Sklad.DEFAULT_KOL, (int) (stoka.getPrice() * PRICE)));
					this.uvelichiMiParite(stoka.getPrice()*PRICE);
				}
			}
		}else {
			System.out.println("Nqma takuv list");
		}

	}

}
