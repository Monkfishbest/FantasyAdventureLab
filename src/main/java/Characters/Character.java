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
        int totalDMG =  damage - this.armor;
        if(totalDMG > 0 ) {
            this.healthPoints -= totalDMG;
        }
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
//    need to add a choose action that is implmented in all the sub classes, just calls attack for spell caster and fighter 

}
