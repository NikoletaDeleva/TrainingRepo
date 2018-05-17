package brokerAgency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Agent extends Contact{
	
	private Agency agency;
	private Set<Seller> sellers;
	private Set<Buyer> buyers;
	private List<Inspection> inspections;
	
	public Agent(String name, String number, float money) {
		super(name, number, money);
		this.sellers = new LinkedHashSet<Seller>();
		this.buyers = new LinkedHashSet<Buyer>();
		this.inspections = new ArrayList<Inspection>();
	}
	
	public boolean addSeller(Seller seller) {
		if(seller != null) {
			this.sellers.add(seller);
			return true;
		}
		return false;
	}
	public boolean removeSeller(Seller seller) {
		if(seller != null && this.sellers.contains(seller)) {
			this.sellers.remove(seller);
			return true;
		}
		return false;
	}
	public boolean removerInspection(Property property) {
		for(Iterator<Inspection> it = this.inspections.iterator(); it.hasNext();) {
			if(it.next().getProperty().equals(property)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	public boolean addBuyer(Buyer buyer) {
		if(buyer != null) {
			this.buyers.add(buyer);
			return true;
		}
		return false;
	}
	
	public boolean removeBuyer(Buyer buyer) {
		if(buyer != null && this.buyers.contains(buyer)) {
			this.buyers.remove(buyer);
			return true;
		}
		return false;
	}

	public Agency getAgency() {
		return this.agency;
	}

	public void setAgency(Agency agency) {
		if(agency != null) {
			this.agency = agency;
		}else {
			System.out.println("Invalid agency.");
		}
	}
	
	public boolean addInspection(Inspection inspection) {
		if(inspection != null) {
			this.inspections.add(inspection);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		Agent newAgent;
		if(obj instanceof Agent) {
			newAgent = (Agent)obj;
			if(this.getName().equals(newAgent.getName())) {
				if(this.getNumber() == newAgent.getNumber()) {
					return true;
				}
				return false;
			}
		}
		return false;
		
		
	}

}
