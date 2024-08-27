package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {
    private ShadowExample shadowExample;

    @Before
    public void setUp() {
        shadowExample = new ShadowExample();
    }

    @Test
    public void testDemonstrateShadowing() {
        shadowExample.demonstrateShadowing();
        // No assertions here because we are just testing the method does not throw and the behavior can be observed in the console output
    }
}

package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 