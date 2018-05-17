package task1;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Department implements Comparable<Object> {
	private String name;
	private List<Employee> employees = new LinkedList<Employee>();

	public Department(String name) {
		this.setName(name);
	}

	public void addEmployee(Employee employee) {
		if (employee != null) {
			if (!this.employees.contains(employee)) {
				this.employees.add(employee);
				employee.setDepartment(this);
				System.out.println(employee.getName() + " added to the " + this.getName() + " department.");
			} else {
				System.out.println("Employee already in department.");
			}
		} else {
			System.out.println("Cannot add employee.");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			this.name = "";
			System.out.println("Invalid department name.");
		}
	}

	public List<Employee> getListOfEmployees() {
		return Collections.unmodifiableList(this.employees);
	}


	@Override
	public int compareTo(Object o) {
		Department newDep;
		if (o instanceof Department) {
			newDep = (Department) o;
		} else {
			return 1;
		}

		return this.getName().compareTo(newDep.getName());
	}
}
