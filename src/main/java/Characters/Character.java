package Characters;

import Enums.Weapon;
import interfaces.IAttack;

public abstract class Character implements IAttack {
    private String name;
    private int healthPoints, armor;
    protected Weapon weapon;
    private int inventory;

    public Character(String name, int healthPoints, Weapon weapon, int armor) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.inventory = 0;
        this.armor = armor;
    }

    public int getArmor() {
        return this.armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHP(int damage) {
        this.healthPoints -= damage;
    }

    protected void increaseHealthPoints(int healing) {
        this.healthPoints += healing;
    }

    public void addLoot(int loot) {
        this.inventory += loot;
    }

    public int getInventory() {
        return inventory;
    }


}
