package brokerAgency;

public class Inspection {
	private Property property;
	private Agent agent;
	private Buyer buyer;

	public Inspection(Property property, Agent agent, Buyer buyer) {
		this.setProperty(property);
		this.setAgent(agent);
		this.setBuyer(buyer);
	}

	public Property getProperty() {
		return this.property;
	}

	public void setProperty(Property property) {
		if (property != null) {
			this.property = property;
		} else {
			System.out.println("Invalid property.");
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

	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		if (buyer != null) {
			this.buyer = buyer;
		} else {
			System.out.println("Invalid buyer.");
		}
	}

	@Override
	public boolean equals(Object obj) {
		Inspection otherInspection;
		if (obj instanceof Inspection) {
			otherInspection = (Inspection) obj;
			if (this.getAgent().getName().equals(otherInspection.getAgent().getName())) {
				if (this.getBuyer().getName().equals(otherInspection.getBuyer().getName())) {
					if (this.getProperty().getAddress().equals(otherInspection.getProperty().getAddress())) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
