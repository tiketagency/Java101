package wednesday.datetime.date;

import wednesday.datetime.enums.DayOfWeek;

public class Day {

	public static int elapsedDays() {
		long seconds = (DateConstants.MILLISECONDS_FROM_1970_to_2015 + DateConstants.MILLISECONDS) / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;
		days /= 10;
		days /= 10;
		return (int) days;
	}

	public static String getDayName() {
		return DayOfWeek.days()[DateConstants.CURRENT_DAY_FROM_WEEK].toString();
	}

	public static int getDayFromTheWeek() {
		int numberOfDays = elapsedDays();
		int day = 0;
		for (int i = 0; i <= numberOfDays; i++, day++) {
			if (day % 7 == 0) {
				day = 0;
			}
		}
		return day;
	}
}
