package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Player;
import Enemy;

public class GameTest {
    private Player player;
    private Enemy goblin;
    private Enemy orc;

    @Before
    public void setUp() {
        // Initialize player and enemies
        player = new Player("Hero", 0, 0);
        goblin = new Enemy("Goblin", 1, 0);
        orc = new Enemy("Orc", 0, 1);
    }

    @Test
    public void testPlayerInitialize() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerMoveRight() {
        player.moveRight();
        assertEquals(1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerMoveUp() {
        player.moveUp();
        assertEquals(0, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testPlayerMoveLeft() {
        player.moveRight(); // move to x = 1 first
        player.moveLeft();
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerMoveDown() {
        player.moveUp(); // move to y = 1 first
        player.moveDown();
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testEnemyInteractWithPlayer() {
        player.moveRight(); // move to (1, 0)
        goblin.interact(player);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testNoInteractionNoScoreChange() {
        goblin.interact(player);  // player is at (0, 0), goblin is at (1, 0)
        assertEquals(0, player.getScore());
    }

    @Test
    public void testMultipleEnemyInteractions() {
        player.moveRight();  // move to (1, 0)
        goblin.interact(player);
        player.moveLeft();  // back to (0, 0)
        player.moveUp();  // move to (0, 1)
        orc.interact(player);
        assertEquals(-20, player.getScore());
    }

    @Test
    public void testSetName() {
        player.setName("NewHero");
        assertEquals("NewHero", player.getName());
    }

    @Test
    public void testSetPosition() {
        player.setPositionX(5);
        player.setPositionY(5);
        assertEquals(5, player.getPositionX());
        assertEquals(5, player.getPositionY());
    }

    @Test
    public void testSetScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testNegativePositionChange() {
        player.setPositionX(-1);
        player.setPositionY(-1);
        assertEquals(-1, player.getPositionX());
        assertEquals(-1, player.getPositionY());
    }
}