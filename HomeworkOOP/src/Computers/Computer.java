package Computers;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		if(newOperationSystem != null) {
			this.operationSystem = newOperationSystem;
		}
	}
	
	void useMemory(double memory) {
		if(memory>=0) {
			if(memory>this.freeMemory) {
				System.out.println("Not enough free memory");
			}else {
				this.freeMemory-= memory;
			}
			
		}
	}
	
	void prinInfo() {
		System.out.println(year);
		System.out.println(price);
		System.out.println(isNotebook);
		System.out.println(hardDiskMemory);
		System.out.println(freeMemory);
		System.out.println(operationSystem);
			

	}
}
