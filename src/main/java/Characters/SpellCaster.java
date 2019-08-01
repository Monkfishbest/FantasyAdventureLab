package Characters;

import Enums.Spell;
import Enums.Weapon;
import Mobs.Summon;
import interfaces.IAttack;

public class SpellCaster extends Character {
    protected Spell spell;
    private Summon summon;

    public SpellCaster(String name, Weapon weapon, Spell spell, Summon summon) {
        super(name, 50, weapon, 0);
        this.spell = spell;
        this.summon = summon;
    }

    public Spell getSpell() {
        return spell;
    }

    public Summon getSummon() {
        return summon;
    }

    public void changeSpell(Spell spell) {
        this.spell = spell;
    }

    public void changeSummon(Summon summon){
        this.summon = summon;
    }

    public void attack(IAttack enemy){
        int dmg = spell.getDamage();
        enemy.reduceHP(dmg);
    }
}
