class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("TestPlayer");
    }

    @Test
    public void testInitialValues() {
        assertEquals("TestPlayer", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(1, player.getYPosition());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(-1, player.getYPosition());
    }

    @Test
    public void testMoveLeft() {
        player.moveLeft();
        assertEquals(-1, player.getXPosition());
    }

    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getXPosition());
    }

    @Test
    public void testSetName() {
        player.setName("NewName");
        assertEquals("NewName", player.getName());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetHealthValidValues() {
        player.setHealth(50);
        assertEquals(50, player.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHealthInvalidValues() {
        player.setHealth(-10); // Assuming that health should not be negative
    }

    @Test
    public void testSetPosition() {
        player.setXPosition(5);
        assertEquals(5, player.getXPosition());

        player.setYPosition(10);
        assertEquals(10, player.getYPosition());
    }
}

// File: EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 