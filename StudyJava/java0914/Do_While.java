package java0914;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] args -> 파라미터
	
//		int i = 8;
//		do {

//			System.out.println("*");
//		}while(i<10);
//	
//		
		// 크리스마스 트리 만들기
		
		for(int i=6; i>0; i--) {
			for(int j=0; j<i; j++) 
				System.out.print(" ");
				
			for(int j=0; j<(6-i)*2+1; j++)
				System.out.print("*");
				
			System.out.println("");
			}
	
		
		
		
	}

}
