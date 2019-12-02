import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static planify.common.sidebar.Sidebar.*;

public class MainTest extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
//        popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
        planifi = new Planifi(driverWinium);
    }

    @Test
    public void test() {
        planifi
                .gotoPlanPart()
                .clickPlanCrudGoToPlan();
    }

    @Test
    public void gotoEstimationByXpath() {
        planifi
                .gotoPlanPart()
                .clickPlanCrudGoToEstimate();

    }

    @Test
    public void maximazeTest() {
        planifi.gotoPlanPart()
                .maximazeWindowApplication()
                .minimazeWindowApplication();
    }

    @Test
    public void chooseOption() throws IOException {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickOfficeOrganizationDropDown();
        //setOptionSidebar(NAME_FOR_OFFICE_ORGANIZATION_LIST, "CSS LLC");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setFirstCheckBox();
        //setOptionByName();
        planifi.applyOptionsFilter();
//        planifi.clearOptionsFilter();
        //driverWinium.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAttribute() throws IOException {
        File file = new File("C:\\Users\\User\\PlanifiPr\\output\\output.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(file));
        planifi.gotoPlanPart()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnFirstToggle()
                .clickOnSecondToggle();
        WebElement element = driverWinium.findElementByName("PROJECTS");
        List<WebElement> elements = element.findElements(By.className("ListBoxItem"));
        for (WebElement current : elements) {
            bf.write(current.findElement(By.className("TextBlock")).getAttribute("Name"));

            bf.close();

        }
    }

        @Test
         public void testBD() throws SQLException {
            String preCondition = "UPDATE Pr\n" +
                    "set status = 'I' \n" +
                    "where wbs1 ='0000.011.00'";
            ArrayList<String> list = (ArrayList<String>) databaseInit(preCondition);
            Assert.assertEquals(list.size(), 4, "massage");
        }

        @Test
    public void employeeTest(){

        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject("Gajahav Ijdihakt");
                //.getListOfEmployees()
                //.getEmplyeeByName("Abbott, Susan");
        WebElement  element = driverWinium.findElement(By.name("EMPLOYEE / ROLE"));
            element = element.findElement(By.className("ListView"));
            element = element.findElement(By.className("ListBoxItem")).findElement(By.name("Abbott,  Susan"));
            element.click();
        }
    }

