package java0918;

public class StaticStudy03 {
	////////// 정적 블록
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	/////////// 1회성 한 번만 실행 /////////
	static {
		info = company + " - " + "model";
	}
}
