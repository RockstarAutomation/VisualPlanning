package planify.common.mainParts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.forecastPart.CapacityBreadCrumb;
import planify.forecastPart.EmployeeScheduleBreadCrumb;
import planify.forecastPart.ProjectsBreadCrumb;
import planify.forecastPart.ScheduleBreadCrumb;

public class Forecast extends Planifi {


    public Forecast(WiniumDriver webDriver) {
        super(webDriver);

    }

    private void initElements() {
    }

    //Page Object
    private WebElement getWebMainTab() {
        return driver.findElementByName("TabControlExt");
    }

    private WebElement getWebProjectsTab() {
        return getWebMainTab().findElement(By.name("Projects"));
    }

    private WebElement getWebScheduleTab() {
    return getWebMainTab().findElement(By.name("Schedule"));
    }

    private WebElement getWebEmployeeScheduleTab() {
        return getWebMainTab().findElement(By.name("Employee Schedule"));
    }

    private WebElement getWebCapacityTab() {
        return getWebMainTab().findElement(By.name("Capacity"));
    }


    //Functionality

    private void clickOnProjectsBreadCrumb(){
        getWebProjectsTab().click();
    }


    private void clickOnCapacityBreadCrumb(){
        getWebCapacityTab().click();
    }

    private void clickOnScheduleBreadCrumb(){
        getWebScheduleTab().click();
    }
    private void clickOnEmployeeScheduleCrumb(){
        getWebEmployeeScheduleTab().click();
    }

    public boolean checkIfProjectsTabIsDisplayed(){
        return getWebProjectsTab().isDisplayed();
    }

    public boolean checkIfScheduleTabIsDisplayed(){
        return getWebScheduleTab().isDisplayed();
    }

    public boolean checkIfEmployeeScheduleIsDisplayed(){
        return getWebEmployeeScheduleTab().isDisplayed();
    }

    public boolean checkIfCapacityTabIsDisplayed(){
        return getWebCapacityTab().isDisplayed();
    }

    //Business logic

    public CapacityBreadCrumb gotoCapacityBreadCrumb(){
        clickOnCapacityBreadCrumb();
        return new CapacityBreadCrumb(driver);
    }

    public ProjectsBreadCrumb gotoProjectsBreadCrumb(){
        clickOnProjectsBreadCrumb();
        return new ProjectsBreadCrumb(driver);
    }

    public ScheduleBreadCrumb gotoScheduleBreadCrumb(){
        clickOnScheduleBreadCrumb();
        return new ScheduleBreadCrumb(driver);
    }

    public EmployeeScheduleBreadCrumb gotoEmployeeScheduleBreadCrumb(){
        clickOnEmployeeScheduleCrumb();
        return new EmployeeScheduleBreadCrumb(driver);
    }

}
