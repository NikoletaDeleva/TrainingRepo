package pristanishte;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sklad {

	private Set<Pratka> pratki = new LinkedHashSet<>();

	public void addPratka(Pratka p) {
		synchronized (this.pratki) {
			this.pratki.add(p);
		}
	}

	public int getNumberOfPratki() {
		return this.pratki.size();
	}

	public Pratka getFirst() throws SkladException {
		synchronized (this.pratki) {
			if (this.pratki.size() == 0) {
				throw new SkladException("Nqma stoki tuka!");
			}

			Pratka p = this.pratki.iterator().next();
			this.pratki.remove(p);
			return p;
		}
	}

}
