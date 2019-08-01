package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import interfaces.IAttack;

public class DwarfFighter extends Character implements IAttack {

    public DwarfFighter(String name, Weapon weapon) {
        super(name, 75, weapon);
    }
    public void attack(Enemies enemy){
        int dmg = weapon.getDamage() * 2;
        enemy.reduceHP(dmg);
    }

}
