package java1005;
import java.util.*;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		System.out.println("n: ");
		n = sc.nextInt();
		
		for(i = 2; i < n; i++) {
			int cnt = 0;
			for(int j = 1; j <= n; j++)
				if (i % j==0)
					cnt++;
				if (cnt == 2)
					System.out.println(i);
		}
	}

}
