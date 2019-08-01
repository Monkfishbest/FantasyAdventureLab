package Enums;

public enum Weapon {
    BROADSWORD(5),
    SHORTSWORD(3),
    QUARTERSTAFF(1);

    private final int damage;
    Weapon(int damage) {
        this.damage = damage;
    }
}
