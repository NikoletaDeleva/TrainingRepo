package brokerAgency;

public class House extends Buildings {
	private static final byte MAX_PARK_LOTS = 10;
	private static final float MAX_YARD_AREA = 100.00f;
	private static final String TYPE = "House";
	private float yardArea;
	private byte numberOfParkingLots;
	
	public House(String address, float price, float area, String buildingMaterials, int numberOfParkingLots, float yardArea, HouseSubtypes subtype) {
		super(address, price, area, TYPE, buildingMaterials);
		this.setNumberOfParkingLots(numberOfParkingLots);
		this.setYardArea(yardArea);
		super.setSubtype(subtype.getSubtype());
	}
	
	private void setYardArea(float yardArea) {
		if(yardArea >= 0 && yardArea <= MAX_YARD_AREA) {
			this.yardArea = yardArea;
		}else {
			if(yardArea < 0) {
				this.yardArea = 0.00f;
			}else {
				this.yardArea = MAX_YARD_AREA;
			}
		}
	}
	public float getYardArea() {
		return this.yardArea;
	}
	private void setNumberOfParkingLots(int numberOfParkingLots) {
		if(numberOfParkingLots >= 0 && numberOfParkingLots <= MAX_PARK_LOTS) {
			this.numberOfParkingLots = (byte)numberOfParkingLots;
		}else {
			if(numberOfParkingLots < 0) {
				this.numberOfParkingLots = 0;
			}else {
				this.numberOfParkingLots = MAX_PARK_LOTS;
			}
		}
	}
	public byte getAmountOfParkingLots() {
		return this.numberOfParkingLots;
	}
	
	
	
}
