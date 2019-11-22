package test;

//import com.sun.org.apache.xpath.internal.operations.Bool;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import planify.common.CRUD;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class TestController extends CRUD {

    TestController(WebDriver driver) {
        initElements(driver);
    }


    @FindBy(name = "30 St Mary Axe")
    private WebElement clickProject;
    @FindBy(name = "1")
    private WebElement maximize;
    @FindBy(name = "settings")
    private WebElement wqae;
    @FindBy(name = "TextBox")
    private WebElement clickSearchBox;
    @FindBy(name = "ROLE")
    private WebElement clickRoleTab;
    @FindBy(name = "EMPLOYEE")
    private WebElement clickEmployeeTab;
    @FindBy(name = "ISettingsCriteriaSidebar")
    private WebElement clickSettings;
    @FindBy(name = "Office/Organization")
    private WebElement clickOfficeOrganization;
    @FindBy(name = "Consolidation")
    private WebElement clickConsolidation;
    @FindBy(name = "CLEAR")
    private WebElement clickClear;
    @FindBy(name = "Project Manager")
    private WebElement clickProjectManager;
    @FindBy(name = "Project Type")
    private WebElement clickProjectType;
    @FindBy(name = "PIC")
    private WebElement clickPic;
    @FindBy(name = "DEFAULT HOURS")
    private WebElement clickDefaultHours;
    @FindBy(name = "HIDDEN")
    private WebElement hiddenThis;
    @FindBy(name = "TEAM MANAGER")
    private WebElement teamManagerButton;
    @FindBy(name = "TextBlock")
    private WebElement togglePresent;
    @FindBy(name = "r")
    private WebElement exitButton;
    @FindBy(name = "CANCEL")
    private WebElement cancelButtonManager;
    @FindBy(name = "ComboBox")
    private WebElement comboBoxManager;
    @FindBy(name = "SAVE")
    private WebElement saveButton;
    @FindBy(name = "TEAM NAME")
    private WebElement teamName;
    @FindBy(name = "ADD FAVORITE TEAM")
    private WebElement favoriteTeam;

    public void initElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private WebElement getActiveElement() {
        return driver.switchTo().activeElement();
    }

    //Functional


    public void clickSomewhere() {
        getActiveElement().click();
    }



    protected void clickFavoriteTeam() {
        favoriteTeam.click();
    }

    protected void clickTeamName() {
        teamName.click();
    }

    protected void clickComboBoxManager() {
        comboBoxManager.click();
    }

    protected void clickCancelButtonManager() {
        cancelButtonManager.click();
    }

    protected void clickExitButton() {
        exitButton.click();
    }

    protected void clickTogglePresent() {
        togglePresent.click();
    }

    protected void clickTeamManagerButton() {
        teamManagerButton.click();
    }

    protected void clickHiddenThis() {
        hiddenThis.click();
    }

    protected void clickClickDefaultHours() {
        clickDefaultHours.click();
    }

    protected void clickClickPic() {
        clickPic.click();
    }

    protected void clickClickProjectType() {
        clickProjectType.click();
    }

    protected void clickClickProjectManager() {
        clickProjectManager.click();
    }

    protected void clickClickClear() {
        clickClear.click();
    }

    protected void clickClickConsolidation() {
        clickConsolidation.click();
    }

    protected void clickClickOfficeOrganization() {
        clickOfficeOrganization.click();
    }

    protected void clickClickSettings() {
        clickSettings.click();
    }

    protected void clickClickEmployeeTab() {
        clickEmployeeTab.click();
    }

    protected void clickClickRoleTab() {
        clickRoleTab.click();
    }

    protected void clickClickSearchBox() {
        clickSearchBox.click();
    }

    protected void clickWqae() {
        wqae.click();
    }

    protected void clickMaximize() {
        maximize.click();
    }

    protected void clickClickProject() {
        clickProject.click();
    }

    protected void clickEstimateButton() {
        clickEstimateButton.click();
    }

    protected void clickSaveButton() {
        saveButton.click();
    }

    protected void clickRoleTab() {
        clickRoleTab.click();
    }




    protected void clearFavoriteTeam() {
        favoriteTeam.click();
    }



    //    protected void clickTeamName() {
