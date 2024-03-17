package java1004;

// 규격만 정해놓음 인터페이스에서는
// 인터페이스에서 상수를 정의할 땐 알아서 static final이 설정됨
public interface InterfaceStudy {
	
	int MAX_WIND = 5;
	int MIN_WIND = 0;
	
	public void turnOn();
	public void turnOff();
	public void powerUp();
	public void powerDown();
	public void powerMax();
	public boolean getState();
	public void setState(boolean f);
	public void powerSet(int lev);

	// 
	default boolean airDirection(boolean flag) {
		if(flag) {
			System.out.println("회전 멈춥");
			flag = false;
			
		}else {
			System.out.println("회전 시작");
			flag = true;
		}
		
		return flag;
		
	}
	
	static void speakBook() {
		System.out.println("예약 기능 없음");
	}
	
}
