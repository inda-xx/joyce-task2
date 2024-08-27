package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero");
        enemy = new Enemy("Goblin", 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(20);
        assertEquals(20, player.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeScore() {
        player.setScore(-10);
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUp() {
        player.move("up");
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testMoveDown() {
        player.move("down");
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testMoveLeft() {
        player.move("left");
        assertEquals(-1, player.getPositionX());
    }

    @Test
    public void testMoveRight() {
        player.move("right");
        assertEquals(1, player.getPositionX());
    }

    @Test
    public void testInvalidMove() {
        player.move("invalid");
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testInteractWithEnemyInRange() {
        player.setPositionX(enemy.getPositionX()); // Align positions for guaranteed interaction
        player.setPositionY(enemy.getPositionY());
        player.interact(enemy);
        assertEquals(-5, player.getScore());
    }

    @Test
    public void testInteractWithEnemyOutOfRange() {
        player.setPositionX(0);
        player.setPositionY(0);
        enemy = new Enemy("Goblin", 5);
        player.interact(enemy);
        assertEquals(0, player.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerName() {
        new Player(null);
    }

    @Test
    public void testSetNameInvalid() {
        try {
            player.setName(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null", e.getMessage());
        }
    }
}