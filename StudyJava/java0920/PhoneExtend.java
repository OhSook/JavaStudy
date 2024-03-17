package java0920;


// 옛날 전화기

public class PhoneExtend {

	public String model;
	public String color;
	
	public void bell() {
		System.out.println("벨이 울린다, ");
	}
	
	public void sendVol(String message) {
	System.out.println("본인 : " + message);
	}
	
	public void receiveVol(String message) {
		System.out.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊는다");
	}
	
	
	
}