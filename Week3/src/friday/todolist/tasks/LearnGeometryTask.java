package friday.todolist.tasks;

public class LearnGeometryTask extends Task {
	

	public LearnGeometryTask(int priority, float timeNeeded) {
		super(priority, timeNeeded);
	}

	@Override
	public String toString() {
		return "LearnGeometryTask [ time needed: "
				+ String.valueOf(super.getTimeNeeded()) + " priority: "
				+ super.getPriority() + " ]";
	}
}
