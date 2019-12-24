package planify.common;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.CRUD;
import planify.common.mainParts.Forecast;
import planify.common.mainParts.Manage;
import planify.common.mainParts.Plan;
import planify.common.options.details.DetailsBar;
import planify.common.sidebar.Sidebar;


public class Planifi extends CRUD {
    public Planifi(WiniumDriver webDriver) {
        super(webDriver);
    }

    //Page object

    private WebElement getWebPlanPart(){
        return driver.findElement(By.name("PLAN"));
    }

    private WebElement getWebForecastPart(){
        return driver.findElement(By.name("FORECAST"));
    }

    private WebElement getWebManagePart(){
        return driver.findElement(By.name("MANAGE"));
    }


    //Functionality
    public boolean checkIfEstimateBreadCrumbIsVisible(){
        return  driver.findElementByName("ESTIMATE").isDisplayed();
    }

    //Business logic
    @Step("Switch to Plan tab")
    public Plan gotoPlanPart() {
        getWebPlanPart().click();
        return new Plan(driver);
    }

    @Step("Switch to Forecast tab")
    public Forecast gotoForecastPart() {
        getWebForecastPart().click();
        return new Forecast(driver);
    }

    @Step("Switch to Manage tab")
    public Manage gotoManagePart() {
        getWebManagePart().click();
        return new Manage(driver);
    }

    public Sidebar gotoSidebar() {
        return new Sidebar(driver);
    }


    @Step("Clear all filters")
    public Planifi clearOptionsFilter() {
        gotoSidebar().clickSettingsDropDown();
        try {
            clickRight().clickRight().clickEnter();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }

    @Step("Apply all filters")
    public Planifi applyOptionsFilter() {
        gotoSidebar().clickSettingsDropDown();
        try {
            clickRight().clickRight().clickRight().clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }

    public DetailsBar gotoDetailsBar() {
        return new DetailsBar(driver);
    }


}
