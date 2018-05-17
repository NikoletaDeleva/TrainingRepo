package task1;

public class Demo {

	public static void main(String[] args) {
		Company ikea = new Company("IKEA");
		Department dostavki = new Department("Dostavki");
		Department it = new Department("IT");
		Department marketing = new Department("Marketing");
		Department gotvachi = new Department("Gotvachi");
		Department maistori = new Department("Maistori");
		
		ikea.hireEmployee(dostavki, new Employee("Ivan Stankov", 32, 750.0f));
		ikea.hireEmployee(dostavki, new Employee("Milen Krystev", 34, 750.0f));
		ikea.hireEmployee(dostavki, new Employee("Mihail Grozdev", 25, 750.0f));
		ikea.hireEmployee(it, new Employee("Svetlin Nakov", 32, 4750.0f));
		ikea.hireEmployee(it, new Employee("John Atanasov", 114, 1750.0f));
		ikea.hireEmployee(it, new Employee("Steve Jobs", 57, 75000.0f));
		ikea.hireEmployee(marketing, new Employee("Marketing Marketingov", 29, 3000.0f));
		ikea.hireEmployee(marketing, new Employee("Srednostatisticheski idiot ot UNSS", 23, 650.0f));
		ikea.hireEmployee(marketing, new Employee("Bashmarketing Strategov", 80, 17500.0f));
		ikea.hireEmployee(gotvachi, new Employee("Baba Stefka", 67, 950.0f));
		ikea.hireEmployee(gotvachi, new Employee("Chef Manchev", 32, 750.0f));
		ikea.hireEmployee(gotvachi, new Employee("Lelq Vanche", 53, 1050.0f));
		ikea.hireEmployee(maistori, new Employee("Bai Ivan", 63, 1000.33f));
		ikea.hireEmployee(maistori, new Employee("Chicho Gosho", 47, 1328.47f));
		ikea.hireEmployee(dostavki, new Employee("Stanoy Debeliq", 37, 750.0f));
		ikea.hireEmployee(dostavki, new Employee("Stefcho chiraka", 18, 650.0f));
		ikea.hireEmployee(marketing, new Employee("Stefcho chiraka", 18, 650.0f));
//		ikea.listEmployee();
//		
//		ikea.sortAndDisplayEmployeesBy(SortCriteria.NAME);
//		ikea.sortAndDisplayEmployeesBy(SortCriteria.AGE);
//		ikea.sortAndDisplayEmployeesBy(SortCriteria.SALARY);
		
//		System.out.println(ikea.getAllEmployeesSortedByName().toString());
		System.out.println(ikea.getAllUniqueEmployees().toString());
	}

}
