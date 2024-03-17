package java0925;

import java.util.*;

public class GameBackground {

	
	static int[][] ground = new int[10][15];
    private boolean[][] monsterRooms = new boolean[10][15];
    private GameMonster[][] monsters = new GameMonster[10][15];
    
	Random random = new Random();
	
	public GameBackground() {
		// 출구
		this.ground[ground.length/2][ground[0].length - 1] = 99;
	
        // 함정 추가
        for (int i = 0; i < 20; i++) { // 예를 들어 10개의 함정을 추가하려면
            int x = random.nextInt(ground.length);
            int y = random.nextInt(ground[0].length);

            // 만약 해당 좌표에 이미 함정이 있다면 다시 랜덤 좌표를 선택
            while (ground[x][y] != 0) {
                x = random.nextInt(ground.length);
                y = random.nextInt(ground[0].length);
            }
        
            ground[x][y] = 1; // 함정을 추가
        }
        
            for (int i = 0; i < 5; i++) {
                int x = random.nextInt(ground.length);
                int y = random.nextInt(ground[0].length);

                while (ground[y][x] != 0 || monsterRooms[y][x]) {
                    x = random.nextInt(ground.length);
                    y = random.nextInt(ground[0].length);
                }

                ground[y][x] = 1;
                monsterRooms[y][x] = true;
                monsters[y][x] = new GameMonster("몬스터" + i, 50); // 몬스터 추가
            }
        }



	public boolean isMonsterNear(GameHero hero) {
	    int heroX = hero.locationX;
	    int heroY = hero.locationY;

	    for (int i = heroY - 1; i <= heroY + 1; i++) {
	        for (int j = heroX - 1; j <= heroX + 1; j++) {
	            if (i >= 0 && i < monsterRooms.length && j >= 0 && j < monsterRooms[0].length) {
	                if (monsterRooms[i][j]) {
	                    return true; // 근처에 몬스터가 있음
	                }
	            }
	        }
	    }

	    return false; // 근처에 몬스터가 없음
	}
	
	
    // 특정 좌표에 함정이 있는지 확인
    public boolean isTrap(int x, int y) {
        return ground[y][x] == 1;
    }

    // 특정 좌표가 출구인지 확인
    public boolean isExit(int x, int y) {
        return ground[y][x] == 99;
    }
}

