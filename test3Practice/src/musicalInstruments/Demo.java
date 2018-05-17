package musicalInstruments;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Demo {

	static int random(int min, int max) {
		return new Random().nextInt(max - min) + min;
	}
	
	public static void main(String[] args) throws InterruptedException {

		try {
			Shop shop = new Shop();
			
			Client client = new Client(shop);
			Provider provider = new Provider(shop);
			shop.setProvider(provider);
			
			Observer observer = new Observer(shop);
			observer.setDaemon(true);
			observer.start();
			
			for (int count = 0; count < 5; count++) {
				Thread t1 = new Thread(client);
				t1.start();
				Thread	t2 = new Thread(provider);
				t2.start();
			}

		} catch (InstrumentException e) {
			e.printStackTrace();
		}
		

	}

}
