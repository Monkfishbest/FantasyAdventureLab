package Enums;

public enum SPELLS {
    FIREBALL(7),
    LIGHTNINGBOLT(8),
    FIREBOLT(3);

    private final int damage;

    SPELLS(int damage) {
        this.damage = damage;
    }
}
