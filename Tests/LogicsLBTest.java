
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLBTest
{
    LBPanel panel = new LBPanel();
    LogicsLB logics = new LogicsLB();
    @BeforeMethod
    private void before()
    {
        double weightOfLB = 3500.0;
        double noOfPeople = 16.0;
    }

    @Test
    public void testWeightInLbCalc75()
    {

        double personWeight = 75.0;

        double result = logics.weightInLbCalc();
        assertEquals(result, 1670.0);
    }

    @Test
    public void testTotalWeightCalc75()
    {
        double result = logics.totalWeightCalc();
        assertEquals(result, 5170.0);
    }

    @Test
    public void testDavitWeightCalc75()
    {
        double result = logics.davitWeightCalc();
        assertEquals(result, 5170.0);
    }
}