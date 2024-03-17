package java1005;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		System.out.println("5개의 정수를 하나씩 입력하시오");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		// Max
		int max = num[0];
		int min = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max)
				max = num[i];
			// Min
			if(num[i] < min)
				min = num[i];
		}
		
		System.out.println("최댓값은: " + max);		
		System.out.println("최솟값은 : " + min);
		
	}

}
