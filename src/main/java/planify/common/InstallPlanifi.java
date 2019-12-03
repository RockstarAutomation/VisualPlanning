package planify.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;

public class InstallPlanifi extends CRUD{

    public InstallPlanifi(WiniumDriver webDriver) {
        super(webDriver);
    }
//PageObject
    private WebElement getWebInstallWindow(){
        return driver.findElement(By.name("TrustManagerDialog"));
    }

    private WebElement getWebInstallButton(){
        return getWebInstallWindow().findElement(By.name("Install"));
    }

    //Functionality

    public Planifi clickOnInstallButton(){
        getWebInstallButton().click();
        return new Planifi(driver);
    }

}
