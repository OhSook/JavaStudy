package java1004;

public class Aircon implements InterfaceStudy {
	
	int powerLevel = 0;
	boolean directState = false;
	
	public void turnOn() {
		powerLevel = 1;
		System.out.println("에어컨을 켭니다.");
	}
	
	public void turnOff() {
		powerLevel = MIN_WIND;
		System.out.println("에어컨을 끕니다.");
		System.out.println("에어컨 세기: " + powerLevel + " ");
	}

	
	public void powerUp() {
		powerLevel++;
		System.out.println("에어컨 세기: " + powerLevel + " ");
		
	}

	
	public void powerDown() {
		powerLevel--;
		System.out.println("에어컨 세기: " + powerLevel + " ");
		
	}

	
	public void powerSet(int lev) {
		powerLevel = lev;
		
	}

	
	public void powerMax() {
		powerLevel = MAX_WIND;
		System.out.print("에어컨 세기: " + powerLevel + " ");
		System.out.println("에어컨 세기가 최대가 되었습니다.");
		
	}

	
	public boolean getState() {
		return directState;
	}
	
	public void setState(boolean f) {
		this.directState = f;
	}
}
