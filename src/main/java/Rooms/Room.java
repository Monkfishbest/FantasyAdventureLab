package Rooms;

import Enums.Enemy;
import Mobs.Enemies;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    private ArrayList<Enemies> enemies;
    private int loot;
    private static final Random random = new Random();

    public Room() {
        this.enemies = new ArrayList<Enemies>();
        this.generateEnemies();
        this.generateLoot();
    }

    private void generateEnemies() {
        this.enemies = Enemy.Ogre.generateRandomCreatures();
    }

    private void generateLoot() {
        this.loot = random.nextInt(200);
    }

    public ArrayList<Enemies> getEnemies() {
        return enemies;
    }

    public int getLoot() {
        return loot;
    }

    public void removeDead(Enemies enemy) {
        enemies.remove(enemy);
    }
}
