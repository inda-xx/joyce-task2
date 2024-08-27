package enemy;
import enemy.Enemy;
import hero.Hero;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class HeroEnemyTest {
    private Hero hero;
    private Enemy enemy;

    @Before
    public void setUp() {
        // Initialize a hero with a name and specific coordinates
        hero = new Hero("John", 0, 0);
        // Initialize an enemy with specific coordinates
        enemy = new Enemy(2, 2);
    }

    @Test
    public void testHeroInitialization() {
        assertEquals("John", hero.getName());
        assertEquals(0, hero.getXCoordinate());
        assertEquals(0, hero.getYCoordinate());
        assertEquals(0, hero.getScore());
    }

    @Test
    public void testHeroMove() {
        hero.move(5, -3);
        assertEquals(5, hero.getXCoordinate());
        assertEquals(-3, hero.getYCoordinate());

        // Test moving with zero values
        hero.move(0, 0);
        assertEquals(5, hero.getXCoordinate());
        assertEquals(-3, hero.getYCoordinate());
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameNull() {
        // Set hero name to null, expecting an exception
        hero.setName(null);
    }

    @Test
    public void testIncreaseScore() {
        hero.increaseScore(50);
        assertEquals(50, hero.getScore());

        hero.increaseScore(-20);
        assertEquals(30, hero.getScore());
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals(2, enemy.getXCoordinate());
        assertEquals(2, enemy.getYCoordinate());
    }

    @Test
    public void testInteractWithEnemy() {
        int initialScore = hero.getScore();
        enemy.interact(hero);
        assertEquals(initialScore - 10, hero.getScore());
    }

    @Test
    public void testInteractMultipleTimes() {
        hero.increaseScore(50); // Set up score for interaction
        enemy.interact(hero);
        enemy.interact(hero);
        assertEquals(30, hero.getScore()); // Two interactions, 20 points deducted in total
    }

    @Test
    public void testHeroBoundaries() {
        hero.setXCoordinate(Integer.MAX_VALUE);
        hero.move(1, 0);
        assertEquals(Integer.MIN_VALUE, hero.getXCoordinate()); // Check for overflow

        hero.setYCoordinate(Integer.MAX_VALUE);
        hero.move(0, 1);
        assertEquals(Integer.MIN_VALUE, hero.getYCoordinate()); // Check for overflow
    }

    @Test
    public void testEnemyPositionChange() {
        enemy.setXCoordinate(10);
        enemy.setYCoordinate(-10);
        assertEquals(10, enemy.getXCoordinate());
        assertEquals(-10, enemy.getYCoordinate());
    }
}

