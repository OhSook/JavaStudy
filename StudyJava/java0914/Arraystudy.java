package java0914;

public class Arraystudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		// 배열 생성
		// 배열은 객체 자료형 -> 선언을 하고나서 갖고있는 값은 값이 아니라 참조임(주소임) 
		
//		int[] a; 
//		a = new int[] {1,2,3};
//		int b[] = new int[] {1,2,3};
//		int[] c;
//		c = a;
//		
//		if(c==a)
//			System.out.println("같다");
//		else
//			System.out.println("다르다"); // 참조가 달라서 다르다고 함
//			
//		
//		c[1] = 5;
//		System.out.println(a[1]);
//		
		
		
//		String a = "하이이";
//		
//		a.length();
//		System.out.println(a);
//		
//		int[] intArray = null;
//		intArray[0] = 0; 에러남 참조값(래퍼런스)이 비어있어서 
		
//		에러남 마찬가지 ㅇㅇ
//		String str = null;
//		System.out.println(str.length());
		
		
		////// String 참조 /////////
		
		String a = "응애";
		String b = "응애";
		
		if(a==b) {
			System.out.println("참조 같음");
		}else {
			System.out.println("다름");
		}
		
		/// 값을 비교 메소드를 비교
		
		if(a.equals(b)) {
			System.out.println("값이 같음");
		}else {
			System.out.println("값이 다름");
				}
		
		///////////// 값을 변경
		
		System.out.println(a);
		b = "ㅇㅅㅇ";
		System.out.println(b);

		if(a==b) {
			System.out.println("참조 같음");
		}else {
			System.out.println("다름");
		}
		
		///////// new 생성자를 이용하면 참조가 다름 ( 이렇게 해라잇 ) 
		
		String c = new String("ㅇㅂㅇ");
		String d = new String("ㅇㅂㅇ");
		
		if(a==b) {
			System.out.println("참조 같음");
		}else {
			System.out.println("다름");
		}
		
		
		 
	
		
	}

}
