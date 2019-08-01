package Characters;

public enum Healing {
    POTIONOFHEALING(5),
    HEALINGWORD(2),
    HEALINGHERB(8);

    private final int healing;

    Healing(int healing) {
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }
}
