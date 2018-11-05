import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLBTest
{

    LogicsLB test1 = new LogicsLB();
    LBPanel test11 = new LBPanel();

    @BeforeMethod
    private void before()
    {
        test1.weightOfLB = 3500.0;
        test1.noOfPeople = 16.0;
    }

    @Test
    public void testWeightInLbCalc75()
    {
        before();

        test11.personWeight = 75.0;

        assertEquals(test1.weightInLB, 1670.0);
    }

    @Test
    public void testTotalWeightCalc75()
    {
        assertEquals(test1.totalWeight, 5170.0);
    }

    @Test
    public void testDavitWeightCalc75()
    {
        assertEquals(test1.davitWeight, 5170.0);
    }
}