package Characters;

import Enums.Weapon;
import interfaces.IAttack;

public abstract class Fighter extends Character implements IAttack {

    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);

    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    

}
