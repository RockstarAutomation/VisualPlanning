import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

public class SmokeTests extends TestRunner {
    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
//        popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
        planifi = new Planifi(driverWinium);
    }

    /**
     * [Plan] Check if 'Plan' tab opens by clicking on its title
     */
    @Test
    public void testMPP1232() {
        planifi.gotoForecastPart()
                .gotoPlanPart();
        Assert.assertTrue(planifi.checkIfEstimateBreadCrumbIsVisible()
                , "The Estimate breadcrumb is not displayed");
    }

    /**
     * [Manage/Project Staffing] Check if 'Project Staffing' tab opens by clicking on its title
     */
    @Test
    public void testMPP1211() {
        boolean flag = planifi.gotoManagePart()
                .gotoProjectStaffingBreadCrumb()
                .checkIfProjectStaffingIsDisplayed();
        Assert.assertTrue(flag, "The project Staffing tab is not displayed");
    }

    /**
     * [Manage/Assignments] Check if 'Assignments' tab opens by clicking on its title
     */

    @Test
    public void testMPP1336() {
        boolean flag = planifi
                .gotoManagePart()
                .gotoAssignmentsBreadCrumb()
                .checkIfAssignmentsIsDisplayed();
        Assert.assertTrue(flag, "The Assignments tab is not displayed");
    }

    /**
     * [Manage/Billing Projection] Check if 'Billing Projection' tab opens by clicking on its title
     */
    @Test
    public void testMPP1474() {
        boolean flag = planifi
                .gotoManagePart()
                .gotoBillingProjectionBreadCrumb()
                .checkIfBillingProjectionIsDisplayed();
        Assert.assertTrue(flag, "The Billing Projection is not displayed");
    }

    /**
     * [Manage/Revenue] Check if 'Revenue' tab opens by clicking on its title
     */
    @Test
    public void testMPP4058() {
        boolean flag = planifi
                .gotoManagePart()
                .gotoRevenueBreadCrumb()
                .checkIfRevenueIsDisplayed();
        Assert.assertTrue(flag, "The Revenue tab is not displayed");
    }

    /**
     * [Manage/Earned Value] Check if 'Earned Value' tab opens by clicking on its title
     */
    @Test
    public void testMPP1691() {
        boolean flag = planifi
                .gotoManagePart()
                .gotoEarnedValueBreadCrumb()
                .checkIfEarnedValueIsDisplayed();
        Assert.assertTrue(flag, "The Earned Value tab is not displayed");
    }

    /**
     * [Forecast/Projects] Check if 'Projects ' tab opens by clicking on its title
     */
    @Test
    public void testMPP1629() {
        boolean flag = planifi
                .gotoForecastPart()
                .gotoProjectsBreadCrumb()
                .checkIfProjectsTabIsDisplayed();
        Assert.assertTrue(flag, "The Projects tab is not displayed");
    }

    /**
     * [Forecast/Schedule] Check if 'Schedule' tab opens by clicking on its title
     */
    @Test
    public void testMPP1963() {
        boolean flag = planifi
                .gotoForecastPart()
                .gotoScheduleBreadCrumb()
                .checkIfScheduleTabIsDisplayed();
        Assert.assertTrue(flag, "The Schedule tab is not displayed");
    }

    /**
     * [Forecast/Employee Schedule] Check if 'Schedule' tab opens by clicking on its title
     */
    @Test
    public void testMPP3084() {
        boolean flag = planifi
                .gotoForecastPart()
                .gotoEmployeeScheduleBreadCrumb()
                .checkIfEmployeeScheduleIsDisplayed();
        Assert.assertTrue(flag, "The Employee Schedule tab is not displayed");
    }

    /**
     * [Forecast/Capacity] Check if 'Capacity' tab opens by clicking on its title
     */
    @Test
    public void testMPP1892() {
        boolean flag = planifi
                .gotoForecastPart()
                .gotoCapacityBreadCrumb()
                .checkIfCapacityTabIsDisplayed();
        Assert.assertTrue(flag, "The Capacity tab is not displayed");
    }

    @DataProvider
    public Object[][] projectProvider() {
        return new Object[][]{
                {
                "Gajahav Ijdihakt"
                }
        };
    }

    /**
     * [Plan/Details] Check if 'Details' tab appears by selecting some project from 'Projects' tab
     * @param projectName
     */
//TODO check if all elements of details bar are visible
    @Test(dataProvider = "projectProvider")
    public void testMPP638(String projectName){
        boolean flag = planifi
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject(projectName)
                .gotoDetailsBar()
                .checkIfDetailsTitleIsDisplayed();
        Assert.assertTrue(flag,  "The details title is not displayed");
    }

    @DataProvider
    public Object[][] detailsProvider(){
        return new Object[][]{
                {"010101"}
        };
    }
    //(010101)

    @Test(dataProvider = "detailsProvider")
    public void testMPP940(String projectName){
        boolean flag = planifi
                .gotoPlanPart()
                .clickPlanCrudGoToEstimate()
                .clickOnProjectByName(projectName)
                .gotoDetailsBar()
                .checkIfProjectRealedInformationIsDisplayed(projectName);
        Assert.assertTrue(flag, "The project related info does not appear");
    }
}

