import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 10, 5);
        enemy = new Enemy("Villain", 80, 8, 3);
    }

    @Test
    public void testPlayerAttributesInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getAttackPoints());
        assertEquals(5, player.getDefensePoints());
        assertFalse(player.isDefeated());
    }

    @Test
    public void testEnemyAttributesInitialization() {
        assertEquals("Villain", enemy.getName());
        assertEquals(80, enemy.getHealth());
        assertEquals(8, enemy.getAttackPoints());
        assertEquals(3, enemy.getDefensePoints());
        assertFalse(enemy.isDefeated());
    }

    @Test
    public void testPlayerAttackEnemy() {
        player.attack(enemy);
        assertEquals(73, enemy.getHealth());
        assertFalse(enemy.isDefeated());
    }

    @Test
    public void testEnemyAttackPlayer() {
        enemy.attack(player);
        assertEquals(97, player.getHealth());
        assertFalse(player.isDefeated());
    }

    @Test
    public void testEnemyDefeatByPlayer() {
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        player.attack(enemy);
        
        assertTrue(enemy.isDefeated());
        assertEquals(0, enemy.getHealth());
    }

    @Test
    public void testPlayerDefeatByEnemy() {
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        enemy.attack(player);
        
        assertTrue(player.isDefeated());
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testAttackWithHigherDefensePoints() {
        Player strongDefender = new Player("Tank", 100, 5, 20);
        enemy.attack(strongDefender);
        assertEquals(100, strongDefender.getHealth());
    }
    
    @Test
    public void testAttackWithZeroHealth() {
        player.setHealth(0);
        enemy.attack(player);
        assertEquals(0, player.getHealth());
        assertTrue(player.isDefeated());
    }

    @Test
    public void testNegativeDamageComputation() {
        Player strongDefender = new Player("Tank", 100, 5, 20);
        strongDefender.attack(enemy);
        assertEquals(80, enemy.getHealth()); // No damage should be dealt
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHealthSetting() {
        player.setHealth(-10);
    }

    @Test
    public void testZeroAttackPoints() {
        Player pacifist = new Player("Pacifist", 100, 0, 5);
        pacifist.attack(enemy);
        assertEquals(80, enemy.getHealth());
    }
}