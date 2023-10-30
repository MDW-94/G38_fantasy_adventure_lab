import Enemies.Replicant_combat_model;
import Player.mage.GeneticDesigner;
import Player.mage.familiar.HumanLabAssistant;
import Player.mage.familiar.PrototypeReplicant;
import Player.mage.spells.CryogenicFreeze;
import Player.mage.spells.DNA_Ability;
import Player.mage.spells.FalseMemories;
import Player.mage.subclasses.EyeSpecialist;
import Player.mage.subclasses.MemoryScientist;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class geneticDesignerTest {

    GeneticDesigner geneticDesigner;
    MemoryScientist memoryScientist;
    EyeSpecialist eyeSpecialist;

    HumanLabAssistant humanLabAssistant;
    PrototypeReplicant prototypeReplicant;

    DNA_Ability dnaAbility;
    FalseMemories falseMemories;
    CryogenicFreeze cryogenicFreeze;

    Replicant_combat_model combatModel;

    @Before
    public void before(){
        falseMemories = new FalseMemories("False Memoires", 50);
        cryogenicFreeze = new CryogenicFreeze("Cryogenic Freeze", 30);

        prototypeReplicant = new PrototypeReplicant("Bob", 50);
        humanLabAssistant = new HumanLabAssistant("Christmas Temp", 35);

        memoryScientist = new MemoryScientist("Tyrell", 100, prototypeReplicant, falseMemories);
        eyeSpecialist = new EyeSpecialist("Hannibal Chew", 50, humanLabAssistant, cryogenicFreeze);

        combatModel = new Replicant_combat_model(200, "Roy");

    }

    @Test
    public void geneticDesignerCanCastDNAAbility(){
        memoryScientist.getDnaAbility().cast(combatModel);
        assertEquals(150, combatModel.getHp());
    }

    @Test
    public void geneticDesignerCanDefend(){
        eyeSpecialist.getAssistant().defend(combatModel);
        assertEquals(165, combatModel.getHp());
    }


}
