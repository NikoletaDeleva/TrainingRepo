package imoti;

public class House extends Buildings {
	private final static String TYPE_OF_BUILDING = "House";
	private final byte parkingLots;
	private final int yardArea;
	private final String typeOfHouse;
	
	public House(String address, long price, float area, BuildingMaterial buildingMaterial, Seller seller,
			Agent agent, String typeOfBuilding, byte parkingLots, int yardArea, TypeOfHouse typeOfHouse) {
		super(address, price, area, buildingMaterial, seller, agent, TYPE_OF_BUILDING);
		this.parkingLots = parkingLots;
		this.yardArea = yardArea;
		this.typeOfHouse = typeOfHouse.getTypeOfHouse();
	}

	public byte getParkingLots() {
		return parkingLots;
	}

	public int getYardArea() {
		return yardArea;
	}

	public String getTypeOfHouse() {
		return typeOfHouse;
	}

}
