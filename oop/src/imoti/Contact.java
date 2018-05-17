package imoti;

public abstract class Contact {
	private String name;
	private String phone;
	private float money;


	public Contact(String name, String phone) {
		setName(name);
		setPhone(phone);
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		if(money>0){		
			this.money = money;
		}else {
			System.out.println("Not enough money! CLASS: Contact");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}else {
			System.out.println("Invalid name! CLASS: Contact");
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone != null && phone.trim().length() == 10) {
			this.phone = phone;
		}else {
			System.out.println("Invalid phone! CLASS: Contact");
		}
	}

}
