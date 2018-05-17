package musicalInstruments;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Provider implements Runnable {
	private Shop shop;
	private Map<String, Integer> catalog = new HashMap<String, Integer>();
	private Map<String, Integer> orders = new HashMap<String, Integer>();


	Provider(Shop shop) {
		fillCatalog();
		this.shop = shop;
	}

	private void fillCatalog() {
		for (int count = 0; count < Client.INSTRUMENT_NAMES.length; count++) {
			this.catalog.put(Client.INSTRUMENT_NAMES[count], Demo.random(1, 10));
		}
	}

	void makeOrder(String name, int count) {
		if (name != null && count > 0) {
			if (!this.orders.containsKey(name)) {
				this.orders.put(name, 0);
			}
			this.orders.put(name, orders.get(name) + count);
			this.makeOrder();
		}
	}

	void makeOrder() {
		int timeToDelivery = this.orders.values().stream().reduce(0, (x, y) -> x + y);

		System.out.println("The client shoud be wait " + timeToDelivery + " hours");

	}

	public void run() {
		while (true) {
			while (this.orders.size() == 0) {
				
				synchronized (this.shop) {
					try {
						this.shop.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
				}
			}

			System.out.println("Start delivery: ");

			synchronized (this.orders) {
				for (Entry<String, Integer> entry : this.orders.entrySet()) {
					String name = entry.getKey();
					int count = entry.getValue();
					System.out.println(" -" + name + " -> " + count + " of them");
					this.shop.acceptInstrument(name, count);
				}
				this.orders.clear();
			}

			synchronized (this.shop) {
				this.shop.notifyAll();
			}
		}
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}

}
