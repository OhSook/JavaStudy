package java0918;

public class StaticStudy02 {
	
	// 객체가 메모리상에서 사라지지 않음 
	static int count = 0;
	static int plusCount = 0;
	int x;
	int y;
	
	StaticStudy02(int x, int y){
		count++;
		this.x = x;
		this.y = y;	
	}
	
	int sum() {
		plusCount++;
		return x+y;
	}
	
	
}
