package Characters;

import Enums.Spell;
import Enums.Weapon;

public class SpellCaster extends Character {
    protected Spell spell;
    private String summon;

    public SpellCaster(String name, Weapon weapon, Spell spell, String summon) {
        super(name, 50, weapon);
        this.spell = spell;
        this.summon = summon;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }

    public void changeSummon(String summon){
        this.summon = summon;
    }
}
