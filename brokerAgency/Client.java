package brokerAgency;

public abstract class Client extends Contact {
	private String typeOfClient;
	private Agent agent;
	
	public Client(String name, String number, float money) {
		super(name, number, money);
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		if(agent != null) {
			this.agent = agent;
		}else {
			System.out.println("Invalid agent.");
		}
			
	}

	public String getTypeOfClient() {
		return this.typeOfClient;
	}

	public void setTypeOfClient(String typeOfClient) {
		this.typeOfClient = typeOfClient;
	}
	
	
}
