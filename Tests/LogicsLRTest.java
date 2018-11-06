import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLRTest {

   @BeforeMethod
   private void before()
   {
        LogicsLR.davitWeightCalc("2100");
   }

    @Test ()
    public void testDavitWeightCalc()
    {
        assertEquals(LogicsLR.davitWeight, 2310.0);
    }
}