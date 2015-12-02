package friday;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.temporal.WeekFields;

import org.junit.Test;

/*
 * Friday Years

Have you every wondered how many fridays are there in one year?

The count can be 52 or 53, depending on the weeks of that year (leap or not) and the start of the year.

If an year contains 53 fridays, we call that "A Friday Year"

You are to implement a function, called friday_years(String start, String end), where start and end are integers, representing years.

The function should return the count of all friday years between [start, end]

Examples:

friday_years(1000, 2000) = 178
friday_years(1753, 2000) = 44
friday_years(1990, 2015) = 4

 */
public class Task35_FridayYear {
	@Test
	public void fridayYearsTest() {
		assertEquals(178, fridayYears(1000, 2000));
		assertEquals(44, fridayYears(1753, 2000));
		assertEquals(4, fridayYears(1990, 2015));
	}

	private static long getNumberOfWeeksInYear(LocalDate date) {
		LocalDate middleOfYear = date.withDayOfMonth(1).withMonth(6);
		return middleOfYear.range(WeekFields.ISO.weekOfWeekBasedYear()).getMaximum();
	}

	public static int fridayYears(int start, int end) {
		int count = 0;
		for (int year = start; year < end; year++) {
			long numberOfWeeks = getNumberOfWeeksInYear(LocalDate.of(year, 1, 1));
			if (numberOfWeeks != 52) {
				count++;
			}
		}
		return count;
	}
}
