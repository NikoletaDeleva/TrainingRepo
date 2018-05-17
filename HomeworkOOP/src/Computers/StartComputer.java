package Computers;

public class StartComputer {
	public static void main(String[] args) {
		Computer first = new Computer();
		
		first.year = 2016;
		first.price = 1000;
		first.hardDiskMemory = 400;
		first.freeMemory = 100;
		first.operationSystem = "Windows 8";
		first.isNotebook = false;
		
		Computer laptop = new Computer();
		
		laptop.year = 2018;
		laptop.price = 2000;
		laptop.freeMemory = 800;
		laptop.hardDiskMemory = 2000;
		laptop.isNotebook = true;
		laptop.operationSystem = "Linux";
		
		laptop.useMemory(900);
		first.changeOperationSystem("Windows 10");
		
		laptop.prinInfo();
		first.prinInfo();
		
		
	}
}