//        teamName.click();
//    }
//
//    protected void clickComboBoxManager() {
//        comboBoxManager.click();
//    }
//
//    protected void clickCancelButtonManager() {
//        cancelButtonManager.click();
//    }
//
//    protected void clickExitButton() {
//        exitButton.click();
//    }
//
//    protected void clickTogglePresent() {
//        togglePresent.click();
//    }
//
//    protected void clickTeamManagerButton() {
//        teamManagerButton.click();
//    }
//
//    protected void clickHiddenThis() {
//        hiddenThis.click();
//    }
//
    protected void clearClickDefaultHours() {
        clickDefaultHours.clear();
    }

    //
//    protected void clickClickPic() {
//        clickPic.click();
//    }
//
//    protected void clickClickProjectType() {
//        clickProjectType.click();
//    }
//
//    protected void clickClickProjectManager() {
//        clickProjectManager.click();
//    }
//
//    protected void clickClickClear() {
//        clickClear.click();
//    }
//
//    protected void clickClickConsolidation() {
//        clickConsolidation.click();
//    }
//
//    protected void clickClickOfficeOrganization() {
//        clickOfficeOrganization.click();
//    }
//
//    protected void clickClickSettings() {
//        clickSettings.click();
//    }
//
    protected void clearClickEmployeeTab() {
        clickEmployeeTab.clear();
    }

    //
    protected void clearRoleTab() {
        clickRoleTab.clear();
    }

    //
    protected void clearClickSearchBox() {
        clickSearchBox.clear();
    }
