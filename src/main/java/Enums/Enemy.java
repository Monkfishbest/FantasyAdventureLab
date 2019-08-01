package Enums;

public enum Enemy {
    ORC(10, 7, 5),
    Ogre(30, 10, 3),
    RAT(1,1, 10),
    DRAGON(100, 20, 1);

    private final int HP;
    private final int attack;
    private final int amount;

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
}
