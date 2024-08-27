
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// File: CityTest.java

public class CityTest {
    private City city;

    @Before
    public void setUp() {
        city = new City("TestCity", 500000, 300.0, false);
    }

    @Test
    public void testGetName() {
        assertEquals("TestCity", city.getName());
    }

    @Test
    public void testSetName() {
        city.setName("NewTestCity");
        assertEquals("NewTestCity", city.getName());
    }

    @Test
    public void testGetPopulation() {
        assertEquals(500000, city.getPopulation());
    }

    @Test
    public void testSetPopulation() {
        city.setPopulation(600000);
        assertEquals(600000, city.getPopulation());
    }

    @Test
    public void testGetArea() {
        assertEquals(300.0, city.getArea(), 0.01);
    }

    @Test
    public void testSetArea() {
        city.setArea(400.0);
        assertEquals(400.0, city.getArea(), 0.01);
    }

    @Test
    public void testIsCapital() {
        assertFalse(city.isCapital());
    }

    @Test
    public void testSetCapital() {
        city.setCapital(true);
        assertTrue(city.isCapital());
    }
}

// File: ShadowExampleTest.java

public class ShadowExampleTest {
    @Test
    public void testPrintShadow() {
        new ShadowExample().printShadow();
    }
}

// File: BuildingTest.java

public class BuildingTest {
    private Building building;

    @Before
    public void setUp() {
        building = new Building("Blue");
    }

    @Test
    public void testDescribe() {
        building.describe();
    }
}

// File: HeroTest.java

public class HeroTest {
    private Hero hero;

    @Before
    public void setUp() {
        hero = new Hero("HeroName", 5, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("HeroName", hero.getName());
    }

    @Test
    public void testSetName() {
        hero.setName("SuperHero");
        assertEquals("SuperHero", hero.getName());
    }

    @Test
    public void testGetXCoordinate() {
        assertEquals(5, hero.getXCoordinate());
    }

    @Test
    public void testSetXCoordinate() {
        hero.setXCoordinate(10);
        assertEquals(10, hero.getXCoordinate());
    }

    @Test
    public void testGetYCoordinate() {
        assertEquals(5, hero.getYCoordinate());
    }

    @Test
    public void testSetYCoordinate() {
        hero.setYCoordinate(10);
        assertEquals(10, hero.getYCoordinate());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, hero.getScore());
    }

    @Test
    public void testSetScore() {
        hero.setScore(100);
        assertEquals(100, hero.getScore());
    }

    @Test
    public void testMove() {
        hero.move(3, -2);
        assertEquals(8, hero.getXCoordinate());
        assertEquals(3, hero.getYCoordinate());
    }

    @Test
    public void testIncreaseScore() {
        hero.increaseScore(20);
        assertEquals(20, hero.getScore());
    }
}

// File: EnemyTest.java

public class EnemyTest {
    private Hero hero;
    private Enemy enemy;

    @Before
    public void setUp() {
        hero = new Hero("BraveHero", 2, 2);
        enemy = new Enemy(2, 2);
    }

    @Test
    public void testGetXCoordinate() {
        assertEquals(2, enemy.getXCoordinate());
    }

    @Test
    public void testSetXCoordinate() {
        enemy.setXCoordinate(5);
        assertEquals(5, enemy.getXCoordinate());
    }

    @Test
    public void testGetYCoordinate() {
        assertEquals(2, enemy.getYCoordinate());
    }

    @Test
    public void testSetYCoordinate() {
        enemy.setYCoordinate(7);
        assertEquals(7, enemy.getYCoordinate());
    }

    @Test
    public void testInteract() {
        assertEquals(0, hero.getScore());
        enemy.interact(hero);
        assertEquals(-10, hero.getScore());
    }
}