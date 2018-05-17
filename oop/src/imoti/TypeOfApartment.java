package imoti;

public enum TypeOfApartment {
	STUDIO("Studio"), GARSONIERA("Garsoniera"), TWO_ROOMS("Two rooms"), THREE_ROOMS("Three rooms"), MEZONET("Mezonet");
	
	private final String typeOfApartment;

	private TypeOfApartment(String typeOfApartment) {
		this.typeOfApartment = typeOfApartment;
	}

	public String getTypeOfApartment() {
		return typeOfApartment;
	}
	
	
}
