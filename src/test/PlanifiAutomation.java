import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;
import planify.planPart.PlanBreadCrumb;

import java.io.IOException;

public class PlanifiAutomation extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
//        popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
        planifi = new Planifi(driverWinium);
    }

    @DataProvider
    public Object[][] stringProvider() {
        return new Object[][]{
                {"Name","Gajahav Ijdihakt"}
        };
    }

    /**
     * Check if searching works appropriately by typing into 'Search' field in 'Projects tab
     * @param projectAttribute
     * @param value
     * @throws IOException
     */
    @Test(dataProvider = "stringProvider")
    public void testMPP534(String projectAttribute, String value) throws IOException {
        PlanBreadCrumb planBreadCrumb = planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .fillSearchField(value);
        Assert.assertEquals(planBreadCrumb.getProjectByName(value).getAttribute(projectAttribute), value,
                "There is not any matches");
        planifi.applyOptionsFilter();
    }

    @DataProvider
    public Object[][] intProvider() {
        return new Object[][]{
                {"0000.001.00"}
        };
    }

    /**
     * Check if Project related information displays in 'Details' tab by clicking on 'Name' of some Project
     * @param projectName
     */
//    @Test(dataProvider = "intProvider")
//    public void testMPP535(String projectName) {
//        planifi.gotoPlanPart()
//                .clickPlanCrudGoToPlan()
//                .gotoProjectsContainerPlanPart()
//                .fillSearchField(projectName)
//
//                .applyOptionsFilter();
//
//    }


}
