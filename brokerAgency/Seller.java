package brokerAgency;

public class Seller extends Client implements ISeller {
	private static final String TYPE = "Seller";
	private Agent agent;
	private Agency agency;
	private Property property;

	public Seller(String name, String number, float money) {
		super(name, number, money);
		super.setTypeOfClient(TYPE);
	}

	public Property getProperty() {
		return this.property;
	}

	public void setProperty(Property property) {
		if (property != null) {
			this.property = property;
			property.setSeller(this);
		} else {
			System.out.println("Cannot set property.");
		}
	}

	public Agency getAgency() {
		return this.agency;
	}

	public void setAgency(Agency agency) {
		if (agency != null) {
			this.agency = agency;
		} else {
			System.out.println("Invalid agecny.");
		}
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		if (agent != null) {
			this.agent = agent;
		} else {
			System.out.println("Invalid agent.");
		}
	}

	@Override
	public boolean registerProperty() {
		if (this.agency != null && this.agency.getListOfAgents().size() != 0) {
			this.agency.addAdvertisment(property);
			this.agent = this.agency.randomAgent();
			this.agent.addSeller(this);
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		Seller otherSeller;
		if (obj instanceof Seller) {
			otherSeller = (Seller) obj;
			if (this.getName().equals(otherSeller.getName())) {
				if (this.getNumber() == otherSeller.getNumber()) {
					if (this.getProperty().getAddress().equals(otherSeller.getProperty().getAddress())) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
