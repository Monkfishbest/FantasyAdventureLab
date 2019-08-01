package Characters;

import Enums.Enemy;
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
        knight = new Knight("Dave", Weapon.BROADSWORD, 10);
        rat = new Enemies(Enemy.RAT);
    }
    @Test
    public void canAttack(){
        knight.attack(rat);
        assertEquals(-4,rat.getHP());
    }

}
