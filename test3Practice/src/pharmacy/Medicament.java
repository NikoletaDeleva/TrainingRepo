package pharmacy;

public class Medicament {
	private MedicamentType type;
	private double price;

	public Medicament(MedicamentType type, double price) {
		this.setType(type);
		this.setPrice(price);
	}

	public MedicamentType getType() {
		return type;
	}

	public void setType(MedicamentType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
