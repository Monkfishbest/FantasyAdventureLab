package Characters;

import Enums.Weapon;

public abstract class Character {
    private String name;
    private int HealthPoints;
    protected Weapon weapon;
    private int inventory;

    public Character(String name, int healthPoints, Weapon weapon) {
        this.name = name;
        HealthPoints = healthPoints;
        this.weapon = weapon;
        this.inventory = 0;
    }

    public int getHealthPoints() {
        return HealthPoints;
    }
}
