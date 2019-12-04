package planify.common.options.details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

import java.util.PrimitiveIterator;

public class DetailsBar extends Planifi {
    public DetailsBar(WiniumDriver webDriver) {
        super(webDriver);
    }
//    PageObjects

    private WebElement getMainPathForDetailsElements() {
        return driver.findElementByClassName("KanbanPlanning");
    }

    private WebElement getWebDetailsTitle() {
        return getWebDetailsPart().findElement(By.name("DETAILS"));
    }

    private WebElement getWebDetailsPart() {
        return getMainPathForDetailsElements().findElement(By.className("ScrollViewer"));
    }

    private WebElement getWebDetailsExtendButton() {
        return getWebDetailsPart().findElement(By.name("SHOW OTHER DETAILS"));
    }

    private WebElement getWebSummaryExpand() {
        return getWebDetailsPart().findElement(By.id("tglBtn_Summary"));
    }

    private WebElement getWebScheduleListingExpand() {
        return getWebDetailsPart().findElement(By.id("tglBtn_ScheduleListing"));
    }

    private WebElement getWebSettingsToggleButton() {
        return getWebDetailsPart().findElement(By.id("SettingToggleButton"));
    }

    private WebElement getWebViewAllPhasesButton() {
        return getWebDetailsPart().findElement(By.name("View all phases"));
    }

    private WebElement getWebScaleComboBox() {
        return getWebDetailsPart().findElement(By.id("Scale"));
    }

    private WebElement getWebSummaryProjectName(String projectName){
        return getWebDetailsPart().findElement(By.name(projectName));
    }

    //Functionality

    public void clickOnSummaryExtendButton() {
        getWebSummaryExpand().click();
    }

    public void clickOnScaleComboBox() {
        getWebScaleComboBox().click();
    }

    public void clickOnViewAllPhasesButton() {
        getWebViewAllPhasesButton().click();
    }

    public void clickOnSettingsToggleButton() {
        getWebSettingsToggleButton().click();
    }

    public void clickOnScheduleListingExpand() {
        getWebScheduleListingExpand().click();
    }

    public void clickOnDetailsExtendButton() {
        getWebDetailsExtendButton().click();
    }

    public boolean checkIfDetailsTitleIsDisplayed() {
        return getWebDetailsTitle().isDisplayed();
    }

    public boolean checkIfProjectRealedInformationIsDisplayed(String projectName){
        return getWebSummaryProjectName("("+projectName+")").isDisplayed();
    }

    //Business logic

}
