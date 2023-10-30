import Enemies.Enemy;
import Enemies.Replicant_combat_model;
import Player.Player;
import Player.fighter.subclasses.BladeRunner;
import Player.fighter.subclasses.Lieutenant;
import Player.fighter.subclasses.Officer;
import Player.fighter.weapons.EnderScopeRifle;
import Player.fighter.weapons.Magnum_357;
import Player.fighter.weapons.SwitchBlade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class playerTest {

    Player player;

    Officer officer;

    BladeRunner bladeRunner;

    Lieutenant lieutenant;

    EnderScopeRifle enderScopeRifle;
    Magnum_357 magnum_357;

    SwitchBlade switchBlade;

    Enemy enemy;

    Replicant_combat_model combatModel;



    @Before
    public void before(){
        magnum_357 = new Magnum_357("magnum.357", 20);
        enderScopeRifle = new EnderScopeRifle("Ender Scope Rifle", 50);
        switchBlade = new SwitchBlade("Switch Blade", 10);

        officer = new Officer("Bill", 100, magnum_357);
        lieutenant = new Lieutenant("Sarah", 150, enderScopeRifle);
        bladeRunner = new BladeRunner("Decker", 150, magnum_357);

        combatModel = new Replicant_combat_model(200, "Roy");

    }

    @Test
    public void playerHasWeapon(){
        assertEquals("magnum.357", officer.getWeapon().getName());
        assertEquals(20, officer.getWeapon().getDamageValue());

        assertEquals("Ender Scope Rifle", lieutenant.getWeapon().getName());
        assertEquals(50, lieutenant.getWeapon().getDamageValue());
    }

    @Test
    public void playerCanSelectWeapon(){
        assertEquals("Ender Scope Rifle", lieutenant.getWeapon().getName());
        lieutenant.selectWeapon(magnum_357);
        assertEquals("magnum.357", lieutenant.getWeapon().getName());
    }

    @Test
    public void playerCanDamageEnemy(){
        bladeRunner.getWeapon().attack(combatModel);
        assertEquals(180, combatModel.getHp());
    }

    @Test
    public void playerCanChangeWeaponInCombat(){
        bladeRunner.getWeapon().attack(combatModel);
        assertEquals(180, combatModel.getHp());
        bladeRunner.selectWeapon(switchBlade);
        bladeRunner.getWeapon().attack(combatModel);
        assertEquals(170, combatModel.getHp());
    }

//    @Test
//    public void bladeRunnerCanVoigtKampff(){
//        assertEquals("Roy", bladeRunner.voightKampff(combatModel));
//    }

    @Test
    public void bladeRunnerIntroductionsTest(){
        assertEquals("My name is Decker, I'm a Blade Runner", bladeRunner.introductions());
    }




}
