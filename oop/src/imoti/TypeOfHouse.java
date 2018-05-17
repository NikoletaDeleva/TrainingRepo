package imoti;

public enum TypeOfHouse {
	FLOOR("Floor"),FULL_HOUSE("Full house");
	
	private final String typeOfHouse;

	private TypeOfHouse(String typeOfHouse) {
		this.typeOfHouse = typeOfHouse;
	}

	public String getTypeOfHouse() {
		return typeOfHouse;
	}
	
	
}
