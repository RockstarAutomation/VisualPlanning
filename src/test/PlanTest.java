import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;
import planify.tools.Listener;

import java.io.IOException;

@Listeners(Listener.class)
public class PlanTest extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;
    private SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
//        popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
        planifi = new Planifi(driverWinium);
        softAssert = new SoftAssert();
    }

    @DataProvider
    public Object[][] stringProvider() {
        return new Object[][]{
                {"Gajahav Ijdihakt"}
        };
    }

    @Story("Check if searching works appropriately by typing into 'Search' field in 'Projects tab")
    @Test(dataProvider = "stringProvider")
    public void testMPP534(String value) throws IOException {
        boolean flag = planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .fillSearchField(value)
                .clickPlanCrudGoToPlan()
                .listWithProjects()
                .checkIfThereIsProjectByAttribute(value);
        Assert.assertTrue(flag,
                "There is not any matches");
    }

    @DataProvider
    public Object[][] intProvider() {
        return new Object[][]{
                {"Gajahav Ijdihakt"}
        };
    }


    @Story("Check if Project related information displays in 'Details' tab by clicking on 'Name' of some Project")
    @Test(dataProvider = "intProvider")
    public void testMPP535(String projectName) {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject(projectName)
                .gotoDetailsBar()
                .clickOnSummaryExtendButton();
    }


    @Story("Check if ‘My Project’ On/Off switches toggle exists and works appropriately in 'Filters' tab")
    @Test
    public void testMPP548() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOffFirstToggle()
                .clickOnFirstToggle();
    }

    @Story("Check if clicking on ‘Hide’ button in 'Filters', 'Projects', and 'Employee' tab cause them to collapse and expand")
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
                .openEmployeeRoleTabButton()
                .hideProjectsTab()
                .openProjectsTab();
    }

    @Story("Check if 'Settings’ pop up opens by clicking on 'Settings' icon in 'Project' tab")
    @Test
    public void testMPP536() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickSettingsPopupButton()
                .closeSettingsPopup();
    }


    @Story("Verify if ‘Office/Organization’ checkboxes are checkabale in 'Filters' tab")
    @Test
    public void testMPP552() throws Exception {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .selectAllOfficeOrganizationCheckBoxes()
                //Post condition
                .clearOptionsFilter();
    }

    @DataProvider
    public Object[][] methodProvider() {
        return new Object[][]{
                {"Total", "Weekly"}
        };
    }

    @Story("Check possibility to select an option from 'Default Method' drop down in 'Settings' pop up")
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

    @DataProvider
    public Object[][] milestonesProjectsProvider() {
        return new Object[][]{
                {"A. E. G. High Tension Factory"}
        };
    }

    @Story("Check if ‘Projects with Milestones’ On/Off switches toggle exists and work appropriately in 'Filters' tab")
    @Test(dataProvider = "milestonesProjectsProvider")
    public void testMPP3310(String project) throws IOException {
        boolean flag = planifi.gotoPlanPart()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnFivthToggle()
                .applyOptionsFilter()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .listWithProjects()
                .checkIfThereIsProjectByAttribute(project);
        Assert.assertTrue(flag,"This project is not includes milestones");
        planifi.gotoPlanPart()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnFivthToggle();
    }

    @Story("Verify if ‘Project Manager’ checkboxes are checkabale in 'Filters' tab")
    @Test
    public void testMPP555() {
        planifi.gotoPlanPart()
                .gotoSidebar()
                .clickProjectManagerDropDown();
        Assert.assertTrue(planifi.gotoSidebar().checkIfProjectManagerDropDownIsClickable(),
                "The Project Manager DropDown is not enable");

    }


    @Story("Verify if 'Project Type’ checkboxes are checkabale in 'Filters' tab")
    @Test
    public void testMPP3311() {
        planifi.gotoPlanPart()
                .gotoSidebar()
                .clickProjectTypeDropDown();
        Assert.assertTrue(planifi.gotoSidebar().checkIfProjectTypeDropDownIsClickable(),
                "The Project Type is not enable");
    }


    @Story("Verify if ‘PIC’ checkboxes are checkabale in 'Filters' tab")
    @Test
    public void testMPP557() {
        planifi.gotoPlanPart()
                .gotoSidebar()
                .clickPICDropDown();
        Assert.assertTrue(planifi.gotoSidebar().checkIfPICDropDownIsClickable(),
                "The PIC dropdown is not enable");
    }

    @DataProvider
    public Object[][] projectsProvider() {
        return new Object[][]{
                {"Empire State Building", "Fujahav"}
        };
    }

    @Story("Check if after clicking on 'Clear’ button in 'Filters' tab all previously settled filters are discarded")
    @Test(dataProvider = "projectsProvider")
    public void testMPP528(String projectAfterFilter, String projectBeforeFilter) throws IOException {
        boolean flag = planifi.gotoPlanPart()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnThirdToggle()
                .clickOfficeOrganizationDropDown()
                .selectAllOfficeOrganizationCheckBoxes()
                .applyOptionsFilter()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .listWithProjects()
                .checkIfThereIsProjectByAttribute(projectAfterFilter);
        softAssert.assertTrue(flag,"The filters do not work correct");
        planifi.clearOptionsFilter();
        softAssert.assertTrue(planifi.gotoPlanPart().clickPlanCrudGoToPlan().listWithProjects().checkIfThereIsProjectByAttribute(projectBeforeFilter),
                "The Clear button does not work correct");
    }

    @DataProvider
    public Object[][] stuffProvider() {
        return new Object[][]{
                {"Gajahav Ijdihakt", "Abbot", "Abbott,  Susan"}
        };
    }

    @Story("Check if searching works appropriately by typing into 'Search' field")
    @Test(dataProvider = "stuffProvider")
    public void testMPP627(String project, String employee, String employeePath) {
        Boolean employeeFlag = planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject(project)
                .searchEmployee(employee)
                .getListOfEmployees()
                .checkIfThereIsAnEmployeeByName(employeePath);
        Assert.assertTrue(employeeFlag, "There are not employee with this name");
    }


    @Story(" Verify if dropdowns works appropriately in ‘Office/Organization’ block in 'Filters' tab")
    @Test
    public void testMPP553() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickOfficeOrganizationDropDown()
                .openAllDropdownsOfficeOrganization();
    }

}
