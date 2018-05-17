package musicalInstruments;
class Instrument {
	private static final String INVALID_NAME_MSG = "Invalid name of the instrument";
	private static final String INVALID_QUANTITY_MSG = "Quantity must be positive";
	private static final String INVALID_PRICE_MSG = "Price must be positive";
	private String name;
	private int quantity;
	private float price;
	private InstrumentType type;

	public Instrument(String name, int quantity, float price, InstrumentType type) throws InstrumentException {
		this.setName(name);
		this.setQuantity(quantity);
		this.setPrice(price);
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InstrumentException {
		if (name != null && name.length() > 2) {
			this.name = name;
		} else {
			throw new InstrumentException(INVALID_NAME_MSG);
		}

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) throws InstrumentException {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			throw new InstrumentException(INVALID_QUANTITY_MSG);
		}

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) throws InstrumentException {
		if (price > 0) {
			this.price = price;
		} else {
			throw new InstrumentException(INVALID_PRICE_MSG);
		}

	}

	public InstrumentType getType() {
		return type;
	}

	public void decreaseQuantity(int count) {
		if (count > 0) {
			this.quantity -= count;
		}
	}

	public void increaseQuantity(int count) {
		if (count > 0) {
			this.quantity += count;
		}

	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + ", quantity=" + quantity + ", price=" + price + ", type=" + type + "]";
	}

}