package java0925;

public class GameHero {
	
	GameBackground ground = new GameBackground();
	 boolean isMonsterNear = ground.isMonsterNear(this);
	
	String name;
	protected int locationY = ground.ground.length / 2;
	protected int locationX = 0;
	protected int directionOfSight = 2; // 1: 12시,2:3시,3:6시,4:9시
	protected int level = 1;
	protected int experience = 0;
	protected int hp = 100;
    protected GameWeapon weapon;
    protected int health;
    
	public GameHero(String name) {
		this.name = name;
		System.out.println(this.name 
							+ "님이 입장하였습니다.[위치: " + getLocation() + "]\n>>");
        this.weapon = null; // 초기에는 무기 없음
        this.health = 100; // 초기 체력 설정
	}
	
	
	public void selectWeapon(GameWeapon weapon) {
	    this.weapon = weapon;
	    System.out.println(name + "님이 " + weapon.getName() + "을(를) 선택하였습니다.");
	}
    
    
	public String getLocation() {
		return "(" + String.valueOf(this.locationX) + ", "
				+String.valueOf(locationY) + ")";
	}
	
	public void move(int dir) {//1. 앞쪽 2. 오른쪽 3. 왼쪽 4. 뒤쪽
		switch (this.directionOfSight) {
		
		case 1 : //12시
			switch (dir) {
			case 1 :
				this.locationY--;
				break;
			case 2 :
				this.locationX++;
				this.directionOfSight = 2;
				break;
			case 3 :
				this.locationX--;
				this.directionOfSight = 4;
				break;
			case 4 :
				this.locationY++;
				this.directionOfSight = 3;
				break;
			}			
			break;
		case 2 : //3시
			switch (dir) {
			case 1 :
				this.locationX++;
				break;
			case 2 :
				this.locationY++;
				this.directionOfSight = 3;
				break;
			case 3 :
				this.locationY--;
				this.directionOfSight = 1;
				break;
			case 4 :
				this.locationX--;
				this.directionOfSight = 4;
				break;
			}			
			break;
		case 3 : //6시
			switch (dir) {
			case 1 :
				this.locationY++;
				break;
			case 2 :
				this.locationX--;
				this.directionOfSight = 4;
				break;
			case 3 :
				this.locationX++;
				this.directionOfSight = 2;
				break;
			case 4 :
				this.locationY--;
				this.directionOfSight = 1;
				break;
			}
			break;
		case 4 : //9시
			switch (dir) {
			case 1 :
				this.locationX--;
				break;
			case 2 :
				this.locationY--;
				this.directionOfSight = 1;
				break;
			case 3 :
				this.locationY++;
				this.directionOfSight = 3;
				break;
			case 4 :
				this.locationX++;
				this.directionOfSight =2;
				break;
			}
			break;
		}
	}
	
	public void showMap() {
		for(int i=0;i<ground.ground.length;i++) {
			for(int j=0;j<ground.ground[0].length;j++) {
				if(i == this.locationY && j == this.locationX)
					System.out.print("■");
				else if (ground.isTrap(j, i)) {
	                if (i == this.locationY && j == this.locationX) {
	                    System.out.print("X");
	                } else {
	                    System.out.print("□");
	                }
				}
				else
					System.out.print("□");
			}
			System.out.println();
		}
		
	     if (isMonsterNear) {
	            System.out.print(" (근처에 몬스터가 있습니다!)");
	        }

	        System.out.println();
				
	}
		
}
