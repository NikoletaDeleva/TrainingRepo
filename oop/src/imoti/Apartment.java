package imoti;

public class Apartment extends Buildings {
	private final static String TYPE_OF_BUILDING = "Apartment";
	private final String typeOfApartment;
	
	public Apartment(String address, long price, float area, BuildingMaterial buildingMaterial, Seller seller,
			Agent agent, String typeOfBuilding, TypeOfApartment typeOfApartment) {
		super(address, price, area, buildingMaterial, seller, agent, TYPE_OF_BUILDING);
		this.typeOfApartment = typeOfApartment.getTypeOfApartment();
	}

	public String getTypeOfApartment() {
		return typeOfApartment;
	}

}
