package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Company {
	private static final byte NUBMER_OF_MONTHS = 12;
	private String name;
	private Map<Department, List<Employee>> employeesByDepartment;
	private List<Float> salaries = new ArrayList<Float>(NUBMER_OF_MONTHS);
	
	public Company(String name) {
		this.setName(name);
		this.employeesByDepartment = new TreeMap<Department, List<Employee>>();
	}

	public void hireEmployee(Department department, Employee employee) {
		if (department != null && employee != null) {
			if (this.employeesByDepartment.containsKey(department)) {
				department.addEmployee(employee);
			} else {
				department.addEmployee(employee);
				this.employeesByDepartment.put(department, department.getListOfEmployees());
			}
		} else {
			System.out.println("Null value in parenthesis.");
		}
	}
	
	//TODO:CHECK OTHER FUNCTIONS
	public void listEmployee() {
		for (Entry<Department, List<Employee>> entry : employeesByDepartment.entrySet()) {
			System.out.println("Department: " + entry.getKey().getName());
			System.out.println("------------------------------");
			for (Employee employee : entry.getValue()) {
				System.out.println("Employee: " + employee.getName());
				System.out.println("ID: " + employee.getId());
				System.out.println("---------------------------------");
			}
		}
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			System.out.println("Invalid company name.");
		}
	}

	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		public int compare(Employee employee1, Employee employee2) {
			return (int) (employee1.getSalary() - employee2.getSalary());
		};
	};
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getName().compareTo(employee2.getName());
		};
	};
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {
		public int compare(Employee employee1, Employee employee2) {
			if (employee1.getAge() == employee2.getAge()) {
				return employee1.getId() - employee2.getId();
			}
			return employee1.getAge() - employee2.getAge();
		};
	};

	public void sortAndDisplayEmployeesBy(SortCriteria sortBy) {
		switch (sortBy) {
		case AGE:
			System.out.println("Sorted by age");
			System.out.println("-----------------");
			sortByComparator(AgeComparator);
			break;
		case NAME:
			System.out.println("Sorted by name");
			System.out.println("-----------------");
			sortByComparator(NameComparator);
			break;
		default:
			System.out.println("Sorted by salary");
			System.out.println("-----------------");
			sortByComparator(SalaryComparator);
			break;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void sortByComparator(Comparator comp) {
		for (Entry<Department, List<Employee>> entry : employeesByDepartment.entrySet()) {
			System.out.println(entry.getKey().getName());
			List<Employee> sortedList = new ArrayList<Employee>();
			sortedList.addAll(entry.getValue());
			sortedList.sort(comp);
			System.out.println(sortedList.toString());
		}
	}
	
	private Map<Department, List<Employee>> getEmployeesByDepartment(){
		return Collections.unmodifiableMap(this.employeesByDepartment);
	}
	
	public List<Employee> getAllEmployeesSortedByName(){
		List<Employee> sortedEmployeesByName = new ArrayList<Employee>();
		
		for(Entry<Department, List<Employee>> entry : this.getEmployeesByDepartment().entrySet()) {
			sortedEmployeesByName.addAll(entry.getValue());
		}
		
		sortedEmployeesByName.sort(NameComparator);
		return sortedEmployeesByName;
	}
	
	public Set<Employee> getAllUniqueEmployees(){
		//DOES NOT REMOVE THE IDENTICAL ELEMENTS!!!
		Set<Employee> uniqueEmployeesSet = new HashSet<Employee>();
		
		for(Entry<Department, List<Employee>> entry : this.getEmployeesByDepartment().entrySet()) {
			uniqueEmployeesSet.addAll(entry.getValue());
		}
		
		return uniqueEmployeesSet;
	}
	
	public void setSalaryForMonth(int month, float salary) {
		if(month > 0 && month <= NUBMER_OF_MONTHS && salary >= Employee.getMinSalary()) {
			this.salaries.add(month, salary);
		}else {
			System.out.println("Invalid month or salary.");
		}
	}
	public void printSalariesPerMonth() {
		for(Float salary : salaries) {
			int month = 0;
			System.out.println(++month + " month: " + salary);
		}
	}
}

