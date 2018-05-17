package brokerAgency;

import java.util.HashMap;
import java.util.Map;

public abstract class Property implements Comparable<Property>{
	private static final float DEFAULT_AREA_SIZE = 100.00f;
	private String address;
	private float price;
	private Seller seller;
	private Agent agent;
	private final float area;
	private String type;
	private String subtype;
	
	private Map<Buyer, Inspection> inspections;
	
	
	public Property(String address, float price, float area, String type) {
		this.setType(type);
		this.setAddress(address);
		this.setPrice(price);
		this.area = (area > 0) ? area : DEFAULT_AREA_SIZE;
		this.inspections = new HashMap<Buyer, Inspection>();
	}
	
	public void setType(String type) {
		if(type != null && type.trim().length() > 0) {
			this.type = type;
		}else {
			System.out.println("Invalid type.");
			this.type = "";
		}
	}

	public Seller getSeller() {
		return this.seller;
	}
	
	public void setSeller(Seller seller) {
		if(seller != null) {
			this.seller = seller;
		}else {
			System.out.println("Cannot set seller.");
		}
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getSubtype() {
		return this.subtype;
	}
	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAddress() {
		return this.address;
	}

	public float getPrice() {
		return this.price;
	}

	public float getArea() {
		return this.area;
	}
	public String getType() {
		return this.type;
	}
	
	@Override
	public int compareTo(Property property) {
		if(this.type.equals(property.getType())) {
			return (int)(this.getPrice() - property.getPrice());
		}
		return this.getType().compareTo(property.getType()); 
	}
	
	@Override
	public int hashCode() {
		return (int)(this.getArea() * this.getPrice() *
					 this.getAddress().hashCode() * this.inspections.hashCode());
	}
	
	@Override
	public boolean equals(Object obj) {
		Property otherProperty;
		if(obj instanceof Property) {
			otherProperty = (Property)obj;
			if(this.getType().equals(otherProperty.getType())) {
				if(this.getSubtype().equals(otherProperty.getSubtype())) {
					return (this.getAddress().equals(otherProperty.getAddress()));
				}
			}
		}
		return false;
	}
}
