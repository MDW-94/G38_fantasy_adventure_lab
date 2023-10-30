package Player.healer.medTools;

import Player.Player;

public abstract class FirstAid implements IHeal {

    private String name;
    private int healingValue;

    public FirstAid(String name, int healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public void setHealingValue(int healingValue) {
        this.healingValue = healingValue;
    }

    @Override
    public void heal(Player player){
        player.beHealed(healingValue);
    }
}
