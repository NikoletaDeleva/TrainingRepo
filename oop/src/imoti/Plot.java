package imoti;

public class Plot extends Property {
	
	private final static String TYPE = "Plot";
	private final boolean isRegulated;
	private final String typeOfPlot;
	
	public Plot(String address, long price, float area, Seller seller, Agent agent, boolean isRegulated, 
			TypeOfPlot typeOfPlot) {
		super(address, price, area, seller, agent,TYPE);
		this.isRegulated = isRegulated;
		this.typeOfPlot = typeOfPlot.getTypeOfPlot();
	}

	public boolean isRegulated() {
		return isRegulated;
	}

	public String getTypeOfPlot() {
		return typeOfPlot;
	}

}
