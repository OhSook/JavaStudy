package java0925;

public class GameMonster {

    protected String name;
    protected int health;
    protected int damage;


    public GameMonster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

	    
    public int takeDamage(int playerDamage) {
        int damageTaken = playerDamage;
        health -= damageTaken;
        if (health < 0) {
            health = 0;
        }
        return damageTaken;
    }
    
    public int getDamage() {
        return damage;
    }
}
