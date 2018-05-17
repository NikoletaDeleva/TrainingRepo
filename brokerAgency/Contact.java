package brokerAgency;

public abstract class Contact {
	private String name;
	private String number;
	private float money;
	
	Contact(String name, String number, float money){
		this.setName(name);
		this.setNumber(number);
		this.setMoney(money);
	}

	public void setMoney(float money) {
		if(money >= 0.0f) {
			this.money = money;
		}else {
			System.out.println("Invalid amount of money.");
		}
	}
	public float getMoney() {
		return this.money;
	}
	public void setNumber(String number) {
		if(number != null && number.trim().length() == 10) {
			this.number = number;
		}else {
			this.number = "";
			System.out.println("Invalid number.");
		}
	}

	public void setName(String name) {
		if(name != null && name.trim().length() > 0) {
			this.name = name;
		}else {
			this.name = "";
			System.out.println("Invalid name.");
		}
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}
}
