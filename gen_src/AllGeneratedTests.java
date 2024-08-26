package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

// Test cases for the Enemy and Player class implementations

public class GameTest {

    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 15, new int[]{2, 3});
        player = new Player("Hero", new int[]{0, 0});
    }

    // Enemy Tests

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getEnemyName());
        assertEquals(15, enemy.getDamage());
        assertArrayEquals(new int[]{2, 3}, enemy.getPosition());
    }

    @Test
    public void testSetEnemyName() {
        enemy.setEnemyName("Orc");
        assertEquals("Orc", enemy.getEnemyName());
    }

    @Test
    public void testSetEnemyDamage() {
        enemy.setDamage(20);
        assertEquals(20, enemy.getDamage());
    }

    @Test
    public void testSetEnemyPosition() {
        enemy.setPosition(new int[]{5, 5});
        assertArrayEquals(new int[]{5, 5}, enemy.getPosition());
    }

    // Player Tests

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getPlayerName());
        assertEquals(0, player.getScore());
        assertArrayEquals(new int[]{0, 0}, player.getPosition());
        assertTrue(player.isAlive());
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("Champion");
        assertEquals("Champion", player.getPlayerName());
    }

    @Test
    public void testSetPlayerScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testSetPlayerPosition() {
        player.setPosition(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, player.getPosition());
    }

    @Test
    public void testSetPlayerAliveStatus() {
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test
    public void testPlayerMovement() {
        player.move(3, 4);
        assertArrayEquals(new int[]{3, 4}, player.getPosition());
    }

    @Test
    public void testPlayerInteractWithEnemyNoInteraction() {
        player.interactWithEnemy(enemy);
        assertTrue(player.isAlive());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerInteractWithEnemyCollision() {
        player.setPosition(new int[]{2, 3}); // Move player to enemy position
        player.interactWithEnemy(enemy);
        assertFalse(player.isAlive());
        assertEquals(0, player.getScore());
    }

    // Edge Cases
    
    @Test(expected = NullPointerException.class)
    public void testEnemySetPositionNull() {
        enemy.setPosition(null);
    }

    @Test(expected = NullPointerException.class)
    public void testPlayerSetPositionNull() {
        player.setPosition(null);
    }

    @Test
    public void testEnemyNegativeDamage() {
        enemy.setDamage(-5);
        assertEquals(-5, enemy.getDamage());
    }

    // Performance Consideration
    
    @Test
    public void testHighNumberOfEnemies() {
        final int numEnemies = 10000;
        Enemy[] enemies = new Enemy[numEnemies];
        for (int i = 0; i < numEnemies; i++) {
            enemies[i] = new Enemy("Enemy" + i, 10, new int[]{i, i});
        }
        assertEquals(numEnemies, enemies.length);
    }
}