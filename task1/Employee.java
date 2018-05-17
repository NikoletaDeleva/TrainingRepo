package task1;
public class Employee {
	private static final float MIN_SALARY = 600.0f;
	private static final int MIN_AGE_FOR_WORK = 18;
	private static final int MIN_NAME_LENGTH = 2;
	private static int employeeNumber = 0;
	private String name;
	private byte age;
	private float salary;
	private final int id;
	private Department department;
	
	public Employee(String name, int age, float salary) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
		this.id = 1234 * (++employeeNumber);
	}
	
	public String getName() {
		return this.name;
	}

	private void setName(String name) {
		if(name != null && name.trim().length() > MIN_NAME_LENGTH) {
			this.name = name;
		}else {
			System.out.println("Invalid name");
		}
	}

	public byte getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age >= MIN_AGE_FOR_WORK && age < Byte.MAX_VALUE){
			this.age = (byte)age;
		}else {
			System.out.println("Invalid age.");
		}				
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		if(salary >= MIN_SALARY) {
			this.salary = salary;
		}else {
			System.out.println("Invalid salary.");
		}
	}

	public int getId() {
		return this.id;
	}


	public String getDepartmentName() {
		return this.department.getName();
	}

	public void setDepartment(Department department) {
		if(department != null) {
			this.department = department;
		}else {
			System.out.println("Invalid department.");
		}
	}
	
	
	@Override
	public String toString() {
		return "Employee: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nId: " + this.id + "\nDepartment: "
				+ this.getDepartmentName() + "\n---------------------------\n";
	}
	
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return (this.getName().hashCode() * this.getAge());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Employee) {
			Employee emp = (Employee)obj;
			if(this.getName().equals(emp.getName()) && this.getAge() == emp.getAge()) {
				return true;
			}
			return false;
		}
		return false;
	}
	public static float getMinSalary() {
		return MIN_SALARY;
	}

	public static int getMinAgeForWork() {
		return MIN_AGE_FOR_WORK;
	}

	public static int getMinNameLength() {
		return MIN_NAME_LENGTH;
	}
	
}
