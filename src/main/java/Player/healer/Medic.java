package Player.healer;

import Player.Player;
import Player.healer.medTools.FirstAid;

public abstract class Medic extends Player {

    FirstAid firstAid;

    public Medic(String name, int hp, FirstAid firstAid) {
        super(name, hp);
        this.firstAid = firstAid;
    }

    public FirstAid getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(FirstAid firstAid) {
        this.firstAid = firstAid;
    }
}
