import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogicsLRTest {

    private String SWLStr;

    @BeforeMethod
    private void before(){
        SWLStr = "2100";
    }

    @Test ()
    private void testDavitWeightCalc() {
        before();

        double davitWeight = LogicsLR.davitWeightCalc();

    }
}