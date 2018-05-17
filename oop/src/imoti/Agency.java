package imoti;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Agency extends Contact {

	private String address;
	private Set<Agent> agents;
	private Map<Type,Map<PropertyType,List<Property>>> catalog;

	public Agency(String name, String phone, String address) {
		super(name, phone);
		this.setAddress(address);
		this.agents = new HashSet<Agent>();
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		if(address!=null && address.trim().length()>0) {
			this.address = address;
		}else {
			System.out.println("Invalid address! CLASS: Agency");
		}
		
	}
	public void addAgent(Agent agent) {
		if(agent!=null) {
			this.agents.add(agent);
		}else{
			System.out.println("Invalid agent! CLASS: Agency");
		}
	}
	
	public void removeAgent(Agent agent) {
		if(agent!= null && this.agents.contains(agent)) {
			this.agents.remove(agent);
		}else {
			System.out.println("Invalid remove of agent! CLASS: Agency");
		}
	}
	
	public void showAllAgents() {
		for(Iterator<Agent> itr = this.agents.iterator(); itr.hasNext();) {
			Agent agent = itr.next();
			System.out.println(agent.getName() + " " + agent.getPhone() );
		}
	}
	
}
