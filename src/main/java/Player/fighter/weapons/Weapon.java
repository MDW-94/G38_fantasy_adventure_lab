package Player.fighter.weapons;

import Enemies.Enemy;
import Player.fighter.weapons.IWeapon;

// enum for Weapon Type?

public abstract class Weapon implements IWeapon {

    private String name;

    private int damageValue;

    public Weapon(String name, int damageValue) {
        this.name = name;
        this.damageValue = damageValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(getDamageValue());
    }
}
