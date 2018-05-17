package musicalInstruments;
import java.util.Random;

class Observer extends Thread {
	private static final int MAX_NUM_PROBABILITY = 6;
	
	private static final int MIN_NUM_PROBABILITY = 1;
	private Shop shop;

	Observer(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			try {
				Thread.sleep(10_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int probability = Demo.random(MIN_NUM_PROBABILITY, MAX_NUM_PROBABILITY);

			switch (probability) {
			case 1:
				CatalogType type = CatalogType.values()[random.nextInt(CatalogType.values().length - 1)];
				Boolean isAscending = random.nextBoolean();
				this.shop.printCalalogByChoice(type, isAscending);
				break;
			case 2:
				this.shop.showListOfSoldInstrumentsBySale();
				break;
			case 3:
				this.shop.generateTotalSumOfSoldInstruments();
				break;
			case 4:
				this.shop.getBestSellingInstrument();
				break;
			case 5:
				this.shop.biggestIncomeFromInstrument();
				break;
			}

		}
	}
}
