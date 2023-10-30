package Player.mage.spells;

import Enemies.Enemy;

public abstract class DNA_Ability implements ISpell {

    private String name;

    private int powerValue;

    public DNA_Ability(String name, int powerValue) {
        this.name = name;
        this.powerValue = powerValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }

    @Override
    public void cast(Enemy enemy){
        enemy.takeDamage(getPowerValue());
    }
}
