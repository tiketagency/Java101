package friday.todolist.tasks;

public class StudyForAlgebraTask extends Task {
	

	public StudyForAlgebraTask(int priority, float timeNeeded) {
		super(priority, timeNeeded);
	}

	@Override
	public String toString() {
		return "StudyForAlgebraTask [ time needed: "
				+ String.valueOf(super.getTimeNeeded()) + " priority: "
				+ super.getPriority() + " ]";
	}
}
