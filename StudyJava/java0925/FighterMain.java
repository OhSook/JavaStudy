package java0925;

public class FighterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모 클래스 하나 정의해놓고 다 상속 받아서 쓰면 클래스마다 생성하지 않고 계속 불러다 쓸 수 있음
		
		Fighter fighter = new Fighter();
		
		Sword sword = new Sword();
		fighter.fight(sword);

		Gun gun = new Gun();
		fighter.fight(gun);
		
	}

}
