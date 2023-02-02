package day7.keuboardAndMouseOps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GettingDate2 {

	public static void main(String[] args) {
		//get Calendar class instance
		Calendar cal = Calendar.getInstance();
		//add number of days(+/-) based on your requirement
		cal.add(Calendar.YEAR, 2);		
		//Date class will get you the current System date
		Date d1=new Date(cal.getTimeInMillis());
		//SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
		//with the help of SimpleDateFormat you can convert your date into required format
		System.out.println(s.format(d1));
		System.out.println("************************");
		System.out.println(getSystemDate("dd-MMM-yyyy",-7));
	}
	static String getSystemDate(String formatForDate,int days) {
		//get Calendar class instance
		Calendar cal = Calendar.getInstance();
		//add number of days(+/-) based on your requirement
		cal.add(Calendar.DATE, days);		
		//Date class will get you the current System date
		Date d1=new Date(cal.getTimeInMillis());
		// SimpleDateFormat will help to get date in specific format
		SimpleDateFormat s = new SimpleDateFormat(formatForDate);
		return s.format(d1);
	}

}
