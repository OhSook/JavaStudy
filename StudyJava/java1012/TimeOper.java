package java1012;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TimeOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now(); // 싱글톤 패턴 객체를 생성하지 않고 바로 부름
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재 시간: "+now.format(dtf));
		
		LocalDateTime ldt1 = now.plusYears(1); // 시간 계산 
		System.out.println("1년 더하기: "+ldt1.format(dtf));
		
		LocalDateTime ldt2 = now.minusMonths(4);
		System.out.println("4개월 빼기: "+ldt2.format(dtf));
		
		LocalDateTime ldt3 = now.minusDays(30);
		System.out.println("30일 빼기: "+ldt3.format(dtf));
		
		LocalDateTime birth = LocalDateTime.of(1999, 06, 02, 11, 0,0);
		
		System.out.println(birth.until(now, ChronoUnit.DAYS)+"일 생존"); // until은 계산해줌
		
		LocalDateTime result = birth.plusDays(10000);
		System.out.println(result.format(dtf));

	}

}
