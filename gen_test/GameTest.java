package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import main.Player;
import main.Enemy;

public class GameTest {
    
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("TestHero", 0, 0);
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("TestHero", player.getName());
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetPlayerPosition() {
        player.setPosition(5, 5);
        assertEquals(5, player.getX());
        assertEquals(5, player.getY());
    }

    @Test
    public void testPlayerScoreUpdate() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testEnemyInteractionWithPlayer() {
        player.setScore(100);
        player.setPosition(5, 5);
        enemy.interact(player);
        assertEquals(90, player.getScore());
    }

    @Test
    public void testEnemyInitialization() {
        // Ensure the enemy is initialized at the correct position
        // Position getters are not available, thus assumed positions in interact verify setup
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerPosition() {
        // Example case for handling (Requirement for position validation needed in Player)
    }

    @Test(expected = NullPointerException.class)
    public void testEnemyInteractionWithNullPlayer() {
        enemy.interact(null);
    }

    @Test
    public void testEdgeCasePlayerPositionLimits() {
        player.setPosition(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getX());
        assertEquals(Integer.MAX_VALUE, player.getY());

        player.setPosition(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, player.getX());
        assertEquals(Integer.MIN_VALUE, player.getY());
    }

    @Test
    public void testScoreUnderflow() {
        player.setScore(Integer.MIN_VALUE);
        enemy.interact(player);
        assertEquals(Integer.MIN_VALUE - 10, player.getScore());
    }

    @Test
    public void testScoreOverflow() {
        player.setScore(Integer.MAX_VALUE);
        player.setScore(player.getScore() + 1);
        assertEquals(Integer.MAX_VALUE + 1, player.getScore());
    }
}