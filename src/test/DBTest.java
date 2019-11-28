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

    @BeforeClass
    public void setUp() {
        popup = new WarningUpdatePopup(driverWinium);
        planifi = popup.cancelWarningPopup();
        // planifi = new Planifi(driverWinium);
    }

    @BeforeMethod
    public void preconditions(){
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
     * @param projectName
     */
    @Test(dataProvider = "projectsNameProvider")
    public void testMPP549(String projectName)  {
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

    @Test
    public void testMPP549NEW() throws SQLException {
        initDB("UPDATE wbs1\n set status = 'I'\n WHERE wbs2 = 'TP'");
    }


}
