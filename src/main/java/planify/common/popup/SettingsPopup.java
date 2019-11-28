package planify.common.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.common.sidebar.Sidebar;
import planify.planPart.PlanBreadCrumb;

public class SettingsPopup extends Planifi {

    public SettingsPopup(WiniumDriver webDriver) {
        super(webDriver);
    }

    //Page Object
    private WebElement getWebMainPopup() {
        return driver.findElement(By.className("Window"));
    }

    private WebElement getWebDefaultHoursField() {
        return getWebMainPopup().findElement(By.className("TextBox"));
    }

    private WebElement getWebDefaultMethodSelector() {
        return getWebMainPopup().findElement(By.className("ComboBox"));
    }

    private WebElement getWebDefaultMethodSelectorItemByName(String name) {
        return getWebDefaultMethodSelector().findElement(By.name(name));
    }

    private WebElement getWebClosePopup() {
        return getWebMainPopup().findElement(By.name("r"));
    }

    private WebElement getWebSaveChangesButton(){
        return getWebMainPopup().findElement(By.name("SAVE"));
    }

    private WebElement getWebCancelChangesButton(){
        return getWebMainPopup().findElement(By.name("CANCEL"));
    }

    //functionality

    private void clickOnDefualtHoursFeild() {
        getWebDefaultHoursField().click();
    }


    private void clearOnDefualtHoursFeild() {
        getWebDefaultHoursField().clear();
    }


    private void setDefualtHoursFeild(String hours) {
        getWebDefaultHoursField().sendKeys(hours);
    }

    private void clickOnDefaultMethodSelector(){
        getWebDefaultMethodSelector().click();
    }

    private void setDefaultMethod(String name){
        getWebDefaultMethodSelectorItemByName(name).click();
    }

    //Business logic

    public SettingsPopup changeDefaultMethodSettingPopup(String methodName){
        clickOnDefaultMethodSelector();
        setDefaultMethod(methodName);
        return new SettingsPopup(driver);
    }

    public SettingsPopup changeDefaultHoursSettingPopup(String hours){
        clickOnDefualtHoursFeild();
        clearOnDefualtHoursFeild();
        setDefualtHoursFeild(hours);
        return new SettingsPopup(driver);
    }

    public SettingsPopup closeSettingsPopup() {
        getWebClosePopup().click();
        return new SettingsPopup(driver);
    }

    public PlanBreadCrumb saveChangesSettingsPopup(){
        getWebSaveChangesButton().click();
        return new PlanBreadCrumb(driver);
    }

    public WarningDiscardChangesPopup cancelChangesSettingsPopup(){
        getWebCancelChangesButton().click();
        return new WarningDiscardChangesPopup(driver);
    }


}
