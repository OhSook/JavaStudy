package java1005;
import java.util.*;

public class SumForN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("n: ");
		
		int n; 
		int i = 1;
		int sum = 0;
		n= sc.nextInt();
		
		do {
			sum += i;
			i++;
			
		}while(i<=n);
		
		System.out.println("1부터 n까지의 합: " + sum);
	}

}
