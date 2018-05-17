package bank;

public enum TypeOfDepozit {
	SHORT(3,0.03f,"Short"), LONG(12,0.05f,"Long");
	
	private int period; 
	private float lihva;
	private String type;

	private TypeOfDepozit(int period, float lihva, String type) {
		this.type = type;
		this.period = period;
		this.lihva = lihva;
	}

	public int getPeriod() {
		return this.period;
	}

	public float getLihva() {
		return this.lihva;
	}
	
	public String getType() {
		return this.type;
	}
	
}