//
//    protected void clickWqae() {
//        wqae.click();
//    }
//
//    protected void clickMaximize() {
//        maximize.click();
//    }
//
//    protected void clickClickProject() {
//        clickProject.click();
//    }
//
//    protected void clickEstimateButton() {
//        clickEstimateButton.click();
//    }
//
//    protected void clickSaveButton() {
//        saveButton.click();
//    }
//
//    protected void clickRoleTab() {
//        clickRoleTab.click();
//    }
//
//    protected void clickPlanButton() {
//        clickPlanButton.click();
//    }

    //set
    protected void setClickSearchBox(String value) {
        clickSearchBox.sendKeys(value);
    }

    protected void setClickEmployeeTab(String value) {
        clickEmployeeTab.sendKeys(value);
    }

    protected void setRoleTab(String value) {
        clickRoleTab.sendKeys(value);
    }

    protected void setClickDefaultHours(String value) {
        clickDefaultHours.sendKeys(value);
    }

    //Check if displayed

    public boolean checkIfHiddenThis() {
        return hiddenThis.isDisplayed();
    }

    public boolean checkIfTeamNameIsDisplayed() {
        return teamName.isDisplayed();
    }

    public boolean checkIfCancelButtonManagerIsDisplayed() {
        return cancelButtonManager.isDisplayed();
    }

    public boolean checkIfExitButtonIsDisplayed() {
        return exitButton.isDisplayed();
    }

    public boolean checkIfTogglePresentIsDisplayed() {
        return togglePresent.isDisplayed();
    }

    public boolean checkIfRandomElementDisplayed() {
        return togglePresent.isDisplayed();
    }
    //Business Logic

    public void fillingDefaultHours(String value) {
        clickClickDefaultHours();
        clearClickDefaultHours();
        setClickDefaultHours(value);
    }

    public void fillingRoleTab(String value) {
        clickRoleTab();
        clearRoleTab();
        setRoleTab(value);
    }

    public void fillingSearchBox(String value) {
        clickClickSearchBox();
        clearClickSearchBox();
        setClickSearchBox(value);
    }

    public void fillingEmployeeTab(String value) {
        clickClickEmployeeTab();
        clearClickEmployeeTab();
        setClickEmployeeTab(value);
    }


    public TestController exitApp() throws Exception {
        Thread.sleep(2000);
        clickExitButton();
        return this;
    }


    public TestController resolutionMaximize() throws Exception {
        clickMaximize();
        return this;
    }

    public TestController inputDataIntoSearch(String value) throws Exception {
        fillingSearchBox(value);
        return this;
    }

    public TestController showProjectDetails(String value) throws Exception {
        fillingSearchBox(value);
        clickClickProject();
        return this;
    }


    public TestController switchOnMyProjects() throws Exception {
        clickClickSettings();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        clickClickClear();
        Robot robo = new Robot();
        robo.keyPress(java.awt.event.KeyEvent.VK_LEFT);
        robo.keyRelease(java.awt.event.KeyEvent.VK_LEFT);
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(java.awt.event.KeyEvent.VK_SPACE);
        return this;
    }

    public TestController showHideFiltersTab() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickSpace();
        clickRight();
        clickSpace();
        clickSpace();
        clickLeft();
        clickSpace();
        clickLeft();
        clickLeft();
        clickSpace();
        return this;
    }


    public TestController switchOnActiveProjects() throws Exception {
        clickClickSettings();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        clickClickClear();
        clickLeft();
        clickDown();
        clickSpace();
        return this;
    }

    public TestController projectsSettingsPopUp() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        return this;
    }

    public TestController officeOrgCheckboxCheck() throws Exception {
        clickClickOfficeOrganization();
        clickClickConsolidation();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickRight();
        clickRight();
        clickRight();
        clickRight();
        clickRight();
        clickSpace();
        clickLeft();
        clickLeft();
        clickLeft();
        clickLeft();
        clickLeft();
        clickLeft();
        return this;
    }

    public TestController methodDropDownInPrSettingsPopUp() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickDown();
        clickUp();
        return this;
    }

    public TestController switchOnBillingRates() throws Exception {
        clickClickSettings();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        clickClickClear();
        clickLeft();
        clickDown();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }

    public TestController switchOnShowUnpostedTime() throws Exception {
        clickClickSettings();
//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        clickClickClear();
        clickLeft();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }


    public TestController switchOnProjectsWithMilestones() throws Exception {
        clickClickSettings();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        clickClickClear();
        clickLeft();
        clickDown();
        clickDown();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }


    public TestController projectManagerCheckboxCheck() throws Exception {
        clickClickProjectManager();
        clickDown();
        clickTab();
        clickSpace();
        clickSpace();
        clickDown();
        clickTab();
        clickSpace();
        return this;
    }

    public TestController projectTypeCheckboxCheck() throws Exception {
        clickClickProjectManager();
        clickDown();
        clickTab();
        clickSpace();
        clickSpace();
        clickDown();
        clickTab();
        clickSpace();
        return this;
    }

    public TestController picCheckboxCheck() throws Exception {
        clickClickPic();
        clickDown();
        clickTab();
        clickSpace();
        clickSpace();
        clickDown();
        clickTab();
        clickSpace();
        return this;
    }


    public TestController clearOnFiltersTab() throws Exception {
        clickClickOfficeOrganization();
        clickClickConsolidation();
        clickDown();
        clickSpace();
        clickClickProjectType();
        clickDown();
        clickTab();
        clickSpace();
        clickClickProjectManager();
        clickDown();
        clickTab();
        clickSpace();
        clickClickProjectManager();
        clickClickPic();
        clickDown();
        clickTab();
        clickSpace();
        clickClickSettings();
        clickClickClear();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickClickProjectManager();
        clickClickProjectType();
        return this;
    }


    public TestController inputDataIntoEmployeeSearch(String value, String employee) throws Exception {
        fillingSearchBox(value);
        clickClickProject();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickTab();
        clickRight();
        clickRight();
        clickRight();
        clickTab();
        clickTab();
        clickTab();
        fillingEmployeeTab(employee);

        return this;
    }


    public TestController inputDataIntoRoleSearch(String value, String role) throws Exception {
        fillingSearchBox(value);
        clickClickProject();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickTab();
        clickRight();
        clickRight();
        clickRight();
        clickLeft();
        clickTab();
        fillingRoleTab(role);
        return this;
    }


    public TestController defaultHoursEditInPrSet(String value) throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        fillingDefaultHours(value);
        return this;
    }

    public TestController saveInPrSet(String value) throws Exception {


        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        fillingDefaultHours(value);
        clickTab();
        clickUp();
        clickDown();
        clickTab();
        clickRight();
        clickSpace();
        clickSpace();

        return this;
    }

    public TestController hiddenLabelCheck() throws Exception {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        if (checkIfHiddenThis()) {
            System.out.println(checkIfHiddenThis());
        } else {
            throw new Exception("Hidden label is not displayed MPP-2688");
        }
        return this;
    }

    public TestController saveButtonExist() throws Exception {
        try {
            clickSaveButton();
        } catch (Exception e) {
            throw new Exception("Save button is not displayed MPP-590");
        }
        return this;
    }

    public TestController teamNameExist() throws Exception {
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickSomewhere();
        if (checkIfTeamNameIsDisplayed()) {

        } else {
            throw new Exception("Save button is not displayed MPP-589");
        }
        return this;
    }


    public TestController favoriteTeamTitle() throws Exception {
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        WebElement focusedele = driver.switchTo().activeElement();
        focusedele.click();
        if (checkIfTeamNameIsDisplayed()) {
        } else {
            throw new Exception("Save button is not displayed MPP-588");
        }
        return this;
    }

