package Enums;

public enum Healing {
    POTIONOFHEALING(8),
    HEALINGWORD(5),
    HEALINGHERB(2);

    private final int healing;

    Healing(int healing) {
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }
}
