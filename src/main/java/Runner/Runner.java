package Runner;

import Characters.Character;
import Characters.Cleric;
import Characters.Knight;
import Characters.SpellCaster;
import Enums.Enemy;
import Enums.Healing;
import Enums.Spell;
import Enums.Weapon;
import Mobs.Summon;
import Rooms.Room;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Knight knight = new Knight("Dave", Weapon.BROADSWORD, 10);
        party.add(knight);
        party.add(new SpellCaster("Zanorin", Weapon.QUARTERSTAFF, Spell.FIREBALL, new Summon(Enemy.PSEUDODRAGON)));
        party.add(new Cleric("Bob", Weapon.SHORTSWORD, Healing.HEALINGWORD, 5));
        Room room = new Room();
    do {

    } while (room.getEnemies().size() > 0);
    }
}
