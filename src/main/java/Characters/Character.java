package Characters;

import Enums.Weapons;

public abstract class Character {
    private String name;
    private int HealthPoints;
    protected Weapons weapon;
    private int inventory;

    public Character(String name, int healthPoints, Weapons weapon) {
        this.name = name;
        HealthPoints = healthPoints;
        this.weapon = weapon;
        this.inventory = 0;
    }
}
