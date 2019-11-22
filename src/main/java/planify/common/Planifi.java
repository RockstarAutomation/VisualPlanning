package planify.common;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.CRUD;
import planify.common.mainParts.Forecast;
import planify.common.mainParts.Manage;
import planify.common.mainParts.Plan;

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
}
