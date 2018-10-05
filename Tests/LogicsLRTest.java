import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLRTest {

    String SWLStr;
    double davitWeight;

    @BeforeMethod

    private void setUp() {
       SWLStr = "2100";
    }

    @Test ()
    private void testDavitWeightCalc() {
        setUp();

        assertEquals(String.valueOf(davitWeight), "2310");
    }



}