package java0925;

import java.util.Random;

public class PhoneAbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Phone p = new Phone("홍길동"); // 이렇게 하면 객체를 만들 수 없음 ..,, 추상화>> 자식 클래스 사용해서 객체 생성 가능 
		
		SmartPhone sp = new SmartPhone("홍길동");
/*		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
*/				
		Random random = new Random();
		
		
		
		
		int a = random.nextInt(100); // 난수 생성할 수 있는 갯
		System.out.println(a);
	
		
		
		
		
	}

}
