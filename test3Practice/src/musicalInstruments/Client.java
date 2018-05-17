package musicalInstruments;
import java.util.Random;

class Client implements Runnable {
	private Shop shop;

	static final String[] INSTRUMENT_NAMES = { "cigulka", "viola", "kontrabas", "arfa", "kitara", "brabani",
			"tarambuka", "typan", "arfa", "daire", "trompet", "trombon", "tuba", "fleita", "klarinet", "organ", "piano",
			"akordeon", "sintezator", "bas-kitara", "el.cigulka" };
	private Random random = new Random();

	Client(Shop shop) {
		this.shop = shop;
	}

	@Override
	public void run() {
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}

			String instrumentName = INSTRUMENT_NAMES[random.nextInt(INSTRUMENT_NAMES.length)];
			int count = Demo.random(1, 15);
			System.out.println(String.format("I'd like to buy %d of %s", count, instrumentName));
			try {
				this.shop.sellInstrument(instrumentName, count);
			} catch (ShopException | InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}

	public void setShop(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}
}
