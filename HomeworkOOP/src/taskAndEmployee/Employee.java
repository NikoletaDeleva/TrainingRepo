
package taskAndEmployee;

public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;

	Employee(String name) {
		this.setName(name);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}

	}

	public Task getCurrentTask() {
		return this.currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if(currentTask != null) {
			this.currentTask = currentTask;
		}else {
			System.out.println("No task to do! Set valid task!");
		}
	}

	public double getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Invalid hours assigned!");
		}
	}

	public void work() {
		if (this.getCurrentTask() != null) {
			if (this.getHoursLeft() > 0 && this.getCurrentTask().getWorkingHours() > 0) {
				if (this.getCurrentTask().getWorkingHours() >= this.getHoursLeft()) {
					this.getCurrentTask()
							.setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
					this.setHoursLeft(0);
				}else {
					this.setHoursLeft(this.getHoursLeft()-this.getCurrentTask().getWorkingHours());
					this.getCurrentTask().setWorkingHours(0.0);
					this.setCurrentTask(null);
				}
			}else {
				if(this.getCurrentTask().getWorkingHours() <= 0) {
					System.out.println("Task is completed!");
				}else {
					System.out.println("Employee has finished work!");
				}
			}
		}else{
			System.out.println("No task!");
		}
		
	}
	
	public void showReport() {
		
		
		System.out.println("Employee name: " + this.getName());
		
		System.out.println("Employee task: " + this.getCurrentTask().getNameOfWork());
		System.out.println("Employee has: " + this.getHoursLeft() + " hours.");
		System.out.println("Work has: " + this.getCurrentTask().getWorkingHours() + " hours.");
	}

}
