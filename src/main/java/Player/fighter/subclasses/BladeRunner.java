package Player.fighter.subclasses;

import Enemies.Enemy;
import Player.fighter.LAPD;
import Player.fighter.weapons.Weapon;

public class BladeRunner extends LAPD {


    public BladeRunner(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

//    public String voightKampff(Enemy enemy){
//        String detected = enemy.getHp();
//        return "I know who you are " + detected + "!";
//    }

    public String introductions(){
        return "My name is " + getName() + ", I'm a Blade Runner";
    }

}

