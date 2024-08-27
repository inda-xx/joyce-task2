class EnemyTest {
    private Enemy goblin;
    private Player player;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 20, 0, 0);
        player = new Player("TestPlayer");
    }

    @Test
    public void testInteractWithPlayerReduceHealth() {
        goblin.interact(player);
        assertEquals(80, player.getHealth()); // Player encounters Goblin, loses 20 health
    }

    @Test
    public void testInteractWithPlayerPositionMismatch() {
        player.moveRight(); // Move player to (1, 0)
        goblin.interact(player);
        assertEquals(100, player.getHealth()); // Health should remain unchanged
    }

    @Test
    public void testEnemyInitialValues() {
        assertEquals("Goblin", goblin.getType());
        assertEquals(20, goblin.getStrength());
        assertEquals(0, goblin.getXPosition());
        assertEquals(0, goblin.getYPosition());
    }

    @Test
    public void testSetType() {
        goblin.setType("Orc");
        assertEquals("Orc", goblin.getType());
    }

    @Test
    public void testSetStrength() {
        goblin.setStrength(30);
        assertEquals(30, goblin.getStrength());
    }

    @Test
    public void testSetPosition() {
        goblin.setXPosition(5);
        assertEquals(5, goblin.getXPosition());

        goblin.setYPosition(10);
        assertEquals(10, goblin.getYPosition());
    }
}

// File: GameTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public 