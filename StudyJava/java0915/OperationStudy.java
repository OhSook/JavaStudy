package java0915;

import java.util.*;

/*
 * 숫자들을 입력 5,8,1,10,9
 * 최대값 
 * 최소값
 * 
 */

public class OperationStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Operation oper = new Operation(); // 객체 생성 new라는 생성자 사용 , 명시적으로 참조를 만듦
		System.out.print("1.팩토리얼\n2.사각형의 넓이\n3.삼각형의 넓이\n4.두 수의 최대공약수\n5.두 수의 최소공배수\n6.최대최소\n선택 : ");
		int op = sc.nextInt();
		
//		System.out.println(oper.fac(x));
		
		int x;
		int y;
		String z;
		
		switch(op) {
		case 1 :
			System.out.println("정수 하나를 입력하시오 : ");
			x = sc.nextInt();
			System.out.println(x + "! = " + oper.fac(x));
			break;
		case 2 :
			System.out.print("사각형의 가로 : ");
			x = sc.nextInt();
			System.out.print("사각형의 가로 : ");
			y = sc.nextInt();
			
			System.out.println("사각형의 넓이 : " + oper.area(x,y));
			break;
		case 3 :
			System.out.println("밑변의 길이 : ");
			x = sc.nextInt();
			System.out.println("높이의 길이 : ");
			y = sc.nextInt();
			
			System.out.println("삼각형의 넓이 : " + oper.tri(x,y));
			
		case 4 :
			System.out.println("첫 번째 정수 입력 : ");
			x = sc.nextInt();
			System.out.println("두 번째 정수 입력 : ");
			y = sc.nextInt();
			
			System.out.println("최대공약수: " + oper.max2(x,y));
			
		case 5 :
			System.out.println("첫 번째 정수 입력 : ");
			x = sc.nextInt();
			System.out.println("두 번째 정수 입력 : ");
			y = sc.nextInt();
			
			System.out.println("최소공배수: " + oper.minn(x,y));
			
		case 6 :
			System.out.print("숫자들을 입력 : ");
			
			z = new String(sc.next());
			
			oper.minmax(z);
			break;
		}

	}

}
