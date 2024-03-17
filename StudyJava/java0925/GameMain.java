package java0925;

import java.util.*;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in, "x-windows-949");
        System.out.println("======= 이름 입력 ========");
        String name = sc.next();
        GameHero player = new GameHero(name);
        GameBackground gameBackground = new GameBackground();
        int trapsFound = 0;

        while (true) {
            System.out.print("1. 앞 2. 오른 3. 왼 4. 뒤 : ");
            int moveDirection = sc.nextInt();
            player.move(moveDirection);

            // 플레이어가 함정을 발견한 경우
            if (gameBackground.isTrap(player.locationX, player.locationY)) {
                System.out.println("함정 발견!");
                trapsFound++;
                System.out.println("발견한 함정 수: " + trapsFound);
                player.takeDamage(10); // 함정에 걸렸을 때 체력 감소
                System.out.println("체력: " + player.getHealth());
            }
            // 플레이어가 출구에 도착한 경우
            else if (gameBackground.isExit(player.locationX, player.locationY)) {
                System.out.println("탈출 성공!");
                System.out.println("발견한 함정 수: " + trapsFound);
                break;
            }

            // 플레이어 주변에 몬스터가 있으면 알림
            if (gameBackground.isMonsterNear(player)) {
                System.out.println("근처에 몬스터가 있습니다!");
                int playerDamage = player.weapon.getDamage();
                int monsterDamageTaken = player.getMonster().takeDamage(playerDamage);
                player.takeDamage(monsterDamageTaken);
                System.out.println("플레이어가 몬스터를 공격하였습니다. 몬스터에게 입힌 데미지: " + monsterDamageTaken);
                System.out.println("플레이어 체력: " + player.getHealth());
                System.out.println("몬스터 체력: " + player.getMonster().getHealth());

                if (player.getMonster().getHealth() <= 0) {
                    System.out.println("몬스터를 무찌르셨습니다!");
                    player.setMonster(null); // 몬스터를 null로 설정하여 더 이상 전투하지 않음
                } else {
                    int monsterDamage = player.getMonster().getDamage();
                    int playerDamageTaken = player.takeDamage(monsterDamage);
                    System.out.println("몬스터가 플레이어를 공격하였습니다. 플레이어가 받은 데미지: " + playerDamageTaken);
                    System.out.println("플레이어 체력: " + player.getHealth());
                    System.out.println("몬스터 체력: " + player.getMonster().getHealth());

                    if (player.getHealth() <= 0) {
                        System.out.println("플레이어가 사망하였습니다. 게임 오버!");
                        break;
                    }
                }
            }

            player.showMap();
        }	
	/*	
		Scanner sc = new Scanner(System.in, "x-windows-949");
		System.out.println("======= 이름 입력 ========");
		String name = sc.next();
		GameHero gh = new GameHero(name);
		GameBackground gr = new GameBackground();
		int a = 0;
		
		while(true){
		System.out.print("1. 앞 2. 오른 3. 왼 4. 뒤 : ");	
		int x = sc.nextInt();
		gh.move(x);
		System.out.println("위치 ㅣ " + gh.getLocation());
		gh.showMap();
		

		
	
        if (gr.isTrap(gh.locationX, gh.locationY)) {
            System.out.println("함정 발견!");
            // 여기서 게임 오버 처리 등을 할 수 있습니다.
            a++;
            System.out.println("함정은 총 : " + a);
        	} else if (gr.ground[gh.locationY][gh.locationX] == 99) {
    			System.out.println("탈출 성공!");
    			System.out.println("함정은 총 : " + a);
    			break;
    		}

		}
		
		*/
	}
	
	
}