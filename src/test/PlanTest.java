import org.testng.Assert;
import org.testng.annotations.*;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;
import planify.planPart.PlanBreadCrumb;

import java.io.IOException;

public class PlanTest extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
        popup = new WarningUpdatePopup(driverWinium);
        planifi = popup.cancelWarningPopup();
        // planifi = new Planifi(driverWinium);
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
    public void testMPP527() {
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

    /**
     * Check if 'Settings’ pop up opens by clicking on 'Settings' icon in 'Project' tab
     */
    @Test
    public void testMPP536() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickSettingsPopupButton()
                .closeSettingsPopup();
    }


    /**
     * Verify if ‘Office/Organization’ checkboxes are checkabale in 'Filters' tab
     */
    @Test
    public void testMPP552() throws Exception {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .selectAllOfficeOrganizationCheckBoxes();
    }

    /**
     * Verify if dropdowns works appropriately in ‘Office/Organization’ block in 'Filters' tab
     */
    @Test
    public void testMPP553() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickOfficeOrganizationDropDown()
                .openAllDropdownsOfficeOrganization();
    }

    @DataProvider
    public Object[][] methodProvider() {
        return new Object[][]{
                {"Total", "Weekly"}
        };
    }

    /**
     * Check possibility to select an option from 'Default Method' drop down in 'Settings' pop up
     */
    @Test(dataProvider = "methodProvider")
    public void testMPP562(String methodName, String weekly) {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickSettingsPopupButton()
                .changeDefaultMethodSettingPopup(methodName)
                .saveChangesSettingsPopup()
                //after test
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickSettingsPopupButton()
                .changeDefaultMethodSettingPopup(weekly)
                .saveChangesSettingsPopup();

    }

    /**
     * Check if ‘Projects with Milestones’ On/Off switches toggle exists and work appropriately in 'Filters' tab
     */
    @Test
    public void testMPP3310(){

    }



}
