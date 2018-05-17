package imoti;

public abstract class Buildings extends Property{
	private final BuildingMaterial buildingMaterial;

	public Buildings(String address, long price,float area,
			BuildingMaterial buildingMaterial, Seller seller, Agent agent, String typeOfBuilding) {
		super(address, price,area, seller, agent, typeOfBuilding);
		this.buildingMaterial = buildingMaterial;
	}

	public BuildingMaterial getBuildingMaterial() {
		return this.buildingMaterial;
	}

}
