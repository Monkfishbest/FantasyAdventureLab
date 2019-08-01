package Enums;

import Mobs.Enemies;

import java.util.*;

public enum Enemy {
    ORC(10, 7, 5),
    Ogre(30, 10, 3),
    RAT(1,1, 10),
    DRAGON(100, 20, 1);

    private final int HP;
    private final int attack;
    private final int amount;
    private static final List<Enemy> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random random = new Random();

    Enemy(int HP, int attack, int amount) {
        this.HP = HP;
        this.attack = attack;
        this.amount = amount;
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }

    public ArrayList<Enemies> generateRandomCreatures() {
        Enemy enemy = VALUES.get(random.nextInt(VALUES.size()));
        ArrayList<Enemies> arr = new ArrayList<Enemies>();
        for (int i = 0; i < enemy.amount; i++) {
            arr.add(new Enemies(enemy));
        }
        return arr;
    }
}
