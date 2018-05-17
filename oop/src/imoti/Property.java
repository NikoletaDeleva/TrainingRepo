package imoti;

public abstract class Property {
	private final String address;
	private long price;
	private final float area;
	private Agent agent;
	private Seller seller;
	private final String type;

	public Property(String address, long price,float area, Seller seller, Agent agent, String type) {
		
		this.address = address;
		this.area = area;
		this.setPrice(price);
		this.setSeller(seller);
		this.setAgent(agent);
		this.type = type;
	}
	
	public void setSeller(Seller seller) {
		if(seller != null) {
			this.seller = seller;
		}else {
			System.out.println("Invalid seller! CLASS: Property");
		}
	}
	public String getAddress() {
		return address;
	}

	public long getPrice() {
		return price;
	}

	public float getArea() {
		return area;
	}

	public Agent getAgent() {
		return agent;
	}
	
	public void setPrice(long price) {
		if(price > 0L) {
			this.price = price;
		}else {
			System.out.println("Invalid price (CLASS: Property)");
		}
	}
	
	public void setAgent(Agent agent) {
		if(agent != null) {
			this.agent = agent;
		}else {
			System.out.println("Invalid agent (CLASS: Property)");
		}
	}

	public Seller getSeller() {
		return seller;
	}

	public String getType() {
		return type;
	}

	
	
}
