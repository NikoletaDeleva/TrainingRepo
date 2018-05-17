package imoti;

public abstract class Client extends Contact {
	private String typeOfCLient;
	private Agent agent;

	public Client(String name, String phone) {
		super(name, phone);
	}

	public String getTypeOfCLient() {
		return this.typeOfCLient;
	}

	public void setTypeOfCLient(String typeOfCLient) {
		this.typeOfCLient = typeOfCLient;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		if (agent != null) {
			this.agent = agent;
		} else {
			System.out.println("No such agent! CLASS: Client");
		}

	}

}
