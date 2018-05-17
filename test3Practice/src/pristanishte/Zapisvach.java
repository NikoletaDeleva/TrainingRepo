package pristanishte;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

public class Zapisvach extends Thread {

	private Pristanishte pristanishte;

	public Zapisvach(Pristanishte pristanishte) throws IOException {
		this.pristanishte = pristanishte;
		setDaemon(true);

	}

	@Override
	public void run() {
		File logFile = new File("dokove.txt");

		while (true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			List<Set<Pristanishte.UnloadedPackage>> info = this.pristanishte.getAllUnloadedPratki();
			try (PrintWriter out = new PrintWriter(logFile)) {
				for (int dock = 0; dock < Pristanishte.DOCKS_COUNT; dock++) {
					out.println("Dock " + dock);
					Set<Pristanishte.UnloadedPackage> pratki = info.get(dock);

					for (Pristanishte.UnloadedPackage pratka : pratki) {
						out.println(pratka);
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
