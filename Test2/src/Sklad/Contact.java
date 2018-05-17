package Sklad;

public abstract class Contact {
	private String name;

	public Contact(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null) {
			this.name = name;			
		}else {
			System.out.println("Invalid set name!");
		}
	}
	
}
