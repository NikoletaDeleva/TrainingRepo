package lesson16;

public class Car {
	// fields
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	char currentGear;
	int price;
	boolean isSportCar;

	Car(String model, boolean isSportCar, String color, int price) {
		if (model != null && !model.trim().equals("")) {
			this.model = model;
		} else {
			this.model = "Invalid";
		}

		this.isSportCar = isSportCar;

		if (color != null && !color.trim().equals("")) {
			this.color = color;
		} else {
			this.color = "Invalid";
		}
		if(price>0) {
			this.price = price;
		}else {
			System.out.println("Invalid");
		}
		
	}

	boolean isMoreExpensive(Car car) {

		return ((this.price <car.price)? true:false) ;
		
	}

	// Person owner;

	void accelerate() {
		System.out.println("Car is accelerating...");
		this.currentSpeed += 20;
		if (this.currentSpeed > this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		}
	}

	void changeGearUp() {
		if (this.currentGear < '5') {
			this.currentGear++;
		}
	}

	void changeGearDown() {
		if ((this.currentGear > '1') && (Character.isDigit(this.currentGear))) {
			this.currentGear--;
		}
	}

	void changeGear(char newGear) {
		if (((newGear >= '1') && (newGear <= '5')) || ("NRSDP".contains("" + newGear))) {
			this.currentGear = newGear;
		}
	}

	// methods
	void bibipkai() {
		System.out.println("Bip-bip like a " + this.model);
	}

	void repaint(String color) {
		this.color = color;
	}

}
