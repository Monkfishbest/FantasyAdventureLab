package Characters;

import Enums.Enemy;
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
        orge = new Enemies(Enemy.Ogre);
    }
    @Test
    public void canAttack(){
        dwarf.attack(orge);
        assertEquals(20, orge.getHP());
    }

}
