package friday.todolist.tasks;

public abstract class Task {
	protected float timeNeeded;
	protected int priority;
	private boolean finished;
	private boolean canceled;

	public Task(int priority, float timeNeeded) {
		this.priority = priority;
		this.timeNeeded = timeNeeded;
	}

	public float getTimeNeeded() {
		return timeNeeded;
	}

	public void setTimeNeeded(float timeNeeded) {
		this.timeNeeded = timeNeeded;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}
}
