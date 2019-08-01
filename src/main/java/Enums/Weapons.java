package Enums;

public enum Weapons {
    BROADSWORD(5),
    SHORTSWORD(3),
    QUARTERSTAFF(1);

    private final int damage;
    Weapons(int damage) {
        this.damage = damage;
    }
}
