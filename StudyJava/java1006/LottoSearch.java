package java1006;
import java.util.*;
import java.io.*;

public class LottoSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String input = new String();
		
		try {
			
			Reader rd = new FileReader("C:\\java\\lotto.csv");
			
			while(true) {
				int data = rd.read();
				if(data == -1)
					break;
				str += (char)data;
			}
								
			System.out.print(str);
			rd.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] strNum = str.split("\\D+");
		
		System.out.print("조회 :");
		int key = sc.nextInt();
		
		for(int i=0;i<7;i++) {
			if(i==0)
				System.out.print(strNum[strNum.length-(key*7)+i] + "당첨: ");
		
			else
				System.out.print(strNum[strNum.length-(key*7)+i] + " ");
		}
		
	}

}
