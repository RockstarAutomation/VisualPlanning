package planify.common;

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

    //Business logic
    public Plan gotoPlanPart() {
        getWebPlanPart().click();
        return new Plan(driver);
    }

    public Forecast gotoForecastPart() {
        getWebForecastPart().click();
        return new Forecast(driver);
    }

    public Manage gotoManagePart() {
        getWebManagePart().click();
        return new Manage(driver);
    }

    public Sidebar gotoSidebar() {
        return new Sidebar(driver);
    }

    public Planifi clearOptionsFilter() {
        gotoSidebar().clickSettingsDropDown();
        try {
            clickRight().clickRight().clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }

    public Planifi applyOptionsFilter() {
        //getWebApplySetting().click();
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
