package java0915;

/*  객체 지향 프로그래밍
 * 	String = 객체 자료형
 * 	객체=사람(속성(필드=자료): 다리,팔 동작(함수=메소드): 걷다, 멈추다
	메소드(매개변수1,매개변수2)
	캡슐화 : 접근 제한자(public,private 등등)를 사용하여 캡슐화시킴
	상속 : 자식 클래스는 부모 클래스보다 기능이 좋아야 함 부모가 갖고 있는 필드와 메소드를 자식에게 물려주어 자식이 사용
	클래스 : 클래스 자체는 의미 X 하지만 객체를 찍어내는 틀 
 */

class PersonInfo{
	//필드
	int age;
	String name;
	String phoneNum;
}

//////////////////////////////////// 필드로만 구성된 클래스를 불러옴 
public class ClassStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfo pi1 = new PersonInfo(); //// 객체를 찍어낸다 new라는 생성자를 사용해서 
		PersonInfo pi2 = new PersonInfo();
		
		BookInfo bi1 = new BookInfo();
		
		pi1.age = 1;
		pi1.name = "응애응";
		pi1.phoneNum = "010-3333-2222";
		
		pi2.age = 30;
		pi2.name = "바보바";
		pi2.phoneNum = "010-1111-2222";
		
		bi1.authorName = "응가뿡";
		bi1.bookName = "응가의 모험";
		bi1.price = 1000000;
		
		System.out.println("age: "+ pi1.age + " name: " + pi1.name + " pn: " + pi1.phoneNum);
		System.out.println("age: "+ pi2.age + " name: " + pi2.name + " pn: " + pi2.phoneNum);
		System.out.println("책이름: "+ bi1.bookName + ", 작가: " + bi1.authorName + ", 가격: " + bi1.price + "만 원 ");
		
	}

}
