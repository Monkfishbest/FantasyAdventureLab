package Characters;

import Enums.Weapons;

public class Fighter extends Character {

    public Fighter(String name, int healthPoints, Weapons weapon) {
        super(name, healthPoints, weapon);

    }

    public void changeWeapon(Weapons weapon){
        this.weapon = weapon;
    }

    

}
