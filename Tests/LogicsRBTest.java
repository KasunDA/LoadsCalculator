import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsRBTest
{
    LogicsRB test1 = new LogicsRB();
    RBPanel test11 = new RBPanel();

    @BeforeMethod
    private void before()
    {
        test1.weightOfRB = 450.0;
        test1.noOfPeople = 6.0;
    }

    @Test
    public void testWeightInRbCalc()
    {
        before();

        test11.personWeight = 75.0;

        assertEquals(test1.weightInRB, 540.0);
    }

    @Test
    public void testTotalWeightCalc()
    {
        assertEquals(test1.totalWeight, 990.0);
    }

    @Test
    public void testDavitWeightCalc()
    {
        assertEquals(test1.davitWeight, 990.0);
    }
}