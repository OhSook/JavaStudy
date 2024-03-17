package java1012;
import java.util.*;

public class CalenderStudyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR); // 상수 !!!!!!!!!!!!!!! 바로 끌어다 쓸 수 있음
		int month = now.get(Calendar.MONTH);
		int date = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "월";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "월";
			break;
		case Calendar.THURSDAY:
			strWeek = "월";
			break;
		case Calendar.FRIDAY:
			strWeek = "월";
			break;
		case Calendar.SATURDAY:
			strWeek = "월";
			break;
		case Calendar.SUNDAY:
			strWeek = "월";
			break;
		
			
		}
		
		int ampm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.print(date + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm+hour+"시"+minute+"분"+sec+"초");
		
		
	}

}