//TODO
//    public TestController generalListOfEmployeeBox() throws Exception {
//        clickClickSearchBox();
//        clickTab();
//        WebElement focusedele = driver.switchTo().activeElement();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        focusedele.click();
//        Boolean focusDisplay = focusedele.isDisplayed();
//        if (focusDisplay) {
//            System.out.println(focusedele);
//        } else {
//            throw new Exception("List of employee is not displayed MPP-617");
//        }
//        return this;
//    }


    public TestController closePopupButton() throws Exception {
        try {
            clickCancelButtonManager();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-599");
        }
        return this;
    }

    public TestController closeExitPopupButton() throws Exception {
        try {
            clickExitButton();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-598");
        }

        return this;
    }

    public TestController doesCloseExist() throws Exception {
        if (checkIfCancelButtonManagerIsDisplayed()) {

        } else {
            throw new Exception("Cancel button is not clickable MPP-591");
        }
        return this;
    }

    public TestController doesExitExist() throws Exception {

        if (checkIfExitButtonIsDisplayed()) {

        } else {
            throw new Exception("Cancel button is not clickable MPP-591");
        }

        return this;
    }


    public TestController checkIfToogleExists() throws Exception {
        if (checkIfTogglePresentIsDisplayed()) {
            System.out.println(checkIfTogglePresentIsDisplayed());
        } else {
            throw new Exception("Toggle is not displayed MPP-2689");
        }
        return this;
    }


    public TestController checkIfDropDownExists() throws Exception {
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickTab();

        if (checkIfRandomElementDisplayed()) {
            System.out.println(checkIfRandomElementDisplayed());
        } else {
            throw new Exception("DropDown is not   present - MPP-624");
        }
        return this;
    }


    public TestController closeAddNewTeamPopup() throws Exception {
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        WebElement focusedele = driver.switchTo().activeElement();
        focusedele.click();
        clickExitButton();
        return this;
    }


    public TestController closeByCancelAddNewTeamPopup() throws Exception {

        clickTab();
        clickTab();
        clickTab();
        clickTab();
        clickSomewhere();
        WebDriverWait waitHere12 = new WebDriverWait(driver, 5);
        waitHere12.until(ExpectedConditions.elementToBeClickable(cancelButtonManager));
        clickCancelButtonManager();
        return this;
    }


    public TestController cancelInPrSet(String value) throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        fillingDefaultHours(value);
        clickTab();
        clickUp();
        clickDown();
        clickTab();
        clickLeft();
        clickSpace();
        clickSpace();
        clickShiftTab();
        clickShiftTab();
        clickSpace();
        clickSpace();
        return this;
    }


    public TestController closeInPrSet(String value) throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        fillingDefaultHours(value);
        clickTab();
        clickUp();
        clickDown();
        clickShiftTab();
        clickShiftTab();
        clickSpace();
        clickShiftTab();
        clickShiftTab();
        clickSpace();
        clickSpace();
        return this;
    }


    public TestController cancelWithoutChangesInPrSet() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickTab();
        clickTab();
        clickTab();
        clickSpace();
        return this;
    }


    public TestController closeWithoutChangesInPrSet() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickSpace();
        return this;
    }

    public TestController selectFromTeamDropDownInEmpRole() throws Exception {
        clickEstimateButton();
        clickPlanButton();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickTab();
        clickTab();
        clickSpace();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickTab();
        clickTab();
        clickTab();
        clickDown();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickDown();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        clickDown();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        return this;
    }


    public TestController clickTeamManager() throws Exception {
        WebDriverWait waitHere12 = new WebDriverWait(driver, 5);
        waitHere12.until(ExpectedConditions.elementToBeClickable(teamManagerButton));
        clickTeamManager();
//        Thread.sleep(3000);
        return this;
    }


    public TestController clickShiftTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
        return this;
    }


    public TestController clickTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
        return this;
    }

    public TestController clickDown() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
//        Thread.sleep(1000);
        return this;
    }

    public TestController clickRight() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.keyRelease(KeyEvent.VK_RIGHT);
//        Thread.sleep(1000);
        return this;
    }

    public TestController clickSpace() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(KeyEvent.VK_SPACE);
//        Thread.sleep(1000);
        return this;
    }

    public TestController clickLeft() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_LEFT);
        robo.keyRelease(KeyEvent.VK_LEFT);
//        Thread.sleep(1000);
        return this;
    }

    public TestController clickUp() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_UP);
        robo.keyRelease(KeyEvent.VK_UP);
//        Thread.sleep(1000);
        return this;
    }


}