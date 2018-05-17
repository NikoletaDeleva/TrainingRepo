package taskAndEmployee;

public class Task {
	private String nameOfWork;
	private double workingHours;

	Task() {
			this.nameOfWork = "Claening";
			this.workingHours = 8.0;
	}

	public String getNameOfWork() {
		return this.nameOfWork;
	}

	public void setNameOfWork(String nameOfWork) {
		if (nameOfWork != null) {
			this.nameOfWork = nameOfWork;
		}else {
			System.out.println("Invalid name of work!");
		}
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Invalid working hours!");
		}
	}

}
