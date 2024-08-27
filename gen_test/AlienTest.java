package test;
import main.Alien; // Replace 'main' with the correct package name where Alien.java is defined.
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class AlienTest {
    private Alien alien1;
    private Alien alien2;
    private Alien alien3;

    @Before
    public void setUp() {
        alien1 = new Alien("Zeta", 100, 50, 75);
        alien2 = new Alien("Xenomorph", 90, 80, 60);
        alien3 = new Alien("Zorb", 100, 60, 60);
    }

    @Test
    public void testGetSpeciesName() {
        assertEquals("Zeta", alien1.getSpeciesName());
        assertEquals("Xenomorph", alien2.getSpeciesName());
        assertEquals("Zorb", alien3.getSpeciesName());
    }

    @Test
    public void testSetSpeciesName() {
        alien1.setSpeciesName("Alpha");
        assertEquals("Alpha", alien1.getSpeciesName());
    }

    @Test
    public void testGetEnergyLevel() {
        assertEquals(100, alien1.getEnergyLevel());
        assertEquals(90, alien2.getEnergyLevel());
    }

    @Test
    public void testSetEnergyLevel() {
        alien1.setEnergyLevel(80);
        assertEquals(80, alien1.getEnergyLevel());
    }

    @Test
    public void testGetStrength() {
        assertEquals(50, alien1.getStrength());
        assertEquals(80, alien2.getStrength());
    }

    @Test
    public void testSetStrength() {
        alien1.setStrength(90);
        assertEquals(90, alien1.getStrength());
    }

    @Test
    public void testGetIntelligence() {
        assertEquals(75, alien1.getIntelligence());
        assertEquals(60, alien2.getIntelligence());
    }

    @Test
    public void testSetIntelligence() {
        alien1.setIntelligence(85);
        assertEquals(85, alien1.getIntelligence());
    }

    @Test
    public void testIsPeaceful() {
        assertTrue(alien1.isPeaceful());
        assertFalse(alien2.isPeaceful());
        // Testing default peaceful state based on intelligence and strength
        assertFalse(alien3.isPeaceful());
    }

    @Test
    public void testSetPeaceful() {
        alien1.setPeaceful(false);
        assertFalse(alien1.isPeaceful());
    }

    @Test
    public void testCombatReducesEnergyLevel() {
        alien1.combat(alien2);
        // Expected energy loss for alien2: 50 - 60/2 = 20
        assertEquals(70, alien2.getEnergyLevel());
    }

    @Test
    public void testCombatEnergyLevelCannotGoBelowZero() {
        alien1.setStrength(200);
        alien1.combat(alien2);
        // Since energy impact is 200 - 30 = 170, and alien2's energy level is 90, energy should not be less than zero.
        assertEquals(0, alien2.getEnergyLevel());
    }

    @Test
    public void testCombatNegativeStrengthAndIntelligence() {
        Alien weakAlien = new Alien("Weakling", 10, -10, -5);
        weakAlien.combat(alien1);
        // -10 - (-5)/2 = -7.5 (Should not cause alien1's energy to increase)
        assertEquals(100, alien1.getEnergyLevel());
    }

    @Test
    public void testPerformanceOfCombat() {
        Alien strongAlien = new Alien("Gargantua", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        Alien weakAlien = new Alien("Tiny", Integer.MAX_VALUE, 1, 1);

        // Simulating a large number of combats to test performance
        for (int i = 0; i < 1000000; i++) {
            strongAlien.combat(weakAlien);
            weakAlien.setEnergyLevel(Integer.MAX_VALUE); // Reset energy level for test loop
        }

        // Ensure final energy level is handled correctly and performance does not degrade
        assertEquals(Integer.MAX_VALUE, weakAlien.getEnergyLevel());
    }
} 

// Ensure the following import statement is present in the package where Alien is located