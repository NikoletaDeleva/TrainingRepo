package brokerAgency;

public enum HouseSubtypes {
	FULLHOUSE("Full house"), FLOOR("Floor");
	
	private String subtype;
	private HouseSubtypes(String subtype) {
		this.subtype = subtype;
	}
	public String getSubtype() {
		return this.subtype;
	}
}
