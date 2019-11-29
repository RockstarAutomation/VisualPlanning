import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

import java.io.IOException;
import java.sql.SQLException;

public class DBTest extends TestRunner {
    private Planifi planifi;
    private WarningUpdatePopup popup;

    //@BeforeClass
    @BeforeMethod
    public void setUp() {
     //   popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
         planifi = new Planifi(driverWinium);
    }

    //@BeforeMethod
    public void preconditions() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                //.clickOnFirstToggle()
                .clickOffFirstToggle()
                .clickOnSecondToggle()
                .applyOptionsFilter();
    }


    @DataProvider
    public Object[][] projectsNameProvider() {
        return new Object[][]{
                {"The White House"}
        };
    }


    /**
     * Check if ‘Active Projects Only’ On/Off switches toggle exists and works appropriately in 'Filters' tab
     *
     * @param projectName
     */
    @Test(dataProvider = "projectsNameProvider")
    public void testMPP549(String projectName) {
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

    @DataProvider
    public Object[][] projectsSerialNumberProvider() {
        return new Object[][]{
                {"0000.011.00"}
        };
    }

    @Test(dataProvider = "projectsSerialNumberProvider")
    public void testMPP549NEW(String project) throws SQLException {
        String postCondition = "UPDATE Pr \n" +
                "set status = 'A'\n" +
                "where wbs1 = '0000.011.00'";

        //precondition
        String preCondition = "UPDATE Pr\n" +
                "set status = 'I' \n" +
                "where wbs1 ='0000.011.00'";
        Boolean activeProject = planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOffFirstToggle()
                .clickOnFirstToggle()
                .clickOnSecondToggle()
                .applyOptionsFilter()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .fillSearchField(project)
                .checkIfThereIsAProjectByName(project);
        Assert.assertTrue(activeProject
                , "The project does not active or there is not any project with this name");
        databaseInit(preCondition);
        //test
        Boolean disableProject = planifi
                .applyOptionsFilter()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .checkIfThereIsAProjectByName(project);
        Assert.assertFalse(disableProject,
                "The project does not change his status");
        //post condition
        databaseInit(postCondition);
        Boolean previousStateOfProject = planifi
                .applyOptionsFilter()
                .gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .checkIfThereIsAProjectByName(project);
        Assert.assertTrue(previousStateOfProject );
    }


}
