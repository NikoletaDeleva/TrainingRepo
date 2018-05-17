package selo;

public enum Plod {
	SLIVI("sliva","slivova"),GROZDE("grozde","grozdova"),KAISII("kaisiq","kaisieva");
	private String type;
	private String rakiatype;
	private Plod(String type, String rakiaType) {
		this.setType(type);
		this.setRakiatype(rakiaType);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRakiatype() {
		return rakiatype;
	}
	public void setRakiatype(String rakiatype) {
		this.rakiatype = rakiatype;
	}

}
