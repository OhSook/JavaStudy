package java0918;

public class ClassStudy02 {
	
	// 필드 영역 
	int[] arr;

	
	// split으로 숫자 구분해서 arr에 넣는 생성자 
	public ClassStudy02(String inputData) {
		
		String[] split_Data = inputData.split("\\D+");
		this.arr = new int[split_Data.length]; // 배열 크기를 선언해줘야 값이 들어가기 때문에 선언해준다.  
		// 맨 앞은 공백이라 하나 빼고 크기 선언 이것도 앞에 숫자면 X 
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = Integer.parseInt(split_Data[i]); // 맨 앞 0은 빼고 앞에 바로 숫자면 해당 X				
		} 
		
	}
	
	
	// 메소드 생성
	int sum(int x, int y) {
		return x+y;
	}
	
	int sum(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) 
			sum+=values[i];
		return sum;
	}
	
	double sum(double ... values) {
		double sum = 0;
		for(int i = 0; i < values.length; i++) 
			sum+=values[i];
		return sum;
	}
	
	
}
	
	

