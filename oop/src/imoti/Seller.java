package imoti;

public class Seller extends Client implements ISeller {
	private static final String TYPE = "Seller";
	private Property propertyToSell;

	public Seller(String name, String phone, Property property) {
		super(name, phone);
		super.setTypeOfCLient(TYPE);
		this.setPropertyToSell(property);
	}

	@Override
	public void registerProperty() {
		// TODO Auto-generated method stub

	}

	public Property getPropertyToSell() {
		return this.propertyToSell;
	}

	public void setPropertyToSell(Property propertyToSell) {
		if(propertyToSell != null ) {
			this.propertyToSell = propertyToSell;
		}else {
			System.out.println("Invalid property set! CLASS: Seller");
		}
		
	}

}
