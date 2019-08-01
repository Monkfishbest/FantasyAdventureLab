package Characters;

import Enums.Spell;
import Enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellCasterTest {
    private SpellCaster spellCaster;

    @Before
    public void setUp() {
        spellCaster = new SpellCaster("Bob", Weapon.QUARTERSTAFF, Spell.FIREBALL, "Ogre");
    }

    @Test
    public void canChangeSpell() {
        spellCaster.changeSpell(Spell.FIREBOLT);
        assertEquals(Spell.FIREBOLT, spellCaster.getSpell());
    }

    @Test
    public void canChangeSummon() {
    }
}