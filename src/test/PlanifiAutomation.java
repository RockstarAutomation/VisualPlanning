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
                {"Name", "Gajahav Ijdihakt"}
        };
    }

    /**
     * Check if searching works appropriately by typing into 'Search' field in 'Projects tab
     *
     * @param projectAttribute
     * @param value
     * @throws IOException
     */
    @Test(dataProvider = "stringProvider")
    public void testMPP534(String projectAttribute, String value) {
        PlanBreadCrumb planBreadCrumb = planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .fillSearchField(value);
        Assert.assertEquals(planBreadCrumb.getProjectByName(value).getAttribute(projectAttribute), value,
                "There is not any matches");
    }

    @DataProvider
    public Object[][] intProvider() {
        return new Object[][]{
                {"0000.001.00", "0000.002.00"}
        };
    }


//TODO In progress

    /**
     * Check if Project related information displays in 'Details' tab by clicking on 'Name' of some Project
     *
     * @param projectName
     */
    @Test(dataProvider = "intProvider")
    public void testMPP535(String projectName) {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject(projectName)
                .gotoDetailsBar()
                .clickOnSummaryExtendButton();
    }

    /**
     * Check if ‘My Project’ On/Off switches toggle exists and works appropriately in 'Filters' tab
     */
    @Test
    public void testMPP548() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOffFirstToggle()
                .clickOnFirstToggle()
                .clickOnFourthToggle();
    }

    /**
     * Check if clicking on ‘Hide’ button in 'Filters', 'Projects', and 'Employee' tab cause them to collapse and expand
     */
    @Test
    public void testMPP527(){
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .hideSideBar()
                .gotoSidebar()
                .openSidebar()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .hideEmployeeRoleTab()
                .openEmployeeRoleTab()
                .hideProjectsTab()
                .openProjectsTab();
        //TODO assert
    }

    @DataProvider
    public Object[][] projectsNameProvider() {
        return new Object[][]{
                {"The White House"}
        };
    }

    /**
     * Check if ‘Active Projects Only’ On/Off switches toggle exists and works appropriately in 'Filters' tab
     * @param projectName
     */
    @Test(dataProvider = "projectsNameProvider")
    public void testMPP549(String projectName)  {
        //Preconditions
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                //.clickOnFirstToggle()
                .clickOffFirstToggle()
                .clickOnSecondToggle()
                .applyOptionsFilter();
        //test
        Boolean flag = null;
        try {
            flag = planifi.gotoPlanPart()
                    .clickPlanCrudGoToPlan()
                    .listWithProjects()
                    .checkIfThereIsProjectByAttribute(projectName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(flag, "The test with only active project failed");
    }


}
