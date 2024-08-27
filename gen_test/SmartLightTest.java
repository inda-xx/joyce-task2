package tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



// File: SmartLightTest.java
public class SmartLightTest {
    private SmartLight smartLight;

    @Before
    public void setUp() {
        smartLight = new SmartLight("EcoLamp", false, 50, "Warm White", false);
    }

    @Test
    public void testInitialValues() {
        assertEquals("EcoLamp", smartLight.getModel());
        assertFalse(smartLight.isOn());
        assertEquals(50, smartLight.getBrightness());
        assertEquals("Warm White", smartLight.getColor());
        assertFalse(smartLight.isConnected());
    }

    @Test
    public void testSetModel() {
        smartLight.setModel("NewModel");
        assertEquals("NewModel", smartLight.getModel());
    }

    @Test
    public void testSetOn() {
        smartLight.setOn(true);
        assertTrue(smartLight.isOn());
    }

    @Test
    public void testTogglePower() {
        smartLight.togglePower();
        assertTrue(smartLight.isOn());
        smartLight.togglePower();
        assertFalse(smartLight.isOn());
    }

    @Test
    public void testSetBrightnessValid() {
        smartLight.setBrightness(75);
        assertEquals(75, smartLight.getBrightness());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBrightnessInvalid() {
        smartLight.setBrightness(200); // Assuming the solution will throw an exception which currently doesn't exist
    }

    @Test
    public void testSetColor() {
        smartLight.setColor("Red");
        assertEquals("Red", smartLight.getColor());
    }

    @Test
    public void testSetConnected() {
        smartLight.setConnected(true);
        assertTrue(smartLight.isConnected());
    }
}

// File: BrightnessControlTest.java
public class BrightnessControlTest {
    private BrightnessControl brightnessControl;

    @Before
    public void setUp() {
        brightnessControl = new BrightnessControl();
    }

    @Test
    public void testSetBrightness() {
        brightnessControl.setBrightness(80);
        // Add manual verification checks and ensure logic is as expected since there is printing involved
    }
}

// File: GadgetTest.java
public class GadgetTest {
    private Gadget gadget;

    @Before
    public void setUp() {
        gadget = new Gadget("SmartDevice", "Utility");
    }

    @Test
    public void testShowGadget() {
        // Since showGadget prints to console, you may need additional frameworks for capture or set expectations manually
        gadget.showGadget();
        // Verify by observation: Expected output is "QuickFix is available!"
    }
}