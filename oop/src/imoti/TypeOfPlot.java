package imoti;

public enum TypeOfPlot {
	
	LAWN("Lawn"), FOREST("Forest"), FIELD("Field");
	
	private final String typeOfPlot;
	
	private TypeOfPlot(String typeOfPlot) {
		this.typeOfPlot = typeOfPlot;
	}
	
	public String getTypeOfPlot() {
		return typeOfPlot;
	}
	
}
	
