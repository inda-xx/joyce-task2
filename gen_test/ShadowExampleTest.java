package test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// File: ShadowExampleTest.java



public class ShadowExampleTest {
    
    private ShadowExample shadowExample;
    
    @Before
    public void setUp() {
        shadowExample = new ShadowExample("Real Name");
    }
    
    @Test
    public void testPrintName() {
        // There's no way to directly capture System.out.println output with JUnit, 
        // but we could refactor `printName` to return a string instead and verify that.
        // Thus only testing structure here.
        shadowExample.printName();
        assertNotNull(shadowExample);
    }
}

// File: CharacterTest.java



public class CharacterTest {

    private Character warrior;
    private Character mage;

    @Before
    public void setUp() {
        warrior = new Character("Aragorn", 87, "Warrior", 10, 8, true);
        mage = new Character("Gandalf", 2019, "Mage", 5, 10, true);
    }
    
    @Test
    public void testGettersAndSetters() {
        warrior.setName("NewName");
        assertEquals("NewName", warrior.getName());
        
        warrior.setAge(88);
        assertEquals(88, warrior.getAge());
        
        warrior.setType("Ranger");
        assertEquals("Ranger", warrior.getType());

        warrior.setStrength(12);
        assertEquals(12, warrior.getStrength());
        
        warrior.setIntelligence(9);
        assertEquals(9, warrior.getIntelligence());

        warrior.setActive(false);
        assertFalse(warrior.isActive());
    }

    @Test
    public void testPrintDetails() {
        warrior.printDetails();
        mage.printDetails();
        assertNotNull(warrior);
        assertNotNull(mage);
    }
    
    @Test
    public void testBattle() {
        assertTrue(warrior.getStrength() + warrior.getIntelligence() > mage.getStrength() + mage.getIntelligence());
        warrior.battle(mage);
        mage.battle(warrior);
        
        // Verify outcome strings by refactoring function to return calculation results instead of directly print
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
    public void testMove() {
        hero.move(5, 3);
        assertEquals(5, hero.getXCoordinate());
        assertEquals(3, hero.getYCoordinate());
    }
    
    @Test
    public void testIncreaseScore() {
        hero.increaseScore(15);
        assertEquals(15, hero.getScore());
    }
    
    @Test
    public void testGettersAndSetters() {
        hero.setName("Larry");
        assertEquals("Larry", hero.getName());
        
        hero.setXCoordinate(10);
        assertEquals(10, hero.getXCoordinate());
        
        hero.setYCoordinate(20);
        assertEquals(20, hero.getYCoordinate());

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
        enemy = new Enemy(0, 0);
        hero = new Hero("HeroName", 0, 0);
    }
    
    @Test
    public void testInteract() {
        int initialScore = hero.getScore();
        enemy.interact(hero);
        assertEquals(initialScore - 10, hero.getScore());
    }
    
    @Test
    public void testGettersAndSetters() {
        enemy.setXCoordinate(12);
        assertEquals(12, enemy.getXCoordinate());
        
        enemy.setYCoordinate(15);
        assertEquals(15, enemy.getYCoordinate());
    }
}