import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planify.common.InstallPlanifi;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

import java.util.Properties;

import static planify.common.CRUD.waitFiveSeconds;

public class PlanifiInstall extends InstallTestRunner {
    private InstallPlanifi installPlanifi;
    @BeforeMethod
    public void setUp() {
        installPlanifi = planifiDownload();
    }

    @Test
    public void testMPP497() {

        runWiniumDriver();
        waitFiveSeconds();
        waitFiveSeconds();
        waitFiveSeconds();
    installPlanifi.clickOnInstallButton()
            .gotoPlanPart()
            .clickPlanCrudGoToPlan()
            .applyOptionsFilter();
    }

    @Test
    public void test(){
        System.out.println("asldflnas");
    }

}
