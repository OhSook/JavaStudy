package java1004;

public class SamsaungTV implements TV{

	public void powerOn() {
		System.out.println("SamsungTV---전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
