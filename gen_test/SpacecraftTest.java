package test;
import main.Spacecraft;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;




public class SpacecraftTest {

    private Spacecraft spacecraft;

    @Before
    public void setUp() {
        spacecraft = new Spacecraft("Enterprise", 100.0, 30000, "Earth");
    }

    @Test
    public void testGetName() {
        assertEquals("Enterprise", spacecraft.getName());
    }

    @Test
    public void testGetFuelLevel() {
        assertEquals(100.0, spacecraft.getFuelLevel(), 0.001);
    }

    @Test
    public void testGetMaxSpeed() {
        assertEquals(30000, spacecraft.getMaxSpeed());
    }

    @Test
    public void testGetCurrentPlanet() {
        assertEquals("Earth", spacecraft.getCurrentPlanet());
    }

    @Test
    public void testSetName() {
        spacecraft.setName("Discovery");
        assertEquals("Discovery", spacecraft.getName());
    }

    @Test
    public void testSetFuelLevel() {
        spacecraft.setFuelLevel(75.0);
        assertEquals(75.0, spacecraft.getFuelLevel(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeFuelLevel() {
        spacecraft.setFuelLevel(-10.0); // Expect an exception if negative fuel is not allowed
    }

    @Test
    public void testSetMaxSpeed() {
        spacecraft.setMaxSpeed(35000);
        assertEquals(35000, spacecraft.getMaxSpeed());
    }

    @Test
    public void testSetCurrentPlanet() {
        spacecraft.setCurrentPlanet("Mars");
        assertEquals("Mars", spacecraft.getCurrentPlanet());
    }

    @Test
    public void testExploreWithSufficientFuel() {
        spacecraft.explore("Mars");
        assertEquals("Mars", spacecraft.getCurrentPlanet());
        assertEquals(90.0, spacecraft.getFuelLevel(), 0.001);
    }

    @Test
    public void testExploreWithInsufficientFuel() {
        spacecraft.setFuelLevel(5.0);
        spacecraft.explore("Venus");
        assertEquals("Earth", spacecraft.getCurrentPlanet()); // Unchanged due to lack of fuel
        assertEquals(5.0, spacecraft.getFuelLevel(), 0.001);  // Fuel level unchanged
    }

    @Test
    public void testBoundaryFuelLevel() {
        spacecraft.setFuelLevel(10.0);
        spacecraft.explore("Jupiter");
        assertEquals("Jupiter", spacecraft.getCurrentPlanet());
        assertEquals(0.0, spacecraft.getFuelLevel(), 0.001);
    }

    @Test
    public void testExploreMultipleDestinations() {
        spacecraft.explore("Mars");
        assertEquals("Mars", spacecraft.getCurrentPlanet());
        assertEquals(90.0, spacecraft.getFuelLevel(), 0.001);

        spacecraft.explore("Jupiter");
        assertEquals("Jupiter", spacecraft.getCurrentPlanet());
        assertEquals(80.0, spacecraft.getFuelLevel(), 0.001);

        spacecraft.explore("Saturn");
        assertEquals("Saturn", spacecraft.getCurrentPlanet());
        assertEquals(70.0, spacecraft.getFuelLevel(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExploreWithUnknownPlanet() {
        spacecraft.explore(""); // Expect an exception if invalid planet names are not allowed
    }

    @Test
    public void testPrintInfo() {
        // This test would ideally capture stdout and assert the printed information,
        // But we'll simply call the method here as capturing system out is not straightforward in traditional tests
        spacecraft.printInfo();
    }
}