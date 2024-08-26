class PlayerTest {
    private Player player;
    private Enemy activeEnemy;
    private Enemy inactiveEnemy;

    @Before
    public void setUp() {
        player = new Player("John", new int[]{0, 0});
        activeEnemy = new Enemy("Goblin", new int[]{0, 0}, true);
        inactiveEnemy = new Enemy("Troll", new int[]{0, 0}, false);
    }

    @Test
    public void testInitialState() {
        assertEquals("John", player.getName());
        assertEquals(0, player.getScore());
        assertArrayEquals(new int[]{0, 0}, player.getPosition());
        assertTrue(player.isAlive());
    }
    
    @Test
    public void testSetName() {
        player.setName("Doe");
        assertEquals("Doe", player.getName());
    }
    
    @Test
    public void testSetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }
    
    @Test
    public void testSetPosition() {
        player.setPosition(new int[]{5, 5});
        assertArrayEquals(new int[]{5, 5}, player.getPosition());
    }
    
    @Test
    public void testSetAlive() {
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test
    public void testInteractWithActiveEnemy() {
        player.interactWithEnemy(activeEnemy);
        assertFalse(player.isAlive());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testInteractWithInactiveEnemy() {
        player.interactWithEnemy(inactiveEnemy);
        assertTrue(player.isAlive());
        assertEquals(5, player.getScore());
    }

    @Test
    public void testInteractWithEnemyDifferentPosition() {
        player.setPosition(new int[]{1, 1});
        player.interactWithEnemy(activeEnemy);
        assertTrue(player.isAlive());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testInteractWithNullEnemy() {
        player.interactWithEnemy(null);
        assertTrue(player.isAlive());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testInteractWithEnemyNullPosition() {
        Enemy enemyWithNullPosition = new Enemy("Dragon", null, true);
        player.interactWithEnemy(enemyWithNullPosition);
        assertTrue(player.isAlive());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPerformanceWithMultipleEnemyInteractions() {
        for (int i = 0; i < 1000; i++) {
            Enemy enemy = new Enemy("Enemy" + i, new int[]{0, 0}, i % 2 == 0);
            player.interactWithEnemy(enemy);
        }
        assertEquals(2500, player.getScore());
    }
}

// File: EnemyTest.java
package original;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 