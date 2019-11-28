package planify.common.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public class WarningDiscardChangesPopup extends Planifi {
    public WarningDiscardChangesPopup(WiniumDriver webDriver) {
        super(webDriver);
    }

    //Page Object
    private WebElement getWebMainPopup() {
        return driver.findElement(By.className("Window"));
    }

    private WebElement getWebYesButton(){
        return getWebMainPopup().findElement(By.name("YES"));
    }

    private WebElement getWebCancelButton(){
        return getWebMainPopup().findElement(By.name("CANCEL"));
    }

    //functionality

    //business logic


}
