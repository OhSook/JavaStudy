package QuizTest;
import java.util.*;
import java.io.*;

public class MemoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in,"x-windows-949");
		Scanner sc2 = new Scanner(System.in,"x-windows-949");


		try {
			
			Writer wr = new FileWriter("C:/java/memo.txt", true);
			Reader rd = new FileReader("C:/java/memo.txt");
			BufferedReader br = new BufferedReader(rd);
			
			String memoWrite = "";
			String memoTitle = "";
			//String memoLine2 = br.readLine();
			boolean header = false;
			
			String bar = "---------------------";
			System.out.println(bar);
			System.out.println("       MEMO APP");
			System.out.println(bar);
			System.out.print("0.메뉴 조회\n1.메모 목록 조회\n2.메모 읽기\n3.메모 쓰기\n4.메모 삭제\n"+bar+"\n\n>>");
			
			int op = sc.nextInt();
			
			switch(op) {
			case 0:
				break;
			case 1:
				String memoLine;
				while((memoLine = br.readLine()) != null) {
					String[] parts = memoLine.split(",");
					int memoNumSearch = Integer.parseInt(parts[0]);
					String memoTitleSearch = parts[1];
					String memoStorySearch = parts[2];
					
					
					if(header==false) {
						System.out.println("======================");
						System.out.println("        # 메모 제목");
						System.out.println("======================");
						header = true;
					}
					
					System.out.println(memoNumSearch+"\t"+memoTitleSearch);
				
				}
				
				

				break;
			case 2: // 메모 읽기
				String memoLine2;


				System.out.print("검색하실 메모 번호 입력\n>>");
				int num = sc.nextInt();
				
				while((memoLine2 = br.readLine()) != null) {
					String[] parts = memoLine2.split(",");
					int memoNumSearch = Integer.parseInt(parts[0]);
					String memoTitleSearch = parts[1];
					String memoStorySearch = parts[2];
					
	
					
					if(header==false) {
						System.out.println("======================");
						
						header = true;
					}
					
	
					
	
					if(num == memoNumSearch) {

						System.out.println("제목: "+memoTitleSearch+"\n");
						
						System.out.println(memoStorySearch);
						System.out.println("======================");
					}
					
					
				}
				
				break;
			case 3: // 메모 쓰기
				int memoNum = 0;
				
				String memoLine3;
				// 이미 있는 메모의 가장 큰 번호를 찾습니다.
				while ((memoLine3 = br.readLine()) != null) {
				    String parts[] = memoLine3.split(",");
				    int existingMemoNum = Integer.parseInt(parts[0]);
				    if (existingMemoNum > memoNum) {
				        memoNum = existingMemoNum;
				    }
				}



				System.out.print("메모 제목:");
				memoTitle = sc.next();
				System.out.print("메모 내용 입력:");
				memoWrite = sc2.nextLine();

				// 새 메모를 추가할 때, 가장 큰 번호에 1을 더합니다.
				memoNum++;
				
				wr.write(memoNum + ",");
				wr.write(memoTitle + ",");
				wr.write(memoWrite + "\n");





//				}else if((memoLine2 = br.readLine()) == null) {
//					String parts[] = memoLine2.split(",");
//					memoNum = Integer.parseInt(parts[0]);
//					++memoNum;
//					wr.write(memoNum+",");
//					wr.write(memoTitle+",");
//					wr.write(memoWrite+"\n");
//				}
				

				
				wr.flush();
				wr.close();
				
				System.out.println("메모가 저장되었습니다.");

				break;
			case 4:
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
