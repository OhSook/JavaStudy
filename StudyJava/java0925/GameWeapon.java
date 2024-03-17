package java0925;

public class GameWeapon {

    protected String name;
    protected int damage;

    public static final GameWeapon KNIFE = new GameWeapon("칼", 20);
    public static final GameWeapon HAMMER = new GameWeapon("망치", 30);
    public static final GameWeapon WAND = new GameWeapon("완드", 25);

    private GameWeapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
    
}
