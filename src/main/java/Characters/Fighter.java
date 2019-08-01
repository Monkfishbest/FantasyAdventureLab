package Characters;

import Enums.Weapon;
import interfaces.IAttack;

public abstract class Fighter extends Character  {

    public Fighter(String name, int healthPoints, Weapon weapon, int armor) {
        super(name, healthPoints, weapon, armor);

    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    

}
