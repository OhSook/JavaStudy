package java1012;
import java.util.*;

import java1010.Test3rd;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class PocketMoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in,"x-windows-949");

		try {
			
			Writer wr = new FileWriter("C:/java/pocketmoney.txt", true);
			Reader rd = new FileReader("C:/java/pocketmoney.txt");
			Test3rd test3rd = new Test3rd("C:/java/pocketmoney.txt");
            BufferedReader br = new BufferedReader(rd);
			LocalDateTime now = LocalDateTime.now(); // 싱글톤 패턴 객체를 생성하지 않고 바로 부름
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			
			String bar = "---------------------";
			System.out.println(bar);
			System.out.println("       용돈기입장");
			System.out.println(bar);
			System.out.print("1.용돈 출납 내역\n2.수입내역 등록\n3.지출내역 등록\n4.내역 수정\n"+bar+"\n\n>>");
			
			int op = sc.nextInt();
			String pocketIncome = "";
			String pocketExpend = "";
			int expendMoney;
			int incomeMoney;
	        int totalIncome = 0;
	        int totalExpense = 0;
	        // 수입/지출 금액 헤더를 한 번만 표시하기 위한 변수
	        boolean headerDisplayed = false;
	        
			switch(op) {
			case 1:
				
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    String date = parts[0];
                    String type = parts[1];
                    String description = parts[2];
                    int amount = Integer.parseInt(parts[3]);

                    if(headerDisplayed==false) {
                    	System.out.println("=============================================");
                    	System.out.println("날짜\t\t수입/지출\t\t금액");
                    	System.out.println("=============================================");

                    	headerDisplayed = true;
                    	
                    }
                    
                    if (type.equals("수입")) {
                    	totalIncome += amount;
                        System.out.println(date+"\t"+description + "(수입)\t\t" + amount+"원");
                    } else if (type.equals("지출")) {
                        System.out.println(date+"\t"+description + "(지출)\t\t" + amount+"원");
                        totalExpense += amount;
                    }
                }

                rd.close();
				
                System.out.println("---------------------------------------------");
                System.out.println("총수입: "+ totalIncome + "원  총지출: "+ totalExpense +"원  잔액: "+(totalIncome-totalExpense)+"원");
            	//System.out.println("=============================================");
                System.out.println("---------------------------------------------");


				break;
				
			case 2:
								
				System.out.print("수입내역을 입력하세요.(ex: 용돈)\n>>");
				pocketIncome = sc.next();
				System.out.print("금액을 입력하세요.(ex: 10000)\n>>");
				incomeMoney = sc.nextInt();
				String date1 = now.format(dtf);

				wr.write(date1+",수입,"+pocketIncome+",");
				wr.write(incomeMoney+"\n");
				
				wr.flush();
				wr.close();
				
				break;
				
			case 3:
				
				System.out.print("지출내역을 입력하세요.(ex: 식비)\n>>");
				pocketExpend = sc.next();
				System.out.print("금액을 하나 씩 입력하세요.(ex: 20000)\n>>");
				expendMoney = sc.nextInt();
				String date2 = now.format(dtf);

				wr.write(date2+",지출,"+pocketExpend+",");
				wr.write(expendMoney+"\n");
				
				wr.flush();
				wr.close();
				
				
				break;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	

		}
	}

