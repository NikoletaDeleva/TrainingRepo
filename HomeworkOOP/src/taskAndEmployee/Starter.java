package taskAndEmployee;

public class Starter {
	public static void main(String[] args) {
		Employee petko = new Employee("Petko");
		
		Task doeneNaKravi = new Task();
		
		doeneNaKravi.setNameOfWork("Doene na kravi");
		
		petko.setCurrentTask(doeneNaKravi);
		doeneNaKravi.setWorkingHours(8);
		petko.setHoursLeft(9);
		petko.work();
		
		petko.showReport();
		
		
		
	}
}
