package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import interfaces.IAttack;

public class DwarfFighter extends Character implements IAttack {

    public DwarfFighter(String name, Weapon weapon,int armor) {
        super(name, 75, weapon, armor);
    }

    public void attack(IAttack enemy){
        int dmg = weapon.getDamage() * 2;
        enemy.reduceHP(dmg);
    }

}
