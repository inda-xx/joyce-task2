package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class SpaceExplorerTest {
    private SpaceExplorer explorer;

    @Before
    public void setUp() {
        explorer = new SpaceExplorer("Voyager", 100, 80, 20);
    }

    @Test
    public void testGetName() {
        assertEquals("Voyager", explorer.getName());
    }

    @Test
    public void testSetName() {
        explorer.setName("Pioneer");
        assertEquals("Pioneer", explorer.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, explorer.getHealth());
    }

    @Test
    public void testSetHealth() {
        explorer.setHealth(80);
        assertEquals(80, explorer.getHealth());
    }

    @Test
    public void testGetEnergy() {
        assertEquals(80, explorer.getEnergy());
    }

    @Test
    public void testSetEnergy() {
        explorer.setEnergy(60);
        assertEquals(60, explorer.getEnergy());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(20, explorer.getSpeed());
    }

    @Test
    public void testSetSpeed() {
        explorer.setSpeed(25);
        assertEquals(25, explorer.getSpeed());
    }

    @Test
    public void testIsActive() {
        assertTrue(explorer.isActive());
    }

    @Test
    public void testSetActive() {
        explorer.setActive(false);
        assertFalse(explorer.isActive());
    }

    @Test
    public void testActivateBoostSufficientEnergy() {
        explorer.activateBoost();
        assertEquals(24, explorer.getSpeed()); // 20% boost of original speed 20
        assertEquals(60, explorer.getEnergy()); // energy reduced by 20
    }

    @Test
    public void testActivateBoostInsufficientEnergy() {
        explorer.setEnergy(40);
        explorer.activateBoost();
        assertEquals(20, explorer.getSpeed()); // speed remains the same
        assertEquals(40, explorer.getEnergy()); // energy remains the same
    }

    @Test
    public void testPerformanceActivationLoop() {
        explorer.setEnergy(100);
        for (int i = 0; i < 1000; i++) {
            explorer.activateBoost();
        } 
        // We expect speed to continuously increase until energy runs out
        assertTrue(explorer.getSpeed() > 20);
    }
} 

package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 