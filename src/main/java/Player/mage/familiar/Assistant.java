package Player.mage.familiar;

import Enemies.Enemy;

public abstract class Assistant implements IDefend {

    private String name;

    private int defendValue;

    public Assistant(String name, int defendValue) {
        this.name = name;
        this.defendValue = defendValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefendValue() {
        return defendValue;
    }

    public void setDefendValue(int defendValue) {
        this.defendValue = defendValue;
    }

    @Override
    public void defend(Enemy enemy){
        enemy.takeDamage(getDefendValue());
    }
}
