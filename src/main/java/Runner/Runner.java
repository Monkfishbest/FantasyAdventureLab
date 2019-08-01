package Runner;

import Characters.*;
import Characters.Character;
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
    do { for(Character partyMember: party){
        if((partyMember instanceof Fighter) ||(partyMember instanceof SpellCaster)){
            partyMember.attack(room.getEnemies().get(0));
        } else { if(partyMember instanceof Cleric) {
            partyMember.
        }
    }

    } while (room.getEnemies().size() > 0);
    }
}
