package org.joonzis.ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11_Calendar_Date_SimpleDateFormat {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		Date now = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("a hh시 mm분 ss초");
		
		String today = sdf.format(now);
		
		System.out.println(today);
	}

}
