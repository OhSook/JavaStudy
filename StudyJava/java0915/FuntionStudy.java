package java0915;

public class FuntionStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1, b = 3;
		System.out.println(twoSum(a,b));
		
		// twoSum(a,b); // 바로 메소드에서 print 해줌 
		
	}
	
	/// 두 수의 합 ///
	static int twoSum(int x, int y) {
		int result =  x+y;
		return result; // return
		// System.out.println(result); // return 안 하고 바로 출력하려면 void를 써야함 
	}
	
	
}

/*  객체 지향 프로그래밍
 *  프로그래밍의 궁극적인 목표 : 쉽게 쓰자 ! 코드의 단순화 
 * 	객체=사람(속성(필드=자료): 다리,팔 동작(함수=메소드): 걷다, 멈추다
	메소드(매개변수1,매개변수2)
	캡슐화 : 접근 제한자(public,private 등등)를 사용하여 캡슐화시킴
	상속 : 자식 클래스는 부모 클래스보다 기능이 좋아야 함 부모가 갖고 있는 필드와 메소드를 자식에게 물려주어 자식이 사용
	클래스 : 클래스 자체는 의미 X 하지만 객체를 찍어내는 틀 
 */
