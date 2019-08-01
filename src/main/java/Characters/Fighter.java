package Characters;

import Enums.Weapon;

public class Fighter extends Character {

    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints, weapon);

    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    

}
