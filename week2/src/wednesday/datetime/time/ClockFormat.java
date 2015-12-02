package wednesday.datetime.time;

public class ClockFormat extends Clock {

	public ClockFormat(int hour, int minutes, int seconds) {
		super(hour, minutes, seconds);
	}

	@Override
	public String toString() {
		if (getMinutes() < 10) {
			if (getSeconds() < 10) {
				return String.format("Time: %d:0%d:0%d", getHour(), getMinutes(), getSeconds());
			}
			return String.format("Time: %d:0%d:%d", getHour(), getMinutes(), getSeconds());
		}
		if (getSeconds() < 10) {
			if (getMinutes() < 10) {
				return String.format("Time: %d:0%d:0%d", getHour(), getMinutes(), getSeconds());
			}
			return String.format("Time: %d:%d:0%d", getHour(), getMinutes(), getSeconds());
		}

		return String.format("Time: %d:%d:%d", getHour(), getMinutes(), getSeconds());
	}
}
