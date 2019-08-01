package Mobs;

import Enums.Enemy;
import interfaces.IAttack;

public class Enemies implements IAttack {

    private int HP;
    private int attackDMG;
    private Enemy type;

    public Enemies(Enemy enemy) {
        this.HP = enemy.getHP();
        this.attackDMG = enemy.getAttack();
        this.type = enemy;
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

    public void reduceHP(int dmgTaken){
        this.HP -= dmgTaken;
    }

    public void attack(IAttack hero){
       int dmg = this.attackDMG;
       hero.reduceHP(dmg);
    }
}
