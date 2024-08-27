package test;

import main.Enemy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Orc", 10);
    }

    @Test
    public void testGetType() {
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testGetDamage() {
        assertEquals(10, enemy.getDamage());
    }

    @Test
    public void testInitialPosition() {
        int positionX = enemy.getPositionX();
        int positionY = enemy.getPositionY();
        assertTrue(positionX >= 0 && positionX < 100);
        assertTrue(positionY >= 0 && positionY < 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnemyType() {
        new Enemy(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeEnemyDamage() {
        new Enemy("Orc", -5);
    }
}
