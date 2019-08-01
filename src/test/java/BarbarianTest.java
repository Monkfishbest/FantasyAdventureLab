import Characters.Barbarian;
import Enums.Weapon;
import Mobs.Enemies;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barb;
    Enemies orc;

    @Before
    public void setUP(){
        barb = new Barbarian("Olaf", 105, Weapon.BROADSWORD);
        orc = new Enemies(60, 30, "Black pit orc");
    }
    @Test
    public void canAttack(){
        barb.attack(orc);
        assertEquals(45,orc.getHP() );
    }
}
