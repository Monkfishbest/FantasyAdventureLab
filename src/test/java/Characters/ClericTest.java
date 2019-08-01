package Characters;

import Enums.Healing;
import Enums.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {
    private Cleric cleric;
    @Before
    public void setUp() {
        cleric = new Cleric("James", Weapon.SHORTSWORD, Healing.HEALINGWORD, 2);
    }

    @Test
    public void getHealing() {
        assertEquals(Healing.HEALINGWORD, cleric.getHealing());
    }

    @Test
    public void changeHealing() {
        cleric.changeHealing(Healing.POTIONOFHEALING);
        assertEquals(Healing.POTIONOFHEALING, cleric.getHealing());
    }

    @Test
    public void healOther() {
        cleric.reduceHP(5);
        assertEquals(97, cleric.getHealthPoints());
        cleric.healOther(cleric);
        assertEquals(102, cleric.getHealthPoints());
    }
}