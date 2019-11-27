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
        //List<String> nameAtt = new ArrayList<>();
        //WebElement lol = element.findElement(By.name("VisualPlanning.KeyValueVm")).findElement(By.name("0000.001.00"));
         for(WebElement current : elements){
        //if(current.findElement(By.name("0000.001.00")).getAttribute("Name").equals("0000.001.00")){
              //if(current.findElement(By.name("Gajahav Ijdihakt")).getAttribute("Name") == "Gajahav Ijdihakt")

             bf.write(current.findElement(By.className("TextBlock")).getAttribute("Name") );
        //}
//        for (int i = 1; i<elements.size();i++){
//            nameAtt.add(elements.get(i).getAttribute("Name"));
//        }
//        for(String lol : nameAtt) {
//            bf.write(lol);
//            Assert.assertNotEquals(lol, "0000.001.00");
        }
        bf.close();
        //else element = null;
        //Assert.assertEquals(lol.getAttribute("Name"), "0000.001.00");
        //Assert.assertNull(element);
        //Assert.assertEquals(element.findElement(By.name("0000.001.00")).getAttribute("Name"), "0000.001.00");
        //Assert.assertEquals(nameAtt.size(), 1);
    }

}
