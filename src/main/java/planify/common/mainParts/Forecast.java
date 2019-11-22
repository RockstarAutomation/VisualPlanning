package planify.common.mainParts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public class Forecast extends Planifi {
    @FindBy(name = "FORECAST")
    private WebElement forecastCrud;

    public Forecast(WiniumDriver webDriver) {
        super(webDriver);
    }

    protected void clickForecastCrud() {
        forecastCrud.click();
    }
}
