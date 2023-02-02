package day7.keuboardAndMouseOps;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingDate {

	public static void main(String[] args) {
		// Date class will get you the current System date
		Date d1 = new Date();
		System.out.println("Actual date with formatting: " + d1);
		// SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat("dd MM yyyy");
		// with the help of SimpleDateFormat you can convert your date into required
		// format
		System.out.println("Date with required format: " + s.format(d1));
		System.out.println("***************************");
		System.out.println(getSystemDate("dd-MMM-yyyy"));
	}

	static String getSystemDate(String formatForDate) {
		// Date class will get you the current System date
		Date d1 = new Date();
		// SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat(formatForDate);
		return s.format(d1);
	}
}
