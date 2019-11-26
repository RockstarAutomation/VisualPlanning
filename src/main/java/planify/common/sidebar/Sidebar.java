package planify.common.sidebar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.CRUD;
import planify.common.Planifi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sidebar extends Planifi {

    private static String NAME_FOR_PROJECT_TYPE_LIST = "VisualPlanning.KeyValueVm";
    public static String NAME_FOR_OFFICE_ORGANIZATION_LIST ="VisualPlanning.Operations.Node";
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

                private static WebElement SettingDropDown;
                private static WebElement RoleTypeDropDown;
                private static WebElement PhaseTypeDropDown;
                private static WebElement ClientDropDown;
                private static WebElement TeamsDropDown;
                private static WebElement SkillsDropDown;
                private static WebElement SupervisorDropDown;
                private static WebElement PICDropDown;
                private static WebElement ProjectManagerDropDown;
                private static WebElement ProjectTypeDropDown;
                private static WebElement OfficeOrganizationDropDown;
                //private static WiniumDriver driver;

    protected Sidebar(WiniumDriver webDriver) {
                    super(webDriver);
                }

                //Get web elements
                private static WebElement getWebRoleTypeDropDown() {
                    return driver.findElementByName("Role Type");
                }

                private static WebElement getWebPhaseTypeDropDown() {
                    return driver.findElementByName("Phase Type");
                }

                private static WebElement getWebClientDropDown() {
                    return driver.findElementByName("Client");
                }

                private static WebElement getWebTeamsDropDown() {
                    return driver.findElementByName("Teams");
                }

                private static WebElement getWebSkillsDropDown() {
                    return driver.findElementByName("Skills");
                }

                private static WebElement getWebPICDropDown() {
                    return driver.findElementByName("PIC");
                }

                private static WebElement getWebProjectManagerDropDown() {
                    return driver.findElementByName("Project Manager");
                }

                private static WebElement getWebProjectTypeDropDown() {
                    return driver.findElementByName("Project Type");
                }

                private static WebElement getWebOfficeOrganizationDropDown() {
                    return driver.findElementByName("Office/Organization");
                }

                private static WebElement getWebSettingsDropDown() {
                    return driver.findElementByName("Settings");
                }


                //Click
                public static void clickRoleTypeDropDown() {
                    getWebRoleTypeDropDown().click();
                }

                public static void clickPhaseTypeDropDown() {
                    getWebPhaseTypeDropDown().click();
                }

                public static void clickClientDropDown() {
                    getWebClientDropDown().click();
                }

                public static void clickTeamsDropDown() {
                    getWebTeamsDropDown().click();
                }

                public static void clickSkillsDropDown() {
                    getWebSkillsDropDown().click();
                }

                public static void clickPICDropDown() {
                    getWebPICDropDown().click();
                }

                public static void clickProjectManagerDropDown() {
                    getWebProjectManagerDropDown().click();
                }

                public static void clickProjectTypeDropDown() {
                    getWebProjectTypeDropDown().click();
                }

                public static void clickOfficeOrganizationDropDown() {
                    getWebOfficeOrganizationDropDown().click();
                }

                public static void clickSettingsDropDown() {
                    getWebSettingsDropDown().click();
                }

                private static List<WebElement> getListOfSideBarOptions(String elementPath)throws IOException {
                    listOfWebElements = new ArrayList<>();
                    File file = new File("C:\\Users\\User\\PlanifiPr\\output\\output.txt");
                    BufferedWriter bf = new BufferedWriter(new FileWriter(file));
                    //bf.write("2");
                    for(WebElement element : driver.findElementsByName(elementPath)){
                        listOfWebElements.add(element);
                        bf.write(element.toString());
                    }
                    bf.close();
                    return listOfWebElements;
                }
                //TODO custom exception
                public static void setOptionSidebar(String elementPath, String elementName)throws IOException  {

                    for(WebElement element1 : getListOfSideBarOptions(elementPath)){
                        if(driver.findElementByName(elementName).equals(element1)){
                        element1.findElement(By.className("CheckBox")).click();
                           // System.out.println(1);
            }
            else throw new RuntimeException("There are not such element");
        }
    }
///../following-sibling:*[@ClassName='CheckBox']
    public static void setOptionByName(){
       // driver.findElementByXPath("//*[@ClassName='TreeView']/*[@Name='VisualPlanning.Operations.Node']/*[1][@Name='CSS LLC']/../following-sibling::*[@ClassName='CheckBox']")
       // driver.findElementByXPath("[@Name='CSS LLC']/../following-sibling::*[@ClassName='CheckBox']").click();
    }

    public static void setFirstCheckBox(){
        driver.findElementByClassName("CheckBox").click();
    }

}
