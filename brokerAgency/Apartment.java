package brokerAgency;

public class Apartment extends Buildings{
	private static final String TYPE = "Apartment";
	
	public Apartment(String address, float price, float area, String buildingMaterials, ApartmentSubtypes subtype) {
		super(address, price, area, TYPE, buildingMaterials);
		super.setSubtype(subtype.getSubtype());
	}

}
