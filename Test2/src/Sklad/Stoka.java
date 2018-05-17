package Sklad;

public class Stoka {
	private String name;
	private int nalicnost;
	private double price;

	public Stoka(String name, int nalicnost, double price) {
		this.setName(name);
		this.setPrice(price);
		this.setNalicnost(nalicnost);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Zadai korektno ime!");
		}
	}

	public int getNalicnost() {
		return this.nalicnost;
	}

	public void setNalicnost(int nalicnost) {
		if (nalicnost > 0) {
			this.nalicnost = nalicnost;
		} else {
			if (nalicnost == 0) {
				System.out.println("Stokata e svurshila!");
			} else {
				System.out.println("Nqma kak da zadadesh otricatelna nalicnost!");
			}
		}
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Ne moje da stuva tolkova!");
		}
	}

	@Override
	public boolean equals(Object stoka) {
		Stoka stoka1;
		if(stoka instanceof Stoka) {
			stoka1 = (Stoka) stoka;
			return (this.getName().equals(stoka1.getName()));
		}
		return false;
	}
}
