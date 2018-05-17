package imoti;

public class Inspection {
	private Property property;
	private Agent agent;
	private Buyer buyer;
	private String data;
	
	public Inspection(Property property, Agent agent, Buyer buyer, String data) {
		this.setProperty(property);
		this.setAgent(agent);
		this.setBuyer(buyer);
		this.setData(data);
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		if(property != null) {
			this.property = property;
		}else {
			System.out.println("Invalid property. (CLASS: INSPECTION)");
		}
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		if(agent != null) {
			this.agent = agent;
		}else {
			System.out.println("Invalid agent. (CLASS INSPECTION)");
		}
	}

	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		if(buyer != null) {
			this.buyer = buyer;
		}else {
			System.out.println("Invalid buyer. (CLASS INSPECTION)");
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		if(data != null && data.trim().length() > 0) {
			this.data = data;
		}else {
			System.out.println("Invalid data. (CLASS INSPECTION)");
		}
	}
	
	
	
	
}
