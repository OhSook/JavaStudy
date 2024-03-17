package QuizTest;

public class Test1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*     //////////////// * 출력 ////////////////

		for(int i = 0; i<4; i++) {

			for(int j = i; j >= 0; j--) 

				System.out.print(" ");

			

			for(int j = 0; j < (6-i)*2-2; j++) 

				System.out.print("*");

			System.out.println("");

			

		}

		

		for(int i = 4; i > 0; i--) {

			for(int j = 0; j < i; j++)

				System.out.print(" ");

			

			for(int j = 0; j < (6-i)*2; j++) 

				System.out.print("*");

			System.out.println("");

			}

*/

		

		

/*		////////////////// 구구단 ////////////////

		

		Scanner sc = new Scanner(System.in);

		

		System.out.print("몇 단: ");

		

		int dan = sc.nextInt();

		int result;

		int i;

		

		for(i = 1; i < 10; i++) {

			result = dan*i;

			

			System.out.println(dan+"X"+i+"="+result+"입니다.");	

		}

*/

		

		

		

		

/*		////// 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력하는 코드를 작성하시오. 단, x와 y는 10이하의 자연수이다.

		

		

		for(int i = 0; i <= 10; i++) {

			for(int j = 0; j <= 10; j++) {

				if((4*i)+(5*j) == 60) {

					System.out.println("("+i+","+j+")");

				}

			}

		}

*/

		

		

		

		

/*		////////// 주어진 배열 항목에서 최대값을 출력

		

		int[] array = {1,5,3,8,2};

		int max = 0;

		

		for(int i = 0; i < array.length; i++) {

			if(max<array[i]) {

				max = array[i];

			}

		}

		System.out.println("최댓값: "+max);

		

*/

		

		

		////////// 주어진 배열을 resultArray 이름의 배열로 복사한 후, 오름차순으로 정렬

	
		int[] array = {1,5,3,8,2};
		int[] resultArray = new int[array.length];


		for(int i = 0; i < array.length; i++) 
			resultArray[i] = array[i];

			// System.out.println(resultArray[i]);


		int arr;

		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(resultArray[i]>resultArray[j]) {
					arr = resultArray[i];
					resultArray[i] = resultArray[j];
					resultArray[j] = arr;

				}
			}

		}

		
		for(int i =0; i<array.length; i++) {
			System.out.print(resultArray[i]);

		}
		

		
		
/*

		/////////////////////// 마지막 풀이 ///////////
		
		for(int i= 0; i < array.length - 1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			

		}
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
			
			 */
			
			
	}

}
