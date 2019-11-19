package test;

//import com.sun.org.apache.xpath.internal.operations.Bool;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TestController {
    private WebDriver driver;

    TestController(WebDriver driverNew) {
        this.driver = driverNew;
    }

    @FindBy(name = "Skip")
    private Button skipUpgradeButton;
    @FindBy(name = "OK")
    private Button confirmUpgradeButton;
    @FindBy(name = "ESTIMATE")
    private Button clickEstimateButton;
    @FindBy(name = "PLAN")
    private Button clickPlanButton;
    @FindBy(name = "30 St Mary Axe")
    private By clickProject = By.name("30 St Mary Axe");
    @FindBy(name = "1")
    private By maximize = By.name("1");
    @FindBy(name = "Settings")
    private By wqae = By.name("Settings");
    @FindBy(name = "TextBox")
    private By clickSearchBox = By.className("TextBox");
    @FindBy(name = "ROLE")
    private By clickRoleTab = By.name("ROLE");
    @FindBy(name = "EMPLOYEE")
    private By clickEmployeeTab = By.name("EMPLOYEE");
    @FindBy(name = "Settings")
    private By clickSettings = By.name("Settings");
    @FindBy(name = "Office/Organization")
    private By clickOfficeOrganization = By.name("Office/Organization");
    @FindBy(name = "Consolidation")
    private By clickConsolidation = By.name("Consolidation");
    @FindBy(name = "CLEAR")
    private By clickClear = By.name("CLEAR");
    @FindBy(name = "Project Manager")
    private By clickProjectManager = By.name("Project Manager");
    @FindBy(name = "Project Type")
    private By clickProjectType = By.name("Project Type");
    @FindBy(name = "PIC")
    private By clickPic = By.name("PIC");
    @FindBy(name = "DEFAULT HOURS")
    private By clickDefaultHours = By.name("DEFAULT HOURS");
    @FindBy(name = "HIDDEN")
    private By hiddenThis = By.name("HIDDEN");
    @FindBy(name = "TEAM MANAGER")
    private By teamManagerButton = By.name("TEAM MANAGER");
    @FindBy(name = "TextBlock")
    private By togglePresent = By.className("TextBlock");
    @FindBy(name = "r")
    private Button exitButton;
    @FindBy(name = "CANCEL")
    private Button cancelButtonManager;
    @FindBy(name = "ComboBox")
    private By comboBoxManager = By.name("ComboBox");
    @FindBy(name = "SAVE")
    private Button saveButton;
    @FindBy(name = "TEAM NAME")
    private By teamName = By.name("TEAM NAME");
    @FindBy(name = "ADD FAVORITE TEAM")
    private By favoriteTeam;


    //Functional
    protected void clickSkipUpgradeButton() {
    }

    protected void clickFavoriteTeam() {
        //favoriteTeam.click();
    }

    protected void clickTeamName() {
    }

    protected void clickComboBoxManager() {
    }

    protected void clickCancelButtonManager() {
    }

    protected void clickExitButton() {
    }

    protected void clickTogglePresent() {
    }

    protected void clickTeamManagerButton() {
    }

    protected void clickHiddenThis() {
    }

    protected void clickVlickDefaultHours() {
    }

    protected void clickClickPic() {
    }

    protected void clickClickProjectType() {
    }

    protected void clickClickProjectManager() {
    }

    protected void clickClickClear() {
    }

    protected void clickClickConsolidation() {
    }

    protected void clickClickOfficeOrganization() {
    }

    protected void clickClickSettings() {
    }

    protected void clickClickEmployeeTab() {
    }

    protected void clickClickRoleTab() {
    }

    protected void clickClickSearchBox() {
    }

    protected void clickWqae() {
    }

    protected void clickMaximize() {
    }

    protected void clickClickProject() {
    }

    protected void clickClickEstimateButton() {
    }

    protected void click() {
    }

    protected void click() {
    }

    //Business Logic

    public TestController skipUpgrade() throws Exception {

        try {
            WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
            waitHere11.until(ExpectedConditions.elementToBeClickable(skipUpgradeButton));
            driver.findElement(skipUpgradeButton).click();
            driver.findElement(confirmUpgradeButton).click();
        } catch (Exception e) {

        }
        return this;
    }

    public TestController exitApp() throws Exception {
        Thread.sleep(2000);
        driver.findElement(exitButton).click();
        return this;
    }


    public TestController resolutionMaximize() throws Exception {
        driver.findElement(maximize).click();
        return this;
    }

    public TestController inputDataIntoSearch() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.065.00");
        return this;
    }

    public TestController showProjectDetails() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.011.00");
        driver.findElement(clickProject).click();
        return this;
    }


    public TestController switchOnMyProjects() throws Exception {
        driver.findElement(clickSettings).click();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        driver.findElement(clickClear).click();
        Robot robo = new Robot();
        robo.keyPress(java.awt.event.KeyEvent.VK_LEFT);
        robo.keyRelease(java.awt.event.KeyEvent.VK_LEFT);
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(java.awt.event.KeyEvent.VK_SPACE);
        return this;
    }

    public TestController showHideFiltersTab() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
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
        driver.findElement(clickSettings).click();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        driver.findElement(clickClear).click();
        clickLeft();
        clickDown();
        clickSpace();
        return this;
    }

    public TestController projectsSettingsPopUp() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        return this;
    }

    public TestController officeOrgCheckboxCheck() throws Exception {
        driver.findElement(clickOfficeOrganization).click();
        driver.findElement(clickConsolidation).click();
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
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
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
        driver.findElement(clickSettings).click();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        driver.findElement(clickClear).click();
        clickLeft();
        clickDown();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }

    public TestController switchOnShowUnpostedTime() throws Exception {
        driver.findElement(clickSettings).click();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        driver.findElement(clickClear).click();
        clickLeft();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }


    public TestController switchOnProjectsWithMilestones() throws Exception {
        driver.findElement(clickSettings).click();
        Thread.sleep(3000);
        WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
        waitHere11.until(ExpectedConditions.elementToBeClickable(clickClear));
        driver.findElement(clickClear).click();
        clickLeft();
        clickDown();
        clickDown();
        clickDown();
        clickDown();
        clickSpace();
        return this;
    }


    public TestController projectManagerCheckboxCheck() throws Exception {
        driver.findElement(clickProjectManager).click();
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
        driver.findElement(clickProjectType).click();
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
        driver.findElement(clickPic).click();
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
        driver.findElement(clickOfficeOrganization).click();
        driver.findElement(clickConsolidation).click();
        clickDown();
        clickSpace();
        driver.findElement(clickProjectType).click();
        clickDown();
        clickTab();
        clickSpace();
        driver.findElement(clickProjectManager).click();
        clickDown();
        clickTab();
        clickSpace();
        driver.findElement(clickProjectManager).click();
        driver.findElement(clickPic).click();
        clickDown();
        clickTab();
        clickSpace();
        driver.findElement(clickSettings).click();
        driver.findElement(clickClear).click();
        Thread.sleep(5000);
        driver.findElement(clickProjectManager).click();
        driver.findElement(clickProjectType).click();
        return this;
    }


    public TestController inputDataIntoEmployeeSearch() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.011.00");
        driver.findElement(clickProject).click();
        Thread.sleep(6000);
        clickTab();
        clickRight();
        clickRight();
        clickRight();
        clickTab();
        clickTab();
        clickTab();
        driver.findElement(clickEmployeeTab).sendKeys("Abbot");


        return this;
    }


    public TestController inputDataIntoRoleSearch() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.011.00");
        driver.findElement(clickProject).click();
        Thread.sleep(6000);
        clickTab();
        clickRight();
        clickRight();
        clickRight();
        clickLeft();
        clickTab();
        driver.findElement(clickRoleTab).sendKeys("Job");
        return this;
    }


    public TestController defaultHoursEditInPrSet() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        driver.findElement(clickDefaultHours).sendKeys("100");
        return this;
    }

    public TestController saveInPrSet() throws Exception {


        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        Thread.sleep(1000);
        driver.findElement(clickDefaultHours).sendKeys("100");
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
        Boolean hirt = driver.findElement(hiddenThis).isDisplayed();
        Thread.sleep(1000);
        if (hirt) {
            System.out.println(hirt);
        } else {
            throw new Exception("Hidden label is not displayed MPP-2688");
        }
        return this;
    }

    public TestController saveButtonExist() throws Exception {
        try {
            driver.findElement(saveButton).click();
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
        WebElement focusedele = driver.switchTo().activeElement();
        focusedele.click();
        Boolean isPresent = driver.findElement(teamName).isDisplayed();
        if (isPresent) {

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
        Boolean isPresent = driver.findElement(favoriteTeam).isDisplayed();
        if (isPresent) {

        } else {
            throw new Exception("Save button is not displayed MPP-588");
        }
        return this;
    }


    public TestController generalListOfEmployeeBox() throws Exception {
        driver.findElement(clickSearchBox).click();
        clickTab();
        WebElement focusedele = driver.switchTo().activeElement();
        Thread.sleep(2000);
        focusedele.click();
        Boolean focusDisplay = focusedele.isDisplayed();
        if (focusDisplay) {
            System.out.println(focusedele);
        } else {
            throw new Exception("List of employee is not displayed MPP-617");
        }
        return this;
    }


    public TestController closePopupButton() throws Exception {
        try {
            driver.findElement(cancelButtonManager).click();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-599");
        }
        return this;
    }

    public TestController closeExitPopupButton() throws Exception {
        try {
            driver.findElement(exitButton).click();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-598");
        }

        return this;
    }

    public TestController doesCloseExist() throws Exception {
        Boolean isThere = driver.findElement(cancelButtonManager).isDisplayed();
        if (isThere) {

        } else {
            throw new Exception("Cancel button is not clickable MPP-591");
        }
        return this;
    }

    public TestController doesExitExist() throws Exception {

        Boolean isThere = driver.findElement(exitButton).isDisplayed();
        if (isThere) {

        } else {
            throw new Exception("Cancel button is not clickable MPP-591");
        }

        return this;
    }


    public TestController checkIfToogleExists() throws Exception {
        Boolean hirt = driver.findElement(togglePresent).isDisplayed();
        if (hirt) {
            System.out.println(hirt);
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
        WebElement focusedele = driver.switchTo().activeElement();
        Boolean focusedElemPresent = focusedele.isDisplayed();
        if (focusedElemPresent) {
            System.out.println(focusedElemPresent);
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
        driver.findElement(exitButton).click();
        return this;
    }


    public TestController closeByCancelAddNewTeamPopup() throws Exception {

        clickTab();
        clickTab();
        clickTab();
        clickTab();
        WebElement focusedele = driver.switchTo().activeElement();
        focusedele.click();
        WebDriverWait waitHere12 = new WebDriverWait(driver, 5);
        waitHere12.until(ExpectedConditions.elementToBeClickable(cancelButtonManager));
        driver.findElement(cancelButtonManager).click();
        return this;
    }


    public TestController cancelInPrSet() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        Thread.sleep(1000);
        driver.findElement(clickDefaultHours).sendKeys("100");
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


    public TestController closeInPrSet() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        Thread.sleep(1000);
        driver.findElement(clickDefaultHours).sendKeys("100");
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
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        Thread.sleep(1000);
        clickTab();
        clickTab();
        clickTab();
        clickSpace();
        return this;
    }


    public TestController closeWithoutChangesInPrSet() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
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
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickTab();
        clickTab();
        clickSpace();
        Thread.sleep(6000);
        clickTab();
        clickTab();
        clickTab();
        clickDown();
        Thread.sleep(2000);
        clickDown();
        Thread.sleep(2000);
        clickDown();
        Thread.sleep(2000);
        return this;
    }


    public TestController clickTeamManager() throws Exception {
        WebDriverWait waitHere12 = new WebDriverWait(driver, 5);
        waitHere12.until(ExpectedConditions.elementToBeClickable(teamManagerButton));
        driver.findElement(teamManagerButton).click();
        Thread.sleep(3000);
        return this;
    }


    public TestController clickShiftTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        return this;
    }


    public TestController clickTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        return this;
    }

    public TestController clickDown() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        return this;
    }

    public TestController clickRight() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(1000);
        return this;
    }

    public TestController clickSpace() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(1000);
        return this;
    }

    public TestController clickLeft() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_LEFT);
        robo.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(1000);
        return this;
    }

    public TestController clickUp() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_UP);
        robo.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(1000);
        return this;
    }


}