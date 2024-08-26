class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Orc", new int[]{2, 3}, true);
    }

    @Test
    public void testEnemyProperties() {
        assertArrayEquals(new int[]{2, 3}, enemy.getPosition());
        assertTrue(enemy.isActive());
    }
}

// File: GameShadowingTest.java
package original;
import org.junit.Test;
import static org.junit.Assert.*;

public 