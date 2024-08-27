
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// File: PlayerTest.java

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("HeroName");
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMove() {
        player.move(1, 1);
        assertEquals(1, player.getPositionX());
        assertEquals(1, player.getPositionY());

        player.move(2, -1);
        assertEquals(3, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testAddScore() {
        player.addScore(10);
        assertEquals(10, player.getScore());

        player.addScore(15);
        assertEquals(25, player.getScore());
    }

    @Test
    public void testSetName() {
        player.setName("NewHeroName");
        assertEquals("NewHeroName", player.getName());
    }

    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.setAlive(false);
        assertFalse(player.isAlive());
    }
}

// File: EnemyTest.java

public class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 2, 2);
        player = new Player("HeroName");
    }

    @Test
    public void testInitialEnemyPosition() {
        assertEquals(2, enemy.getPositionX());
        assertEquals(2, enemy.getPositionY());
    }

    @Test
    public void testInteractWithPlayerAtSamePosition() {
        player.setPositionX(2);
        player.setPositionY(2);

        enemy.interactWith(player);
        assertFalse(player.isAlive());
    }

    @Test
    public void testInteractWithPlayerAtDifferentPosition() {
        player.setPositionX(1);
        player.setPositionY(1);

        enemy.interactWith(player);
        assertTrue(player.isAlive());
    }

    @Test
    public void testEnemyType() {
        assertEquals("Goblin", enemy.getType());
        enemy.setType("Orc");
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testEnemyDefeatedStatus() {
        assertFalse(enemy.isDefeated());
        enemy.setDefeated(true);
        assertTrue(enemy.isDefeated());
    }
}

// File: GameTest.java

public class GameTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("HeroName");
        enemy = new Enemy("Goblin", 2, 2);
    }

    @Test
    public void testGameOverConditionWhenPlayerMovesToEnemy() {
        player.move(2, 2); // Moves to (2, 2)
        enemy.interactWith(player);
        assertFalse(player.isAlive());
    }

    @Test
    public void testVariableShadowingInGame() {
        player.setName("NewHeroName");
        assertEquals("NewHeroName", player.getName());
        player.setPosition(player.getPositionX(), player.getPositionY());
    }
}