/* /**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Assignment: 4
 *  Signed: Kunal Goyal <br />
 */


//package HW4;

import java.util.GregorianCalendar;

public class C9E5GregorianCalendar {
    
	public static void main(String[] args) {
		// An object of GregorianCalendar Class
		GregorianCalendar c = new GregorianCalendar();

		// Display the current year, month, and day
		System.out.print("\n The current year, month, and day of Gregorian Calendar in format mm/dd/yyyy: ");
		System.out.printf("%d/%d/%d%n", c.get(GregorianCalendar.MONTH) + 1, c.get(GregorianCalendar.DAY_OF_MONTH), c.get(GregorianCalendar.YEAR));

		// Set elapsed time since January 1, 1970 to 1234567898765L
		c.setTimeInMillis(1234567898765L);

		// Display the year, month and day after elapsed set
		System.out.print("\n Elapsed time since January 1, 1970 set to " +
			"1234567898765L in format mm/dd/yyyy: ");
		System.out.printf("%d/%d/%d", c.get(GregorianCalendar.MONTH) + 1, c.get(GregorianCalendar.DAY_OF_MONTH), c.get(GregorianCalendar.YEAR));
	}
}
