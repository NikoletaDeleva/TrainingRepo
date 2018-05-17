package brokerAgency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Agency extends Contact{
	private String address;
	private List<Agent> agents;
	private Set<Property> adds;
	
	public Agency(String name, String number, String address, float money) {
		super(name, number, money);
		this.setAddress(address);
		this.agents = new ArrayList<Agent>();
		this.adds = new TreeSet<Property>();
	}
	
	public boolean addAdvertisment(Property property) {
		if(property != null) {
			this.adds.add(property);
			return true;
		}
		return false;
	}
	
	public Set<Property> getAdvertisments(){
		return Collections.unmodifiableSet(this.adds);
	}
	public List<Agent> getListOfAgents(){
		return Collections.unmodifiableList(agents);
	}
	public void setAddress(String address) {
		if(address != null && address.trim().length() > 0) {
			this.address = address;
		}else {
			this.address = "";
			System.out.println("Invalid address.");
		}
	}
	
	public boolean addAgent(Agent agent) {
		if(agent != null && !this.agents.contains(agent)) {
			this.agents.add(agent);
			System.out.println("agent added");
			return true;
		}
		System.out.println("adding agent failed");
		return false;
	}
	
	public boolean removeAgent(Agent agent) {
		if(agent != null && this.agents.contains(agent)) {
			this.agents.remove(agent);
			return true;
		}
		return false;
	}
	public void listAllAgents() {
		for(Agent agent : this.agents) {
			System.out.println(agent.getName() + " " + agent.getNumber());
		}
	}
	
	public Agent randomAgent() {
		return this.agents.get((int)(Math.random() * this.agents.size()));
	}
	
	public String getAddress() {
		return this.address;
	}

	public boolean removeAddvertisment(Property propertyToRemove) {
		if(propertyToRemove != null && this.adds.contains(propertyToRemove)) {
			for(Iterator<Property> it = adds.iterator(); it.hasNext();) {
				if(it.next().equals(propertyToRemove)) {
					it.remove();
					return true;
				}
			}
		}
		return false;
	}
}
