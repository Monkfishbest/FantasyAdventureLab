package Characters;

import Enums.Enemy;
import Enums.Spell;
import Enums.Weapon;
import Mobs.Summon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellCasterTest {
    private SpellCaster spellCaster;
    private Summon ogre;

    @Before
    public void setUp() {
        ogre = new Summon(Enemy.Ogre);
        spellCaster = new SpellCaster("Bob", Weapon.QUARTERSTAFF, Spell.FIREBALL, ogre);
    }

    @Test
    public void canGetSpell() {
        assertEquals(Spell.FIREBALL, spellCaster.getSpell());
    }

    @Test
    public void canGetSummon() {
        assertEquals(ogre, spellCaster.getSummon());
    }

    @Test
    public void canChangeSpell() {
        spellCaster.changeSpell(Spell.FIREBOLT);
        assertEquals(Spell.FIREBOLT, spellCaster.getSpell());
    }

    @Test
    public void canChangeSummon() {
        Summon orc = new Summon(Enemy.ORC);
        spellCaster.changeSummon(orc);
        assertEquals(orc, spellCaster.getSummon());
    }
}