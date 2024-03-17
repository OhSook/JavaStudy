package study_gonu;

public class Study0919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// for문
		// i가 의미하는 것 : 배열을 순회하는 for문이다 보니 i는 배열의 인덱스값을 의미하게 된다.
		
		// 향상된 for문
		// i의 의미는 배열 안에 있는 각 요소를 나타낸다.

		
		// substring, indexof
		// 다음으로 주어지는 변수에 대해 다른 영어 글자들을 피해서 뒤에 위치한 주민번호의
		// 연도 부분만 가져오는 코드를 작성하세요.
		String jumin = "aswasdwqawdqweqaxcqwegtyjqweedasW981002-1234567";
		
		int idx = jumin.indexOf("W");
		System.out.println(jumin.substring(idx+1, idx+3));
		
		
		// Class 
		// 필드 : 클래스 내부에서 사용할 변수들을 지정하는 구역
		// static / instance
		// instance : 객체 의존 멤버 객체가 사라지면 사라짐
		// static : 클래스가 사라지지 않는 이상 사용 가능 
		
		// 클래스명 객체명 = new 클래스명(인자값);
		// 메소드나 필드에 있는 값들에 접근하려 한다면 
		// 객체명.메소드이름(인자값);
		// 객체명.필드변수이름;  -> 필드변수에 접근 
		
		
		
	}

}
