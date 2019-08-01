package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import interfaces.IAttack;

public class Knight extends Fighter  {

    public Knight(String name,  Weapon weapon) {
        super(name, 100, weapon);
    }

    public void attack(IAttack enemy){
        int dmg = weapon.getDamage();
        enemy.reduceHP(dmg);
    }

}
