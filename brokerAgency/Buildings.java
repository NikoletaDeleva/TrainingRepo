package brokerAgency;

public abstract class Buildings extends Property{
	private String buildingMaterials;
	
	public Buildings(String address, float price, float area, String type, String buildingMaterials) {
		super(address, price, area, type);
		this.setBuildingMaterials(buildingMaterials);
	}

	public void setBuildingMaterials(String buildingMaterials) {
		if(buildingMaterials != null && buildingMaterials.trim().length() > 0) {
			this.buildingMaterials = buildingMaterials;
		}else {
			this.buildingMaterials = "";
			System.out.println("Invalid building materials.");
		}
	}
	public String getBuildingMaterials() {
		return this.buildingMaterials;
	}
	
	
}
