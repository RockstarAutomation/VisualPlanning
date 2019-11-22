package planify.common.popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.CRUD;

public class UpdatePopup extends CRUD {
    @FindBy(name = "Skip")
    private WebElement skipUpdatePopupButton;
    @FindBy(name = "OK")
    private WebElement confirmUpdatePopupButton;
    @FindBy(name = "A new version of VisualPlanning is available. Do you want to download it now?")
    private WebElement updatePopupTitle;

    protected UpdatePopup(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }


    //functional
    protected void clickSkipUpgradeButton() {
        skipUpdatePopupButton.click();
    }

    protected void clickConfirmUpgradeButton() {
        confirmUpdatePopupButton.click();
    }

    //Business logic
    public CRUD skipUpgradePopup() throws Exception {

        try {
            WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
            waitHere11.until(ExpectedConditions.elementToBeClickable(skipUpdatePopupButton));
            clickSkipUpgradeButton();
            clickConfirmUpgradeButton();
        } catch (Exception e) {

        }
        return this;
    }


}
