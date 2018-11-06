import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogicsRBTest
{
    private LogicsRB logics = new LogicsRB();

    @BeforeSuite
    private void beforeSuite()
    {
        logics.RBweight = "450";
        logics.PeopleNo = "6";
    }

    @Test
    public void testWeightInRbCalc75()
    {
        RBPanel.personWeight = 75.0;
        double result = logics.weightInRbCalc();
        assertEquals(result, 540.0);
    }

    @Test
    public void testTotalWeightCalc75()
    {
        logics.weightInRB = 540;
        double result = logics.totalWeightCalc();
        assertEquals(result, 990.0);
    }

    @Test
    public void testDavitWeightCalc75()
    {
        double result = logics.davitWeightCalc();
        assertEquals(result, logics.davitWeight);
    }

// 82,5

    @Test
    public void testWeightInRbCalc82()
    {
        RBPanel.personWeight = 82.5;
        double result = logics.weightInRbCalc();
        assertEquals(result, 589.5);
    }

    @Test
    public void testTotalWeightCalc82()
    {
        logics.weightInRB = 589.5;
        double result = logics.totalWeightCalc();
        assertEquals(result, 1039.5);
    }

    @Test
    public void testDavitWeightCalc82()
    {
        double result = logics.davitWeightCalc();
        assertEquals(result, logics.davitWeight);
    }
}