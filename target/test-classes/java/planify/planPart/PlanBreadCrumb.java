package planify.planPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.common.data.EmployeeComponentsPlanPart;
import planify.common.data.ProjectsComponentsPlanPart;
import planify.common.data.ProjectsContainerPlanPart;
import planify.common.mainParts.Plan;
import planify.common.popup.SettingsPopup;
import planify.planPart.functionalityEstimate.DetailsEstimateOptionsBar;

import java.util.ArrayList;
import java.util.List;

public class PlanBreadCrumb extends Plan {
    private List<ProjectsComponentsPlanPart> listOfProjects;
    private List<EmployeeComponentsPlanPart> listOfEmployees;

    public PlanBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

//.findElements(By.className("TextBlock"))
    private void initElements() {
        listOfProjects= new ArrayList<>();
        for(WebElement current : getWebProjectPart().findElements(By.className("ListBoxItem"))){
            listOfProjects.add(new ProjectsComponentsPlanPart(current));
        }
    }

                //Projects tab
    //PageObject

    private WebElement getWebProjectPart() {
        return driver.findElementByName("PROJECTS");
    }

    private WebElement getSearchFieldProjectsPartWeb() {
        return getWebProjectPart().findElement(By.className("TextBox"));
    }

    private WebElement getWebSettingsPopupButton(){
        return getWebProjectPart().findElement(By.className("Image"));
    }

    private WebElement getWebHideProjectsTabButton(){
        return getWebProjectPart().findElement(By.id("ExpanderButton"));///button[@Name='PROJECTS']
    }

    private WebElement getWebOpenProjectsTabButton(){
        return getWebHideProjectsTabButton().findElement(By.className("Text"));
    }
    //Functionality

    private void clickSearchFieldProjectsPart() {
        getSearchFieldProjectsPartWeb().click();
    }

    private void clearSearchFieldProjectsPart() {
        getSearchFieldProjectsPartWeb().clear();
    }


    private void setSearchFieldProjectsPart(String value) {
        getSearchFieldProjectsPartWeb().sendKeys(value);
    }

    //BusinessLogic

    public SettingsPopup clickSettingsPopupButton(){
        getWebSettingsPopupButton().click();
        return  new SettingsPopup(driver);
    }

    public ProjectsContainerPlanPart listWithProjects(){
        return new ProjectsContainerPlanPart(listOfProjects);
    }


    public PlanBreadCrumb fillSearchField(String value) {
        clickSearchFieldProjectsPart();
        clearSearchFieldProjectsPart();
        setSearchFieldProjectsPart(value);
        return new PlanBreadCrumb(driver);
    }

    public WebElement getProjectByName(String name){
        return driver.findElementByName("PROJECTS").findElement(By.name("VisualPlanning.KeyValueVm")).findElement(By.name(name));
    }

    public DetailsEstimateOptionsBar clickOnSomeProject(String name){
        getProjectByName(name).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(WebElement current: driver.findElementByName("EMPLOYEE / ROLE").findElement(By.className("ListView"))
        .findElements(By.name("VisualPlanning.GetEmployeeVisualsQueryResponse"))){
            listOfEmployees.add(new EmployeeComponentsPlanPart(current, driver));
        }
        return new DetailsEstimateOptionsBar(driver);
    }

    public List<EmployeeComponentsPlanPart> getListOfEmployees(){
        return listOfEmployees;
    }

    public PlanBreadCrumb hideProjectsTab(){
        getWebHideProjectsTabButton().click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PlanBreadCrumb(driver);
    }

    public PlanBreadCrumb openProjectsTab(){
        getWebOpenProjectsTabButton().click();
        return new PlanBreadCrumb(driver);
    }

                                    //Employee tab

    //PageObject
    private WebElement getWebEmployeeTab(){
        return driver.findElement(By.name("EMPLOYEE / ROLE"));
    }

    private WebElement getWebHideEmployeeRoleTabButton(){
        //return getWebEmployeeTab().findElement(By.name("EMPLOYEE / ROLE"));
        return getWebEmployeeTab().findElement(By.id("ExpanderButton"));
    }

    private WebElement getWebOpenEmployeeRoleTabButton(){
        return getWebHideEmployeeRoleTabButton().findElement(By.className("Text"));
    }

    //Functionality

    //Business Logic

    public PlanBreadCrumb hideEmployeeRoleTab(){
        getWebHideEmployeeRoleTabButton().click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PlanBreadCrumb(driver);
    }


    public PlanBreadCrumb openEmployeeRoleTab(){
        getWebOpenEmployeeRoleTabButton().click();
        return new PlanBreadCrumb(driver);
    }





}
