package imoti;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Agent extends Contact {

	private Agency agency;
	private Set<Seller> sellers;
	private Set<Buyer> buyers;
	private Map<String, List<Inspection>> inspections;

	public Agent(String name, String phone) {
		super(name, phone);
		this.sellers = new LinkedHashSet<Seller>();
		this.buyers = new LinkedHashSet<Buyer>();
		this.inspections = new HashMap<String,List<Inspection>>();
	}

	public void addSeller(Seller seller) {
		if (seller != null) {
			this.sellers.add(seller);
		} else {
			System.out.println("Invalid seller! Class: Agent");
		}
	}

	public void removeSeller(Seller seller) {
		if (seller != null && sellers.contains(seller)) {
			this.sellers.remove(seller);
		} else {
			System.out.println("Can not remove seller! Class: Agent");
		}
	}

	public void showAllSellers() {
		for (Seller seller : this.sellers) {
			System.out.println(seller.getName() + " " + seller.getPhone());
		}
	}

	public void addBuyer(Buyer buyer) {
		if (buyer != null) {
			this.buyers.add(buyer);
		} else {
			System.out.println("Invalid buyer! Class: Agent");
		}
	}

	public void removeBuyer(Buyer buyer) {
		if (buyer != null && buyers.contains(buyer)) {
			this.buyers.remove(buyer);
		} else {
			System.out.println("Can not remove buyer! Class: Agent");
		}
	}

	public void showAllBuyers() {
		for (Buyer buyer : this.buyers) {
			System.out.println(buyer.getName() + " " + buyer.getPhone());
		}
	}

	public Agency getAgency() {
		return this.agency;
	}

	public void setAgency(Agency agency) {
		if(agency != null) {
			this.agency = agency;
		}else {
			System.out.println("Invalid agency! CLASS: Agent");
		}
		
	}
	
	
}
