class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100);
        enemy = new Enemy("Orc", 20);
    }

    @Test
    public void testInitialState() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testMove() {
        // This test just checks that the move method executes without error
        player.move(10, 15); // Expected to print movement action
    }

    @Test
    public void testAttackReducesHealth() {
        player.attack(enemy);
        assertTrue(player.getHealth() < 100); // Health should decrease from 100
    }

    @Test
    public void testAttackIncreasesScore() {
        player.attack(enemy);
        assertEquals(10, player.getScore()); // Score incremented by 10 upon attack
    }

    @Test
    public void testDeathScenario() {
        player.setHealth(5); // Setting low health to check death
        player.attack(enemy);
        assertTrue(player.getHealth() <= 0 || player.getHealth() == 5 - enemy.getPower() / 2);
    }
}

// File: EnemyTest.java
package yourpackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 