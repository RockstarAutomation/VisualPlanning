import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import planify.common.InstallPlanifi;

import static planify.common.CRUD.waitFiveSeconds;
import static planify.common.CRUD.waitThreeMinute;

public class PlanifiInstall extends InstallTestRunner {
    private InstallPlanifi installPlanifi;


    /**
     * The method downloads a Planifi installer @BeforeClass
     */
    @BeforeClass
    public void setUp() {
        planifiDownload();
    }

    /**
     * The method prepare Winium driver and run the installer @BeforeTest
     */
    @BeforeTest
    public void runWinium(){
        waitFiveSeconds();
        installPlanifi = new InstallPlanifi(runWiniumDriver());
    }

    /**
     *[Win 10] Verify possibility to install the 'Visual Planning' application
     */
    @Test
    public void testMPP497() {
        waitFiveSeconds();
        installPlanifi.clickOnInstallButton();
        waitThreeMinute();
        installPlanifi.closeApplication();
    }

}
