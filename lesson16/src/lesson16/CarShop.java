package lesson16;

public class CarShop {
	private Car[] carArray;
	private int numberOfCars = 0;
	private int currentCar = 0;

	CarShop(int capacity) {
		if (capacity >= 0) {
			this.carArray = new Car[capacity];
		} else {
			System.out.println("Capacity must be atleast 0!");
			capacity = 0;
			this.carArray = new Car[capacity];
		}
	}

	boolean addCar(Car car) {
		if (car != null && numberOfCars < carArray.length) {
			this.carArray[numberOfCars++] = car;
			return true;
		} else {
			System.out.println("Can not add car!");
			return false;
		}
	}

	Car getNextCar() {
		if( )
	}
}
