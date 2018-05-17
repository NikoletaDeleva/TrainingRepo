package brokerAgency;

public enum PlotSubtypes {
	FOREST("Forest"), LAWN("Lawn"), FIELD("Field");
	
	private String type;
	private PlotSubtypes(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
}
