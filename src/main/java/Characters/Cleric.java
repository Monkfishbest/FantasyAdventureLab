package Characters;

import Enums.Healing;
import Enums.Weapon;
import interfaces.IAttack;

public class Cleric extends Character{
    private Healing healing;

    public Cleric(String name, Weapon weapon, Healing healing, int armor) {
        super(name, 100, weapon, armor);
        this.healing = healing;
    }

    public Healing getHealing() {
        return this.healing;
    }

    public void changeHealing(Healing healing) {
        this.healing = healing;
    }

    public void healOther(Character character) {
        character.increaseHealthPoints(healing.getHealing());
    }

    public void attack(IAttack enemy){
            int dmg = weapon.getDamage();
            enemy.reduceHP(dmg);
    }
}
