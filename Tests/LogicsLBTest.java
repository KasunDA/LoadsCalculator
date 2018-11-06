import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsLBTest
{

    private LogicsLB logics = new LogicsLB();

    @BeforeSuite
    private void beforeSuite()
    {
        logics.LBweight = "3500";
        logics.PeopleNo = "16";
    }

    @Test
    void testWeightInLbCalc75()
    {
        LBPanel.personWeight = 75.0;
        double result = logics.weightInLbCalc();
        assertEquals(result, 1670.0);
    }

    @Test
    void testTotalWeightCalc75()
    {
        logics.weightInLB = 1670.0;
        double result = logics.totalWeightCalc();
        assertEquals(result, 5170.0);
    }

    @Test
    void testDavitWeightCalc75()
    {
        logics.totalWeight = 5170;
        double result = logics.davitWeightCalc();
        assertEquals(result, 5170.0);
    }

    //82,5

    @Test
    void testWeightInLbCalc82()
    {
        LBPanel.personWeight = 82.5;
        double result = logics.weightInLbCalc();
        assertEquals(result, 1802.0);
    }

    @Test
    void testTotalWeightCalc82()
    {
        logics.weightInLB = 1802.0;
        double result = logics.totalWeightCalc();
        assertEquals(result, 5302.0);
    }

    @Test
    void testDavitWeightCalc82()
    {
        logics.totalWeight = 5302.0;
        double result = logics.davitWeightCalc();
        assertEquals(result, 5302.0);
    }
}