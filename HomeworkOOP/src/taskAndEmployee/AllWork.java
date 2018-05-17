package taskAndEmployee;

public class AllWork {
	private static final int DEF_FREE_PLACES_FOR_TASK = 10;
	private static final int LAST_TASK_INDEX = 9;
	private Task[] task;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	private int index = 0;

	public AllWork() {
		this.freePlacesForTasks = AllWork.DEF_FREE_PLACES_FOR_TASK;
		this.currentUnassignedTask = 0;
		task = new Task[this.freePlacesForTasks];
	}

	public void addTask(Task task) {
		if (task != null && index < this.task.length) {
			this.task[index++] = task;
		} else {
			System.out.println("Error, no free places, or invalid task!");
		}
	}

	public Task getNextTask() {
		if (task[currentUnassignedTask] != null) {
			if (currentUnassignedTask != task.length - 1) {
				return this.task[currentUnassignedTask++];
			} else {
				this.currentUnassignedTask = 0;
				return this.task[LAST_TASK_INDEX];
			}
		}else {
			System.out.println("No current unassigned task!");
			return null;
		}
	}
	
	
}
