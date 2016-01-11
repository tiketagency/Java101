package wednesday.datetime;

import wednesday.datetime.date.DateConstants;
import wednesday.datetime.date.Day;
import wednesday.datetime.date.Month;
import wednesday.datetime.time.Clock;
import wednesday.datetime.time.Time;

public class Main {
	public static void main(String[] args) {
		// Time time = new Time(12, 11, 50, 01, 2, 2015);
		// System.out.println(time);
		System.out.printf("Days from 01 January 2015 to %d %s %d are %d%n", DateConstants.CURRENT_DAY_FROM_MONTH,
				Month.getMonthName(), DateConstants.CURRENT_YEAR, Day.elapsedDays());
		System.out.println("Current month is: " + Month.getMonthName());
		System.out.println("Current day is: " + Day.getDayName());
		System.out.println("Current time is: " + Clock.time());
		System.out.println(Time.now());
	}
}
