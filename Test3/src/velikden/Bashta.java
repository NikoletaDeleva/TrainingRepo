package velikden;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Bashta extends Thread {
	private Hladilnik hladilnik;

	public Bashta(Hladilnik hladilnik) {
		this.hladilnik = hladilnik;
		setDaemon(true);
	}

	@Override
	public void run() {
		File logFile = new File("qica.txt");

		while (true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Map<VidQive, List<Qice>> kartoniSQica = this.hladilnik.getAllKartoniSQica();
			try (PrintWriter out = new PrintWriter(logFile)) {
				for (int vid = 0; vid < hladilnik.VIDOVE; vid++) {
					out.println("Vid " + vid);
					List<Qice> qica = kartoniSQica.get(vid);
					for (Qice qice : qica) {
						out.println(qice);
					}

					out.println();
					out.println();
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
