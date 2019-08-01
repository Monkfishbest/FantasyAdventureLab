package Enums;

public enum Spell {
    FIREBALL(7),
    LIGHTNINGBOLT(8),
    FIREBOLT(3);

    private final int damage;

    Spell(int damage) {
        this.damage = damage;
    }
}
