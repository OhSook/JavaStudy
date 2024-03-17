package java1010;

import java.util.Scanner;

public class TestPb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in,"x-windows-949");
		String filePath = "C:/java/phonebook2.txt";
		Test3rd data = new Test3rd(filePath);
		
		System.out.print("1. 입력\n2.데이터 출력\n\n>>");
		int op = scan.nextInt();
		String str;
		
		switch (op) {
		case 1 :
			System.out.print("이름 :");
			data.name = scan.next();
			System.out.print("전화번호 :");
			data.phoneNum = scan.next();
			System.out.print("주소 :");
			data.address = scan.next();
			data.writeData();
			System.out.println("입력완료!!!");
			break;
		case 2:
			System.out.print("이름\t\t전화번호\t\t\t주소\n");
			String outputData = data.readDate();
			
			String[] diskData = outputData.split("/");
			
			for(int i=0;i<diskData.length;i++) {
				String[] out = diskData[i].split(",");
				for(int j=0;j < out.length;j++) 
					System.out.print(out[j] + "\t\t"); 
				System.out.println();
			}
			
			break;
		}

	}

}
