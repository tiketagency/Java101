package wednesday.datetime.time;

import wednesday.datetime.date.DateConstants;
import wednesday.datetime.date.Day;
import wednesday.datetime.date.Month;

public class Time {

	protected int hours;
	protected int minutes;
	protected int seconds;
	protected int day;
	protected int month;
	protected int year;
	protected String dayName;
	protected String monthName;

	public Time(int hours, int minutes, int seconds, int day, int month, int year, String dayName, String monthName) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.day = day;
		this.month = month;
		this.year = year;
		this.dayName = dayName;
		this.monthName = monthName;
	}

	public static Time now() {
		Clock clock = Clock.time();
		int hour = clock.getHour();
		int minutes = clock.getMinutes();
		int seconds = clock.getSeconds();
		int day = DateConstants.CURRENT_DAY_FROM_MONTH;
		int month = DateConstants.CURRENT_MONTH;
		int year = DateConstants.CURRENT_YEAR;
		String dayName = Day.getDayName();
		String monthName = Month.getMonthName();
		return new Time(hour, minutes, seconds, day, month, year, dayName, monthName);
	}

	@Override
	public String toString() {
		if (minutes < 10) {
			if (seconds < 10) {
				return String.format("Time: %d:0%d:0%d Date: %d.%d.%d %s %s", hours, minutes, seconds, day, month, year,
						dayName, monthName);
			}
			return String.format("Time: %d:0%d:%d Date: %d.%d.%d %s %s", hours, minutes, seconds, day, month, year,
					dayName, monthName);
		}
		if (seconds < 10) {
			if (minutes < 10) {
				return String.format("Time: %d:0%d:0%d Date: %d.%d.%d %s %s", hours, minutes, seconds, day, month, year,
						dayName, monthName);
			}
			return String.format("Time: %d:%d:0%d Date: %d.%d.%d %s %s", hours, minutes, seconds, day, month, year,
					dayName, monthName);
		}

		return String.format("Time: %d:%d:%d Date: %d.%d.%d %s %s", hours, minutes, seconds, day, month, year, dayName,
				monthName);

	}

}
