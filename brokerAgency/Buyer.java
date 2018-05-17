package brokerAgency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Buyer extends Client implements IBuyer {
	private static final String TYPE = "Buyer";
	private Agency agency;
	private Agent agent;

	private List<Inspection> inspectionsMade;

	public Buyer(String name, String number, float money) {
		super(name, number, money);
		super.setTypeOfClient(TYPE);
		this.inspectionsMade = new ArrayList<Inspection>();
	}

	public List<Inspection> getInspectionsMade() {
		return Collections.unmodifiableList(this.inspectionsMade);
	}

	public Agency getAgency() {
		return this.agency;
	}

	public void setAgency(Agency agency) {
		if (agency != null) {
			this.agency = agency;
		} else {
			System.out.println("Invalid agency.");
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
	public void registerPropertyRequest(Agency agency) {
		if(agency != null) {
			this.agency = agency;
			this.agent = this.agency.randomAgent();
			this.agent.addBuyer(this);
			System.out.println("registered property request successfully");
		}else {
			System.out.println("Error in registering property request.");
			return;
		}
	}

	@Override
	public boolean requestInspection(Property property) {
		if (property != null && this.agent != null && this.getAgency().getAdvertisments().contains(property)) {
			if (this.getMoney() >= property.getPrice()) {
				Inspection insp = new Inspection(property, this.agent, this);
				this.agent.addInspection(insp);
				this.inspectionsMade.add(insp);
				System.out.println("Inspection successfull");
				return true;
			} else {
				System.out.println("Insufficiency of money.");
				return false;
			}
		}
		System.out.println("error");
		return false;
	}

	@Override
	public boolean requestPurchase(Property property) {
		Property propertyToRemove = null;
		boolean purchaseDone = false;
		for (Inspection insp : this.inspectionsMade) {
			if (insp.getProperty().equals(property)) {
				propertyToRemove = property;
				float moneyForAgency = property.getPrice() * 3 / 100;
				float moneyForAgent = moneyForAgency;
				property.getSeller().setMoney(property.getSeller().getMoney() + property.getPrice());
				this.setMoney(this.getMoney() - property.getPrice() - moneyForAgency * 2);
				this.agent.setMoney(this.agent.getMoney() + moneyForAgent);
				purchaseDone = true;
				break;
			}
		}
		if (purchaseDone == true && propertyToRemove != null) {
			this.getAgent().removerInspection(propertyToRemove);
			this.agency.removeAddvertisment(propertyToRemove);
			System.out.println("Purchase done.");
			return true;
		}
		System.out.println("Purchase failed.");
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		Buyer otherBuyer;
		if (obj instanceof Buyer) {
			otherBuyer = (Buyer) obj;
			if (this.getName().equals(otherBuyer.getName())) {
				if (this.getMoney() == otherBuyer.getMoney()) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	public Inspection getRandomInspection() {
		return this.inspectionsMade.get((int) Math.random() * this.inspectionsMade.size());
	}
}
