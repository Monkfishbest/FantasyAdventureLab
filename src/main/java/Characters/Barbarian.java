package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import interfaces.IAttack;

public class Barbarian extends Fighter {

    public Barbarian(String name, int healthPoints, Weapon weapon) {
        super(name, 120, weapon);
    }



    public void attack(IAttack enemy){
        int dmg = weapon.getDamage() * 3;
        enemy.reduceHP(dmg);
    }

}
