package Characters;

import Enums.Weapon;
import Mobs.Enemies;

public class Barbarian extends Fighter {

    public Barbarian(String name, int healthPoints, Weapon weapon) {
        super(name, 120, weapon);
    }

    public void attack(Enemies enemy){
        int dmg = weapon.getDamage() * 3;
        enemy.reduceHP(dmg);
    }

}
