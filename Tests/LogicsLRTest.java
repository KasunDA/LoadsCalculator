import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLRTest {

    LogicsLR testSWL = new LogicsLR();

   @BeforeMethod
   private void before()
   {
        testSWL.SWL = 2100;
   }

    @Test ()
    public void testDavitWeightCalc() {
        before();
        testSWL.SWL = 2100;

        assertEquals(String.valueOf(testSWL.davitWeight), "2310");
    }
}