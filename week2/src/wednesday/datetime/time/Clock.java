package wednesday.datetime.time;

import wednesday.datetime.date.DateConstants;

public class Clock {
	private int hour;
	private int minutes;
	private int seconds;

	public Clock(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public static Clock time() {
		long time = DateConstants.MILLISECONDS;
		time = (long) Math.floor(time / 1000);
		int seconds = (int) (time % 60);
		time = (long) Math.floor(time / 60);
		int minutes = (int) (time % 60);
		time = (long) Math.floor(time / 60);
		int hours = (int) (time % 24) + 2;
		if (hours >= 24) {
			hours -= 24;
		}
		return new Clock(hours, minutes, seconds);
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public String toString() {
		return new ClockFormat(hour, minutes, seconds).toString();
	}
}
