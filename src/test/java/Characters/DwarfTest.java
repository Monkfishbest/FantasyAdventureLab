package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    DwarfFighter dwarf;
    Enemies orge;

    @Before
    public void setUP(){
        dwarf = new DwarfFighter("Olfa", Weapon.BROADSWORD);
        orge = new Enemies(50, 13, "NellDale Orge");
    }
    @Test
    public void canAttack(){
        dwarf.attack(orge);
        assertEquals(40, orge.getHP());
    }

}
