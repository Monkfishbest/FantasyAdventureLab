package Enums;

public enum Weapon {
    BROADSWORD(5),
    SHORTSWORD(3),
    QUARTERSTAFF(1),
    WARAXE(4),
    DAGGER(2);

    private final int damage;
    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
