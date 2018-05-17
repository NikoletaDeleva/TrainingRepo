package selo;

public class Hora {
	private String name;
	private byte godini;
	private Selo selo;
	
	public Hora(String name, byte godini,Selo selo) {
		this.setName(name);
		this.setGodini(godini);
		this.setSelo(selo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getGodini() {
		return godini;
	}

	public void setGodini(byte godini) {
		this.godini = godini;
	}

	public Selo getSelo() {
		return selo;
	}

	public void setSelo(Selo selo) {
		this.selo = selo;
	}

}
