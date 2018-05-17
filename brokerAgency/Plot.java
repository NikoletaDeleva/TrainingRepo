package brokerAgency;

public class Plot extends Property {
	private boolean isInRegulation;
	private static final String TYPE = "Plot";
	public Plot(String address, float price, float area, boolean isInRegulation, PlotSubtypes subtype) {
		super(address, price, area, TYPE);
		this.setIsInRegulation(isInRegulation);
		super.setSubtype(subtype.getType());
	}

	private void setIsInRegulation(boolean isInRegulation) {
		this.isInRegulation = isInRegulation;
	}
	
	public boolean getRegulation() {
		return this.isInRegulation;
	}
	
	
}
