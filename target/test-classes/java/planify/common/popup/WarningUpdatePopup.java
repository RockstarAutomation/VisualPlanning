package planify.common.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.CRUD;
import planify.common.Planifi;

import java.util.concurrent.TimeUnit;

public class WarningUpdatePopup extends CRUD {
    protected WebElement asdasd;

    protected WebElement confirmUpdateWarning;


    public WarningUpdatePopup(WiniumDriver webDriver) {
        super(webDriver);
    }

    private WebElement getWebOkButton(){
        return driver.findElement(By.name("OK"));
    }

    private WebElement getWebDownloadLink(){
        return driver.findElementByName("this link");
    }

    public void gotoDownloadPage(){
        getWebDownloadLink().click();
    }

    public Planifi cancelWarningPopup(){
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(getWebOkButton()));
        getWebOkButton().click();
        return new Planifi(driver);
    }
}
