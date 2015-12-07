package friday.todolist.tasks;

public class SleepTask extends Task {

	public SleepTask(int priority, float timeNeeded) {
		super(priority, timeNeeded);
	}

	@Override
	public String toString() {
		return "SleepTask [ time needed: "
				+ String.valueOf(super.getTimeNeeded()) + " priority: "
				+ super.getPriority() + " ]";
	}
}
