package bank;

public enum TypeOfKredit {
	HOME(0.06f, "Home"),CONSUMER(0.1f, "Consumer");
	
	private float lihva;
	private String type;

	private TypeOfKredit(float lihva, String type) {
		this.lihva = lihva;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public float getLihva() {
		return lihva;
	}

}
