package planify.common;

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

    public Plan gotoPlanPart(){
        return new Plan(driver);
    }

    public Forecast gotoForecastPart(){
        return new Forecast(driver);
    }

    public Manage gotoManagePart(){
        return new Manage(driver);
    }

    private WebElement getWebClearSetting(){
        return driver.findElementByName("CLEAR");
    }

    private WebElement getWebApplySetting(){
        return driver.findElementByName("APPLY");
        //return driver.findElementByXPath("//*[@Name='APPLY']");
    }

    public Sidebar gotoSidebar(){
        return new Sidebar(driver);
    }

    public Planifi clearOptionsFilter(){
        //getWebClearSetting().click();
        try {
            clickRight().clickRight().clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }

    public Planifi applyOptionsFilter(){
        //getWebApplySetting().click();
        gotoSidebar().clickSettingsDropDown();
        try {
            clickRight().clickRight().clickRight().clickEnter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Planifi(driver);
    }

    public DetailsBar gotoDetailsBar(){
        return new DetailsBar(driver);
    }


}
