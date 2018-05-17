package pristanishte;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Korab {

	private Set<Pratka> pratki = new HashSet<Pratka>();
	private String name;

	public Korab(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void addPratka(Pratka pratka) {
		if (pratka != null) {
			this.pratki.add(pratka);
		}
	}

	public Collection<Pratka> getPratki() {
		return new HashSet<Pratka>(this.pratki);
	}

	public void removePratka(Pratka p) {
		if (p != null)
			this.pratki.remove(p);
	}

}
