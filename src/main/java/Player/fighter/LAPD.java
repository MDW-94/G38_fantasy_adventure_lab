package Player.fighter;

import Player.Player;
import Player.fighter.weapons.Weapon;

public abstract class LAPD extends Player {

    private Weapon weapon;

    public LAPD(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void selectWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
