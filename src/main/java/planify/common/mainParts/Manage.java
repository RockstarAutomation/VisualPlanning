package planify.common.mainParts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public class Manage extends Planifi {
    @FindBy(name = "MANAGE")
    private WebElement manageCrud;

    public Manage(WiniumDriver webDriver) {
        super(webDriver);
    }

    protected void clickManageCrud() {
        manageCrud.click();
    }

}
