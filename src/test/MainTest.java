import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

public class MainTest extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
        popup = new WarningUpdatePopup(driverWinium);
        planifi = popup.cancelWarningPopup();
    }

    @Test
    public void test() {
        planifi
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .closeApplication();
    }

}
