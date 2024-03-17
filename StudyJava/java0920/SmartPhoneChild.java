package java0920;

public class SmartPhoneChild extends PhoneExtend {

	public boolean wifi;
	
	// 생성자
	public SmartPhoneChild(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
		
	}
	
	public void internet() {
		System.out.println("인터넷에 연결");
	}
	
}
