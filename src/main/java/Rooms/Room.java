package Rooms;

import Enums.Enemy;
import Mobs.Enemies;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemies> enemies;
    private int loot;

    public Room() {
        this.enemies = new ArrayList<Enemies>();
        this.generateEnemies();
    }

    private void generateEnemies() {
        this.enemies = Enemy.Ogre.generateRandomCreatures();
    }

    public ArrayList<Enemies> getEnemies() {
        return enemies;
    }
}
