package Characters;

import Enums.Weapon;

public class Cleric extends Character{
    private Healing healing;

    public Cleric(String name, Weapon weapon, Healing healing) {
        super(name, 100, weapon);
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
}
