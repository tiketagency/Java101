package wednesday.datetime.date;

import wednesday.datetime.enums.Months;

public class Month {
	private static final int[] LEAP_YEAR = { 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 };

	private static boolean isLeap(int year) {
		return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
	}

	public static int calculateMonth(int year, int numOfDays) {
		if (isLeap(year)) {
			for (int i = 0; i < LEAP_YEAR.length; i++) {
				if (numOfDays <= LEAP_YEAR[i]) {
					return i + 1;
				}
			}
		}
		for (int i = 0; i < LEAP_YEAR.length; i++) {
			if (numOfDays <= LEAP_YEAR[i] - 1) {
				return i + 1;
			}
		}
		return 0;
	}

	public static int calculateDayInMonth(int year, int numOfDays) {
		int currentMonth = calculateMonth(year, numOfDays) - 1;
		int previousMonth = LEAP_YEAR[currentMonth - 1];
		return numOfDays - previousMonth;
	}

	public static String getMonthName() {
		int month = DateConstants.CURRENT_MONTH - 1;
		return Months.month()[month].toString();
	}
}
