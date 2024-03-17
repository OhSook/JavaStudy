package java1004;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceStudy elec;
		elec = new Fan();
		
		System.out.println("--------------- 선풍기 -----------------");
		elec.turnOn();
		
		elec.powerSet(3);
		elec.powerUp();
		elec.powerUp();
		elec.setState(elec.airDirection(elec.getState()));
		elec.setState(elec.airDirection(elec.getState()));
		InterfaceStudy.speakBook();
		elec.turnOff();
		
		System.out.println("--------------- 에어컨 -----------------");
		elec = new Aircon();
		
		elec.turnOn();
		
		elec.powerSet(1);
		elec.powerMax();
		elec.powerDown();
		elec.setState(elec.airDirection(elec.getState()));
		elec.setState(elec.airDirection(elec.getState()));
		elec.turnOff();
		
		
	}

}
