package planify.common.mainParts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public class Manage extends Planifi {
    @FindBy(name = "MANAGE")
    private WebElement manageCrud;

    public Manage(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }

    protected void clickManageCrud() {
        manageCrud.click();
    }

}
