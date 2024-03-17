package java0925;

public abstract class Phone {
	// 추상클래스: 객체를 생성하지 않고 자식 클래스들만 사용 
	
	String owner;
	Phone(String owner) {
		this.owner = owner;
	}
	
	void turnOn() {
		
		System.out.println("폰 전원을 켠다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끈다.");
		
	}
}

