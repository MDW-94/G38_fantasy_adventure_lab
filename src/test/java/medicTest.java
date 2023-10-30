import Enemies.Replicant_combat_model;
import Player.fighter.subclasses.BladeRunner;
import Player.fighter.weapons.Magnum_357;
import Player.healer.medTools.Bandages;
import Player.healer.medTools.Painkiller;
import Player.healer.medTools.Stimulant;
import Player.healer.subclass.LAPDMedic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class medicTest {

    LAPDMedic lapdMedic;

    Replicant_combat_model combatModel;

    Bandages bandages;
    Stimulant stimulant;
    Painkiller painkiller;

    BladeRunner bladeRunner;
    Magnum_357 magnum357;

    @Before
    public void before(){
        magnum357 = new Magnum_357("Magnum.357", 50);
        bandages = new Bandages("Linen Bandages", 50);

        lapdMedic = new LAPDMedic("Marty", 50, bandages);

        bladeRunner = new BladeRunner("Decker", 50, magnum357);

        combatModel = new Replicant_combat_model(200, "Roy");
    }

    @Test
    public void canMedicHealPlayer(){
        bladeRunner.takeDamage(20);
        assertEquals(30, bladeRunner.getHp());
        lapdMedic.getFirstAid().heal(bladeRunner);
        assertEquals(80, bladeRunner.getHp());
    }
}
