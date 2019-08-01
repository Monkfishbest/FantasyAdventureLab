public abstract class Character {
    private String name;
    private int HealthPoints;
    private String weapon;
    private int inventory;

    public Character(String name, int healthPoints, String weapon) {
        this.name = name;
        HealthPoints = healthPoints;
        this.weapon = weapon;
        this.inventory = 0;
    }
}
