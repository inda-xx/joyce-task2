package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class StarshipTest {
    private Starship starship;

    @Before
    public void setUp() {
        starship = new Starship("Galactica", 2004);
    }

    @Test
    public void testSalute() {
        starship.salute();
        // No assertions here because we are just testing the method does not throw and the behavior can be observed in the console output
    }
}