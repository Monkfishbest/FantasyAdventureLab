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



        System.out.println("Welcome to Code Clan Quest, please Select your party members");

        System.out.println("1 - Barbarian");
        System.out.println("2 - dwarf");
        System.out.println("3 - Knight");
        System.out.println("4 - Cleric");
        System.out.println("5 - Wizard");

        int optionSelect = userInPut.nextInt();


        do {
            switch (optionSelect) {
                case 1:
                    System.out.println("Choose the name of your mighty barbarian!");
                    String nameOfHero = userInPut.nextLine();
                    String nameOfBarbClass = nameOfHero + "VarName";
                    Barbarian newBarb = new Barbarian(nameOfHero, 120, Weapon.BROADSWORD);
                    party.add(newBarb);
                    break;
                case 2:
                    System.out.println("Choose the name of your stumpy dwarf");
                    String nameOfDwarf = userInPut.nextLine();
                    DwarfFighter newDwarf = new DwarfFighter(nameOfDwarf, Weapon.WARAXE, 5);
                    party.add(newDwarf);
                    break;
                case 3:
                    System.out.println("Choose the name of your 'brave' heavily armored Knight");
                    String nameOfKnight = userInPut.nextLine();
                    Knight newKnight = new Knight(nameOfKnight, Weapon.BROADSWORD, 10);
                    party.add(newKnight);
                    break;
                case 4:
                    System.out.println("Name your supportive and somewhat annoying Cleric");
                    String nameOfCleric = userInPut.nextLine();
                    Cleric newCleric = new Cleric(nameOfCleric, Weapon.DAGGER, Healing.HEALINGWORD,2);
                    party.add(newCleric);
                    break;
                case 5:
                    System.out.println("Name  your fiendish wizzard");
                    String nameOfWizard = userInPut.nextLine();
                    String newWizard = new SpellCaster(nameOfWizard, Weapon.QUARTERSTAFF, Spell.LIGHTNINGBOLT, Enemy.PSEUDODRAGON);
            }

        }while (party.size() < 4);
//
//
//        } while (room.getEnemies().size() > 0);


    }
}