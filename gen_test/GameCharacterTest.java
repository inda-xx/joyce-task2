package test;
import org.junit.Before;
import org.junit.Test;
import original.Game;
import original.GameCharacter;
import static org.junit.Assert.*;



public class GameCharacterTest {
    
    private GameCharacter player;
    private GameCharacter enemy;

    @Before
    public void setUp() {
        player = new GameCharacter("Adventurer", 100, 0, false);
        enemy = new GameCharacter("Goblin", 30, 0, true);
    }

    @Test
    public void testGetName() {
        assertEquals("Adventurer", player.getName());
        assertEquals("Goblin", enemy.getName());
    }

    @Test
    public void testSetName() {
        player.setName("Hero");
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testGetHealthPoints() {
        assertEquals(100, player.getHealthPoints());
        assertEquals(30, enemy.getHealthPoints());
    }

    @Test
    public void testSetHealthPoints() {
        player.setHealthPoints(90);
        assertEquals(90, player.getHealthPoints());
        player.setHealthPoints(-10); // testing negative health points
        assertEquals(-10, player.getHealthPoints());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testGetIsEnemy() {
        assertFalse(player.getIsEnemy());
        assertTrue(enemy.getIsEnemy());
    }

    @Test
    public void testSetIsEnemy() {
        player.setIsEnemy(true);
        assertTrue(player.getIsEnemy());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interact(enemy);
        assertEquals(90, player.getHealthPoints());
    }
    
    @Test
    public void testInteractWithNonEnemy() {
        GameCharacter friend = new GameCharacter("Companion", 40, 0, false);
        player.interact(friend);
        assertEquals(100, player.getHealthPoints());
    }

    @Test
    public void testMovePlayer() {
        player.movePlayer("north");
        // Since movePlayer() only prints, there's no direct test possible
        // Consider using a logger or output capture for testing purpose
    }
}



public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testInitialLevel() {
        assertEquals(1, game.advanceLevel(1));
    }

    @Test
    public void testAdvanceLevel() {
        game.advanceLevel(3);
        assertEquals(3, game.advanceLevel());
    }
}