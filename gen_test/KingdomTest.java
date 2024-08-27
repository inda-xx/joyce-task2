package test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// File: KingdomTest.java


public class KingdomTest {
    private Kingdom serenia;

    @Before
    public void setUp() {
        serenia = new Kingdom("Serenia", 2000, 3.5, "Queen Athena");
    }

    @Test
    public void testInitialPropertyValues() {
        assertEquals("Serenia", serenia.getKingdomName());
        assertEquals(2000, serenia.getPopulation());
        assertEquals(3.5, serenia.getTreasury(), 0.0);
        assertEquals("Queen Athena", serenia.getRulerName());
        assertFalse(serenia.isProsperityStatus());
    }

    @Test
    public void testProsperityStatusChange() {
        serenia.setTreasury(6.0);
        assertTrue(serenia.isProsperityStatus());
    }

    @Test
    public void testSetKingdomName() {
        serenia.setKingdomName("New Serenia");
        assertEquals("New Serenia", serenia.getKingdomName());
    }

    @Test
    public void testSetPopulation() {
        serenia.setPopulation(2500);
        assertEquals(2500, serenia.getPopulation());
    }
    
    @Test
    public void testSetRulerName() {
        serenia.setRulerName("King Arthur");
        assertEquals("King Arthur", serenia.getRulerName());
    }
}

// File: HeroTest.java


public class HeroTest {
    private Hero hero;

    @Before
    public void setUp() {
        hero = new Hero("John", 0, 0);
    }

    @Test
    public void testInitialHeroValues() {
        assertEquals("John", hero.getName());
        assertEquals(0, hero.getXCoordinate());
        assertEquals(0, hero.getYCoordinate());
        assertEquals(0, hero.getScore());
    }

    @Test
    public void testHeroMovement() {
        hero.move(5, 10);
        assertEquals(5, hero.getXCoordinate());
        assertEquals(10, hero.getYCoordinate());
    }

    @Test
    public void testScoreIncrease() {
        hero.increaseScore(15);
        assertEquals(15, hero.getScore());
    }

    @Test
    public void testSetHeroName() {
        hero.setName("Mike");
        assertEquals("Mike", hero.getName());
    }
    
    @Test
    public void testSetCoordinates() {
        hero.setXCoordinate(3);
        hero.setYCoordinate(4);
        assertEquals(3, hero.getXCoordinate());
        assertEquals(4, hero.getYCoordinate());
    }
    
    @Test
    public void testSetScore() {
        hero.setScore(100);
        assertEquals(100, hero.getScore());
    }
}

// File: EnemyTest.java


public class EnemyTest {
    private Enemy enemy;
    private Hero hero;

    @Before
    public void setUp() {
        enemy = new Enemy(2, 2);
        hero = new Hero("Hero", 0, 0);
    }
    
    @Test
    public void testEnemyInitialPosition() {
        assertEquals(2, enemy.getXCoordinate());
        assertEquals(2, enemy.getYCoordinate());
    }

    @Test
    public void testInteractWithHero() {
        int initialScore = hero.getScore();
        enemy.interact(hero);
        assertEquals(initialScore - 10, hero.getScore());
    }

    @Test
    public void testSetEnemyCoordinates() {
        enemy.setXCoordinate(5);
        enemy.setYCoordinate(5);
        assertEquals(5, enemy.getXCoordinate());
        assertEquals(5, enemy.getYCoordinate());
    }
}