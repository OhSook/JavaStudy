package java0918;

public class StaticStudyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticStudy.pi = 4.31; // 바꿀 수도 있음 .. 객체들이 하나의 값을 고융할 수 있다. 
		double result = 10 * 10 * StaticStudy.pi; // 객체를 생성하지 않았는데도 호출 가능 
		// 원랜 new 라는 객체를 생성해서 사용해야 하는데 static으로 지정하면 바로 클래스 불러와서 사용 가능 
		
		System.out.println(result);
 	}

}
