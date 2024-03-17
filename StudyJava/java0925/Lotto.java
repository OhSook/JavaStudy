package java0925;

import java.util.*;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		
		
		int a = random.nextInt(100); // 난수 생성할 수 있는 갯
		// System.out.println(a);
	
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(100);
			if(i != 0)
				for(int j = 0; j < i; j++)
					if(lotto[i] == lotto[j])
						i--;
		
			
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if(i != lotto.length-1)
				System.out.print(", ");
		}
		
		
		}

}

