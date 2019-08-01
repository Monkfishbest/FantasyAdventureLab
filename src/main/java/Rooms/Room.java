package Rooms;

import Mobs.Enemies;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemies> enemies;
    private int loot;

    public Room() {
        this.enemies = new ArrayList<Enemies>();
    }

    private void generateEnemies() {

    }
}
