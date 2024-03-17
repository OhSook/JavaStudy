package QuizTest;
import java.io.*;
import java.util.*;
import java1010.*;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in,"x-windows-949");
		String name = new String();
		String phone = new String();
		String add = new String();
		String str = new String();
	
		
		
		int op;
		int del;
		
		try {
			
			Writer wr = new FileWriter("C:/java/phonebook.txt", true);
			Reader rd = new FileReader("C:/java/phonebook.txt");
			Test3rd test3rd = new Test3rd("C:/java/phonebook.txt");
            BufferedReader br = new BufferedReader(rd);

			System.out.println("메뉴를 선택하세요.");
			System.out.println("---------------");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 조회");
			System.out.println("3. 데이터 삭제");
			System.out.println("4. 데이터 수정");
			System.out.println("---------------");
			System.out.print("선택 : ");
			int input = sc.nextInt();
			
			
			switch(input) {
			
			case 1:
				
				System.out.print("이름: ");
				name = sc.next();
				System.out.println("전화번호: ");
				phone = sc.next();
				System.out.println("주소: ");
				add = sc.next();
				System.out.println("입력 완료!!");
				
				wr.write(name+",");
				wr.write(phone+",");
				wr.write(add+"\n");
				
				wr.flush();
				wr.close();
				
				break;
			case 2:
				System.out.println("-----------------------------------------");
				System.out.println("이름\t전화번호\t\t주소");
				System.out.println("-----------------------------------------");

				while(true) {
					int data = rd.read();
					if(data == -1)
						break;
					str += (char)data;
				}
			
	
				String strNum = str.replaceAll(",", "\t");
				System.out.println(strNum);
				
				String[] strCnt = str.split("\\n");
				
				int sum = 0;

				for(int i=0; i<strCnt.length;i++) {
					sum += 1;
				}System.out.println(sum+"개의 자료를 출력했습니다.");
				
				break;
				
			case 3:
				
				 System.out.println("삭제하실 사람의 이름을 입력하세요.");
                 String nameToDelete = sc.next();
                 boolean found = false;
                 List<String> linesToKeep = new ArrayList<>();
                 String line;
                 while ((line = br.readLine()) != null) {
                     String[] data = line.split(",");
                     if (!data[0].equals(nameToDelete)) {
                         linesToKeep.add(line);
                     } else {
                         found = true;
                     }
                 }
                 br.close();

                 if (found) {
                     // 파일을 다시 쓰고 해당 이름을 가진 행을 제외한 내용으로 덮어쓰기
                     FileWriter fileWriter = new FileWriter("C:/java/phonebook.txt");
                     for (String lineToKeep : linesToKeep) {
                         fileWriter.write(lineToKeep + "\n");
                     }
                     fileWriter.close();
                     System.out.println(nameToDelete + "의 정보가 삭제되었습니다.");
                 } else {
                     System.out.println(nameToDelete + "을(를) 찾을 수 없습니다.");
                 }
                 break;
                 
			case 4:
			    // Test3rd 클래스를 사용하여 데이터 수정
			    System.out.print("수정할 데이터 이름 : ");
			    String nameToFind = sc.next();
			    System.out.print("수정할 속성 선택\n1. 이름 2. 전화번호 3. 주소\n>>");
			    op = sc.nextInt();

			    
			    // Test3rd 클래스를 사용하여 데이터 수정
			    test3rd.modData(nameToFind, op);
                
                break;
					
			}
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
