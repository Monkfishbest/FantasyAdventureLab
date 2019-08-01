package Characters;

import Enums.Weapon;

public abstract class Character {
    private String name;
    private int healthPoints;
    protected Weapon weapon;
    private int inventory;

    public Character(String name, int healthPoints, Weapon weapon) {
        this.name = name;
        healthPoints = healthPoints;
        this.weapon = weapon;
        this.inventory = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHealthPoints(int damage) {
        this.healthPoints -= damage;
    }

    public void increaseHealthPoints(int healing) {
        this.healthPoints += healing;
    }
}
