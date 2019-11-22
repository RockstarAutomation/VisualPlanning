import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planify.common.CRUD;
import planify.common.Planifi;
import planify.common.mainParts.Plan;

public class MainTest extends  TestRunner{

    private Planifi planifi;

    @BeforeMethod
    public void setUp() {
        planifi = new Planifi(driverWinium);
    }

    @Test
    public void test(){
        planifi
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .
    }

}
