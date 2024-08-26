// File: SpaceshipTest.java
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import original.Spaceship;

public class SpaceshipTest {

    private Spaceship spaceship;

    @Before
    public void setUp() {
        spaceship = new Spaceship("Voyager XL", 0.2, true);
    }

    @Test
    public void testGetModel() {
        assertEquals("Voyager XL", spaceship.getModel());
    }

    @Test
    public void testSetModel() {
        spaceship.setModel("Galaxy Cruiser");
        assertEquals("Galaxy Cruiser", spaceship.getModel());
    }

    @Test
    public void testGetSpeed() {
        assertEquals(0.2, spaceship.getSpeed(), 0.001);
    }

    @Test
    public void testSetSpeed() {
        spaceship.setSpeed(0.5);
        assertEquals(0.5, spaceship.getSpeed(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSpeedWithNegativeValue() {
        spaceship.setSpeed(-1.0);
    }

    @Test
    public void testIsOperational() {
        assertTrue(spaceship.isOperational());
    }

    @Test
    public void testSetOperational() {
        spaceship.setOperational(false);
        assertFalse(spaceship.isOperational());
    }
    
    @Test
    public void testPrintFleetInfo() {
        spaceship.printFleetInfo();
        // It's tough to assert console output, but we can verify no errors occur
    }
}

// File: GalacticTravelerTest.java
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import original.GalacticTraveler;
import original.Spaceship;

public class GalacticTravelerTest {

    private GalacticTraveler traveler;
    private Spaceship spaceship;

    @Before
    public void setUp() {
        spaceship = new Spaceship("Voyager XL", 0.2, true);
        traveler = new GalacticTraveler("Luna Stark", 29, "Earth", spaceship);
    }

    @Test
    public void testGetTravelerName() {
        assertEquals("Luna Stark", traveler.getTravelerName());
    }

    @Test
    public void testSetTravelerName() {
        traveler.setTravelerName("Luna Light");
        assertEquals("Luna Light", traveler.getTravelerName());
    }

    @Test
    public void testGetAge() {
        assertEquals(29, traveler.getAge());
    }

    @Test
    public void testSetAge() {
        traveler.setAge(30);
        assertEquals(30, traveler.getAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeAge() {
        traveler.setAge(-5);
    }

    @Test
    public void testGetHomePlanet() {
        assertEquals("Earth", traveler.getHomePlanet());
    }

    @Test
    public void testSetHomePlanet() {
        traveler.setHomePlanet("Mars");
        assertEquals("Mars", traveler.getHomePlanet());
    }

    @Test
    public void testGetSpaceship() {
        assertEquals(spaceship, traveler.getSpaceship());
    }

    @Test
    public void testSetSpaceship() {
        Spaceship newSpaceship = new Spaceship("Galactic Explorer", 0.4, true);
        traveler.setSpaceship(newSpaceship);
        assertEquals(newSpaceship, traveler.getSpaceship());
    }

    @Test
    public void testTravelTo() {
        traveler.travelTo("Mars");
        // Again, testing console output is difficult, check for exceptions
    }

    @Test
    public void testExploreGalaxy() {
        traveler.exploreGalaxy();
        // Check for runtime issues
    }
}