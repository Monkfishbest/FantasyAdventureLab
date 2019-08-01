package Characters;

import Enums.Weapon;
import Mobs.Enemies;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Enemies rat;


    @Before
    public void setUP(){
        knight = new Knight("Dave", Weapon.BROADSWORD);
        rat = new Enemies(20,2,"Rat");
    }
    @Test
    public void canAttack(){
        knight.attack(rat);
        assertEquals(15,rat.getHP());
    }

}
