package planify.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class CRUD {
    protected WebDriver driver;

    @FindBy(name = "PLAN")
    private WebElement planCrud;

    @FindBy(name = "MANAGE")
    private WebElement manageCrud;

    @FindBy(name = "FORECAST")
    private WebElement forecastCrud;

    protected void clickPlanCrud() {
        planCrud.click();
    }

    protected void clickManageCrud() {
        manageCrud.click();
    }

    protected void clickForecastCrud() {
        forecastCrud.click();
    }

}
