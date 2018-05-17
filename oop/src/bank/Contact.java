package bank;

public abstract class Contact {
	private String name;
	private String address;

	public Contact(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if ((name != null) && (name.trim().length() > 0)) {
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if ((address != null) && (address.trim().length() > 0)) {
			this.address = address;
		}
	}

}
