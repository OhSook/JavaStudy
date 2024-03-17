package java0915;

import java.util.Iterator;

public class Operation {
	
	 /* 
	    메서드  : 클래스 내에 선언된 함수 
	    구성요소 : 메소드의 이름, 파라미터, 리턴 타입
	    
	    
	    
	  */
	
	
	
	////// 메소드 정의 팩토리얼
	int fac(int x) {
		int result = 1;
		for(int i = 1; i <= x; i++) {
			result *= i;
		}
		return result;
	}
	
	
	
	/////////////// 직사각형 메소드 
	int area(int x, int y) {
		
		int area_result = (x*y);
		return area_result;
	}
	
	///////////////// 삼각형
	float tri(float x, float y) {
		float tri_result = (float)(x*y)/2;
		
		return tri_result;
	}
	
	////////////////// 최대공약수
/*
	int[] maxx(int x, int y) {
		
		///// 두 수를 나눴을 때 나머지가 0이 되는 숫자
		//// 그 숫자들을 넣을 배열 ?... 어케 하누 
		///// x와 y 중 겹치는 거에서 max
		
		int xbox = 0;
		int ybox = 0;
		int[] xybox = null;
		int i;
		int j;
		
		int result = 0;
		for(i=0; i <= x &&; i++) {			
			if(x%i == 0) {
				xbox = i;
			} 
		}

		
	}
	
*/

	
	int max2(int x, int y) {
		
		int sm, la, i;
		// i를 같이 선언하면 for문에서 i값이 소멸되지 않고 저장되어 있음
		if(x > y) {
			sm = y;
			la = x;
		}else {
			sm = x;
			la = y;
		}
		
		for (i = sm; i > 0; i--) {
			if(la % i == 0 && sm % i ==0)
				break;
		}
		return i;
	}
	
	
	
	
	/////////// 최소공배수 
	int minn(int x, int y) {
		int a = x, b= y;
		
		while(true) {
			if(a==b)
				break;
			else if(a>b)
				b += y;
			else if(a<b)
				a += x;
	}
		return a;
}
	
	
	
	
	void minmax(String z) {
		
		String[] temp = z.split("\\D");
		
		int[] result = new int[temp.length]; 
		
		for(int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(temp[i]);
		}
		
		int max = result[0];
		int min = result[0];
		
		for(int i = 1; i < result.length; i++) {
			
			if(result[i]<min) {
				min = result[i];
//				System.out.println(min);
			}
			
			if(result[i]>max) {
				max = result[i];
				
			}
			
			
	
		
	}
		System.out.print("최대값은 : " + max + "최소값은 : " + min);
	
	
	
}
}