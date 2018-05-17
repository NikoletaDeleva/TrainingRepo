package pristanishte;

public class Pratka {
	private static int nextId = 1;
	private final int id;

	public int getId() {
		return id;
	}

	Pratka() {
		this.id = nextId++;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || !(obj instanceof Pratka))
			return false;

		return ((Pratka) obj).id == this.id;
	}

	@Override
	public int hashCode() {
		return id * 37;
	}
}
