package java0914;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////////////////////////////////////////배열을 입력 받음
		Scanner sc = new Scanner(System.in,"x-windows-949"); // Scanner 라는 class에서 sc 객체 생성 
		// sc.xxx -> 각종 메소드들 호출 
		
		System.out.println("배열을 입력하시오 {{},{}}를 사용하세요");
		String intData = sc.nextLine();
		
		System.out.println("배열을 입력하시오");
		String intData2 = sc.nextLine();
		
		/////////////////////////////// split을 이용하여 기호 뺴고 숫자만 가져오기 
		
		int[][] matrix = new int[2][2];
		int[][] matrix2 = new int[2][2];
		
		
		String[] temp = intData.split("\\D+");	// 키보드에서 입력 받은 거에서 숫자만 추출 \\D+
		// String 형으로 추출됨 [0]에선 그냥 비어있어서 [1]부터 시작
		String[] temp2 = intData2.split("\\D+");
		
		
		/////////////////////////////////////////////// 잘 입력됐나 확인
		for(int i=0;i<temp.length;i++) { 
			System.out.println(temp[i]);
			
		}
		for(int i=0; i<temp2.length; i++)
			System.out.println(temp2[i]);
		
		System.out.println();
		
		int z = 1;
		int t = 1;	
		
		////////////////////////////// 매트릭스에 입력 받고 스플릿 한 걸 넣고 있음 
		for(int i=0; i<matrix.length; i++) // String으로 된 걸 정수형으로 변환
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = Integer.parseInt(temp[z++]);
					}
		
		System.out.println();
		
		for(int i=0; i<matrix2.length; i++)
			for(int j=0; j<matrix2[i].length; j++) {
				matrix2[i][j] = Integer.parseInt(temp2[t++]);
			}
		
		System.out.println();
		
		
		/////////////////////////////////// 잘 들어갔는지 확인
		for(int i =0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		
		
		for(int i =0; i<matrix2.length; i++) {
			for(int j=0; j<matrix2[i].length; j++)
				
				System.out.print(matrix2[i][j]+"\t");
			System.out.println();		
		}
		
		
		
		////////////////////// 합하기 
		int[][] sum = new int[2][2];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				sum[i][j] = matrix[i][j] + matrix2[i][j];
		System.out.println("#####두 개를 합한 결과는####");	
			}
		}
			
		
		///////// 결과 출력
		for(int i =0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(sum[i][j]+"\t");
			System.out.println();	
		}
		
		
		
		
	}

}

// {{3,2},{5,7}} -> [3,2
//					 5,7]	

/*
 *  
 */
