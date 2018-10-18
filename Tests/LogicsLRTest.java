import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLRTest {

    private double SWL;

    @BeforeMethod
    private void before(){
        SWL = 2100;
    }

    @Test ()
    private void testDavitWeightCalc() {
        before();

        double davitWeight = LogicsLR.davitWeightCalc(String.valueOf(SWL));

        assertEquals(String.valueOf(davitWeight), "2310");
    }
}