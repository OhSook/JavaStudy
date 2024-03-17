package java0920;

public class PhoneCallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhoneChild sp = new SmartPhoneChild("갤럭시","실버");
		
		System.out.println("모델: " + sp.model + "\n색상: " + sp.color + "\n와이파이 상태: " + sp.wifi);
		
		// 부모 거 
		sp.bell();
		sp.sendVol("여보세여");
		sp.receiveVol("나다 ㅇㅅㅇ");
		sp.sendVol("방가");
		sp.hangUp();
		
		// 자기 거
		sp.setWifi(true);
	}

}
