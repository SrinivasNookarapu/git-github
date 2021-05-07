package com.training.collections.excersice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
	
	private static int compareTwoDates(Date date1, Date date2) {
		int result = -1;
		if(date1.after(date2)) {
			return 2;
		}
		else if(date1.before(date2)) {
			return 1;
		}
		else if(date1.equals(date2)) {
			return 0;
		}
		
		return result;
	}
	

	public static void main(String[] args) throws ParseException {
		String str = "";
		SimpleDateFormat sdfo = new SimpleDateFormat("dd-mm-yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Dates to compare");
		Date date1 = sdfo.parse(sc.next());
		Date date2 = sdfo.parse(sc.next());
		
		int res = compareTwoDates(date1, date2);
		if(res == -1) {
			str = "Dates are Null";
		}
		else if(res == 0) {

			str = "Both Dates Are Equal";
		}
		else if(res == 1) {
			str = "First date is befotre When compare to second";
		}
		else if(res == 2) {
			str = "First date is after When compare to second";
		}
		
		System.out.println(str);
		

	}

	

}
