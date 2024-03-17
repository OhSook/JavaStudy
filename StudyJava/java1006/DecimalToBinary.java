package java1006;
import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String dchar = "0123456789ABCDEF";
		System.out.print("입력할 수의 진법(2, 8, 16)을 입력 : ");
		int base = scan.nextInt();
		
		System.out.print("숫자를 입력 : ");
		String num = scan.next();
		int transNum = 0;
		int temp,temp2 = 0;
		
		for(int i=0;i < num.length();i++) {
			temp = 1;
			for(int j=0;j < num.length()-i-1;j++)
				temp *= base;
			for(int j=0;j < dchar.length();j++)
				if(num.charAt(i) == dchar.charAt(j))
					temp2 = j;
					
			transNum += temp2 * temp;
		}
		
		System.out.println(transNum);

		
		
		
	}

}
