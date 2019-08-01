package Enums;

public enum Enemy {
    ORC(10, 7),
    Ogre(30, 10),
    RAT(1,1),
    Dragon(100, 20);

    private final int HP;
    private final int attack;

    Enemy(int HP, int attack) {
        this.HP = HP;
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public int getAttack() {
        return attack;
    }
}
