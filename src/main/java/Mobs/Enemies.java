package Mobs;

public class Enemies {

    private int HP;
    private int attackDMG;
    private String type;

    public Enemies(int HP, int attackDMG, String type) {
        this.HP = HP;
        this.attackDMG = attackDMG;
        this.type = type;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttackDMG() {
        return this.attackDMG;
    }

    public String getType() {
        return this.type;
    }

    public void reduceHP(int dmgTaken){
        this.HP -= dmgTaken;
    }

}
