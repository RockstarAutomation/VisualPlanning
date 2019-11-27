package planify.common.sidebar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sidebar extends Planifi {

    private static String NAME_FOR_PROJECT_TYPE_LIST = "VisualPlanning.KeyValueVm";
    public static String NAME_FOR_OFFICE_ORGANIZATION_LIST = "VisualPlanning.Operations.Node";
    private static String NAME_FOR_PROJECT_MANAGER_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_PIC_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_SUPERVISOR_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_SKILLS_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_TEAMS_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_CLIENT_LIST = "VisualPlanning.KeyValueVm";
    private static String NAME_FOR_ROLE_TYPE_LIST = "VisualPlanning.KeyValueVm";
//    private static String NAME_FOR__LIST = "VisualPlanning.KeyValueVm";
//    private static String NAME_FOR_CLIENT_LIST = "VisualPlanning.KeyValueVm";

    private static List<WebElement> listOfWebElements;

    //private static WiniumDriver driver;

    public Sidebar(WiniumDriver webDriver) {
        super(webDriver);
    }

    //Get web elements
    private WebElement getWebMainGroup() {
        return driver.findElementByClassName("Expander");
    }

    private WebElement getWebRoleTypeDropDown() {
        return getWebMainGroup().findElement(By.name("Role Type"));
    }

    private WebElement getWebPhaseTypeDropDown() {
        return getWebMainGroup().findElement(By.name("Phase Type"));
    }

    private WebElement getWebClientDropDown() {
        return getWebMainGroup().findElement(By.name("Client"));
    }

    private WebElement getWebTeamsDropDown() {
        return getWebMainGroup().findElement(By.name("Teams"));
    }

    private WebElement getWebSkillsDropDown() {
        return getWebMainGroup().findElement(By.name("Skills"));
    }

    private WebElement getWebPICDropDown() {
        return getWebMainGroup().findElement(By.name("PIC"));
    }

    private WebElement getWebProjectManagerDropDown() {
        return getWebMainGroup().findElement(By.name("Project Manager"));

    }

    private WebElement getWebProjectTypeDropDown() {
        return getWebMainGroup().findElement(By.name("Project Type"));
    }

    private WebElement getWebOfficeOrganizationDropDown() {
        return getWebMainGroup().findElement(By.name("Office/Organization"));
    }

    private WebElement getWebSettingsDropDown() {
        return getWebMainGroup().findElement(By.name("Settings"));
    }

    //Settings toggles
    private WebElement getWebSettingsTogglesGruop() {
        return getWebMainGroup().findElement(By.className("Expander"));
    }

    private WebElement getOnToggle() {
        return getWebSettingsTogglesGruop().findElement(By.name("ON"));
    }

    private WebElement getOffToggle() {
        return getWebSettingsTogglesGruop().findElement(By.name("OFF"));
    }

    private WebElement getWebHideSidebarButton() {
        return getWebMainGroup().findElement(By.id("ExpanderButton"));//.findElement(By.id("ExpanderButton"))
    }

    private WebElement getWebOpenSidebar() {
        return getWebHideSidebarButton().findElement(By.id("HeaderContent"));
        //return getWebMainGroup().findElement(By.name("FILTERS"));
    }


    //Click

    public Sidebar openSidebar() {
        //getWebOpenSidebar().click();
        try {
            clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Planifi hideSideBar() {
        //getWebHideSidebarButton().click();
        try {
            clickSettingsDropDown()
                    .clickUp()
                    .clickUp()
                    .clickEnter();

            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }


    public Sidebar clickOnFirstToggle() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getOnToggle().click();
        return new Sidebar(driver);

    }

    public Sidebar clickOnSecondToggle() {
        try {
            clickDown()
                    //.clickDown()
                    .clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Sidebar clickOnThirdToggle() {
        try {
            clickDown()
                    .clickDown()
                    .clickDown()
                    .clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Sidebar clickOnFourthToggle() {
        try {
            clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Sidebar clickOnFivthToggle() {
        try {
            clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Sidebar clickOnSixthToggle() {
        try {
            clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickDown()
                    .clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Sidebar(driver);
    }

    public Sidebar clickOffFirstToggle() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getOffToggle().click();
        return new Sidebar(driver);
    }

    public void clickRoleTypeDropDown() {
        getWebRoleTypeDropDown().click();
    }

    public void clickPhaseTypeDropDown() {
        getWebPhaseTypeDropDown().click();
    }

    public void clickClientDropDown() {
        getWebClientDropDown().click();
    }

    public void clickTeamsDropDown() {
        getWebTeamsDropDown().click();
    }

    public void clickSkillsDropDown() {
        getWebSkillsDropDown().click();
    }

    public void clickPICDropDown() {
        getWebPICDropDown().click();
    }

    public void clickProjectManagerDropDown() {
        getWebProjectManagerDropDown().click();
    }

    public void clickProjectTypeDropDown() {
        getWebProjectTypeDropDown().click();
    }

    public void clickOfficeOrganizationDropDown() {
        getWebOfficeOrganizationDropDown().click();
    }

    public Sidebar clickSettingsDropDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getWebSettingsDropDown().click();
        return new Sidebar(driver);
    }

    private List<WebElement> getListOfSideBarOptions(String elementPath) throws IOException {
        listOfWebElements = new ArrayList<>();
        File file = new File("C:\\Users\\User\\PlanifiPr\\output\\output.txt");
        BufferedWriter bf = new BufferedWriter(new FileWriter(file));
        //bf.write("2");
        for (WebElement element : driver.findElementsByName(elementPath)) {
            listOfWebElements.add(element);
            bf.write(element.toString());
        }
        bf.close();
        return listOfWebElements;
    }

    //TODO custom exception
    public void setOptionSidebar(String elementPath, String elementName) throws IOException {

        for (WebElement element1 : getListOfSideBarOptions(elementPath)) {
            if (driver.findElementByName(elementName).equals(element1)) {
                element1.findElement(By.className("CheckBox")).click();
                // System.out.println(1);
            } else throw new RuntimeException("There are not such element");
        }
    }

    ///../following-sibling:*[@ClassName='CheckBox']
    public static void setOptionByName() {
        // driver.findElementByXPath("//*[@ClassName='TreeView']/*[@Name='VisualPlanning.Operations.Node']/*[1][@Name='CSS LLC']/../following-sibling::*[@ClassName='CheckBox']")
        // driver.findElementByXPath("[@Name='CSS LLC']/../following-sibling::*[@ClassName='CheckBox']").click();
    }

    public static void setFirstCheckBox() {
        driver.findElementByClassName("CheckBox").click();
    }


}
