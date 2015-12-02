package wednesday.datetime.date;

public class DateConstants {
	public static final long MILLISECONDS_FROM_1970_to_2015 = 1420070400000L;
	public static final long MILLISECONDS = System.currentTimeMillis();
	public static final int CURRENT_DAY_FROM_WEEK = Day.getDayFromTheWeek();
	public static final int CURRENT_YEAR = (int) (1970 + (MILLISECONDS / 31536000000L));
	public static final int CURRENT_MONTH = Month.calculateMonth(CURRENT_YEAR, Day.elapsedDays());
	public static final int CURRENT_DAY_FROM_MONTH = Month.calculateDayInMonth(CURRENT_YEAR, Day.elapsedDays());
}
