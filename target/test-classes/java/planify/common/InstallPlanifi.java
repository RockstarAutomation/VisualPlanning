package planify.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;

public class InstallPlanifi extends CRUD{

    public InstallPlanifi(WiniumDriver webDriver) {
        super(webDriver);
    }
//PageObject
    private void clickSomeWhere(){
         driver.switchTo().activeElement().click();
    }

    private WebElement getWebInstallWindow(){
        //return driver.findElement(By.id("TrustManagerPromptUI"));
        return driver.findElement(By.className("WindowsForms10.Window.8.app.0.7c35b5_r6_ad1"));
    }

    private WebElement getWebFirstPane(){
        return getWebInstallWindow().findElement(By.name("tableLayoutPanelOuter"));
    }

    private WebElement getWebSecondPane(){
        return getWebFirstPane().findElement(By.name("tableLayoutPanelOuter"));
    }

    private WebElement getWebInstallButton(){
        return getWebSecondPane().findElement(By.id("btnInstall"));
    }

    //Functionality

    public Planifi clickOnInstallButton(){
        clickSomeWhere();
        getWebInstallButton().click();
        return new Planifi(driver);
    }

}
