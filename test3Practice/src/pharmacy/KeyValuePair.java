package pharmacy;

public class KeyValuePair {
	private Medicament medicament;
	private int quantity;

	public KeyValuePair(Medicament medicament, int quantity) {
		this.setMedicament(medicament);
		this.setQuantity(quantity);
	}

	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
