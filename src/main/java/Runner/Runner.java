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
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<Character>();
        Room room = new Room();
        Scanner userInPut = new Scanner(System.in);
        GameLogic game = new GameLogic();


        do {
           game.chooseHeroFunction();
        }while (game.party.size() < 4);
//
//
//        } while (room.getEnemies().size() > 0);


    }
}