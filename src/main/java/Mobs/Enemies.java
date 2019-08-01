package Mobs;

import Enums.Enemy;
import interfaces.IAttack;

public class Enemies implements IAttack {

    private int armor;
    private int HP;
    private int attackDMG;
    private Enemy type;
    private boolean alive;

    public Enemies(Enemy enemy) {
        this.HP = enemy.getHP();
        this.attackDMG = enemy.getAttack();
        this.type = enemy;
        this.armor = enemy.getArmor();
        this.alive = true;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttackDMG() {
        return this.attackDMG;
    }

    public Enemy getType() {
        return this.type;
    }

    public void reduceHP(int damage) {
        int totalDMG = damage - this.armor;
        if (totalDMG > 0) {
            this.HP -= totalDMG;
        }
    }

    public void attack(IAttack hero){
        int dmg = this.attackDMG;
        hero.reduceHP(dmg);
    }

    public boolean isAlive() {
        return this.HP > 0;
    }
}