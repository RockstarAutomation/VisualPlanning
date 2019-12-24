import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

import static planify.common.sidebar.Sidebar.setFirstCheckBox;
import static planify.common.sidebar.Sidebar.waitFiveSeconds;

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setFirstCheckBox();
        planifi.applyOptionsFilter();
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
    public void employeeTest(){

        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .clickOnSomeProject("Gajahav Ijdihakt");
        waitFiveSeconds();
        WebElement  element = driverWinium.findElement(By.name("EMPLOYEE / ROLE"));
            element = element.findElement(By.className("ListView"));
            element = element.findElement(By.className("ListBoxItem")).findElement(By.name("Abbott,  Susan"));
            WebElement moveTo = driverWinium.findElement(By.id("UserControl"));
            moveTo = moveTo.findElement(By.name("DISCIPLINE"));
            Actions mouseHover = new Actions(driverWinium);
            mouseHover.dragAndDrop(element, moveTo).build().perform();
            waitFiveSeconds();
        }
    }

