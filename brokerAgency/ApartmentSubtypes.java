package brokerAgency;

public enum ApartmentSubtypes {
	GARSONIERA("Garsonietra"), STUDIO("Studio"), MEZONET("Mezonet"), DVUSTAEN("Dvustaen"), TRISTAEN("Tristaen");
	
	private String subtype;
	private ApartmentSubtypes(String subtype) {
		this.subtype = subtype;
	}
	public String getSubtype() {
		return this.subtype;
	}
	
}
