import Enemies.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class enemyTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    Enemy enemy;
    Mercenary mercenary;

    Replicant_combat_model combatModel;

    Replicant_gymnastic_model gymnasticModel;

    Replicant_unidentified_model unknownModel;



    @Before
    public void before() {
        System.setOut(new PrintStream(outContent));

        mercenary = new Mercenary(50, "Frank");
        combatModel = new Replicant_combat_model(200, "Roy");
        gymnasticModel = new Replicant_gymnastic_model(150, "Pris");
        unknownModel = new Replicant_unidentified_model(125);
    }

    @After
    public void restoreStreams(){
        System.setOut(originalOut);
    }

    @Test
    public void enemyCanTakeDamage() {
        unknownModel.takeDamage(25);
        mercenary.takeDamage(25);
        combatModel.takeDamage(25);
        gymnasticModel.takeDamage(25);
        assertEquals(100, unknownModel.getHp());
        assertEquals(25, mercenary.getHp());
        assertEquals(125, gymnasticModel.getHp());
        assertEquals(175, combatModel.getHp());
    }

    @Test
    public void enemyHasName(){
        assertEquals("Frank", mercenary.getName());
        assertEquals("Roy", combatModel.getName());
        assertEquals("Pris", gymnasticModel.getName());
    }

    @Test
    public void enemyCanBeDefeated(){
        combatModel.takeDamage(200);
        assertEquals("- Enemy Retired -\n", outContent.toString());
    }
}
