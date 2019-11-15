package test;

//import com.sun.org.apache.xpath.internal.operations.Bool;
//import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.maven.model.Organization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;

public class testController extends tests {

    testController(WebDriver driver) {
        this.driver = driver;
    }




    private By skipUpgradeButton = By.name("Skip");
    private By confirmUpgradeButton = By.name("OK");
    private By clickEstimateButton = By.name("ESTIMATE");
    private By clickPlanButton = By.name("PLAN");
    private By clickProject = By.name("30 St Mary Axe");
    private By maximize = By.name("1");

    private By wqae = By.name("Settings");
    private By clickSearchBox = By.className("TextBox");
    private By clickRoleTab = By.name("ROLE");
    private By clickEmployeeTab = By.name("EMPLOYEE");

    private By clickSettings = By.name("Settings");
    private By clickOfficeOrganization = By.name("Office/Organization");
    private By clickConsolidation = By.name("Consolidation");
    private By clickClear = By.name("CLEAR");
    private By clickProjectManager = By.name("Project Manager");
    private By clickProjectType = By.name("Project Type");
    private By clickPic = By.name("PIC");
    private By clickDefaultHours = By.name("DEFAULT HOURS");
    private By hiddenThis = By.name("HIDDEN");
    private By teamManagerButton = By.name("TEAM MANAGER");
    private By togglePresent = By.className("TextBlock");
    private By exitButton = By.name("r");
    private By cancelButtonManager = By.name("CANCEL");
    private By comboBoxManager = By.name("ComboBox");
    private By saveButton = By.name("SAVE");
    private By teamName = By.name("TEAM NAME");
    private By favoriteTeam = By.name("ADD FAVORITE TEAM");

    public testController skipUpgrade() throws Exception {

        try {
            WebDriverWait waitHere11 = new WebDriverWait(driver, 5);
            waitHere11.until(ExpectedConditions.elementToBeClickable(skipUpgradeButton));
            driver.findElement(skipUpgradeButton).click();
            driver.findElement(confirmUpgradeButton).click();
        } catch (Exception e) {

        }
        return this;
    }
    public testController exitApp() throws Exception {
        Thread.sleep(2000);
        driver.findElement(exitButton).click();
        return this;
    }


    public testController resolutionMaximize() throws Exception {
        driver.findElement(maximize).click();
        return this;
    }

    public testController inputDataIntoSearch() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.065.00");
        return this;
    }

    public testController showProjectDetails() throws Exception {
        driver.findElement(clickSearchBox).click();
        driver.findElement(clickSearchBox).sendKeys("0000.011.00");
        driver.findElement(clickProject).click();
        return this;
    }


    public testController SwitchOnMyProjects() throws Exception {
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

    public testController ShowHideFiltersTab() throws Exception {
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


    public testController SwitchOnActiveProjects() throws Exception {
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

    public testController ProjectsSettingsPopUp() throws Exception {
        driver.findElement(clickEstimateButton).click();
        driver.findElement(clickPlanButton).click();
        clickDown();
        clickSpace();
        clickRight();
        clickRight();
        clickSpace();
        return this;
    }

    public testController OfficeOrgCheckboxCheck() throws Exception {
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

    public testController methodDropDownInPrSettingsPopUp() throws Exception {
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

    public testController SwitchOnBillingRates() throws Exception {
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

    public testController SwitchOnShowUnpostedTime() throws Exception {
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


    public testController SwitchOnProjectsWithMilestones() throws Exception {
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


    public testController ProjectManagerCheckboxCheck() throws Exception {
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

    public testController ProjectTypeCheckboxCheck() throws Exception {
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

    public testController PicCheckboxCheck() throws Exception {
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


    public testController ClearOnFiltersTab() throws Exception {
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


    public testController inputDataIntoEmployeeSearch() throws Exception {
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


    public testController inputDataIntoRoleSearch() throws Exception {
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


    public testController defaultHoursEditInPrSet() throws Exception {
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

    public testController SaveInPrSet() throws Exception {


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

    public testController hiddenLabelCheck() throws Exception {
        Boolean hirt = driver.findElement(hiddenThis).isDisplayed();
        Thread.sleep(1000);
        if (hirt) {
            System.out.println(hirt);
        } else {
            throw new Exception("Hidden label is not displayed MPP-2688");
        }
        return this;
    }
    public testController saveButtonExist() throws Exception {
        try {
            driver.findElement(saveButton).click();
        }catch (Exception e) {
            throw new Exception("Save button is not displayed MPP-590");
        }
        return this;
    }

    public testController  teamNameExist() throws Exception {
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
        Boolean isPresent =  driver.findElement(teamName).isDisplayed();
        if (isPresent) {

        } else {
            throw new Exception("Save button is not displayed MPP-589");
        }
return this;
    }



    public testController favoriteTeamTitle() throws Exception {

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
        Boolean isPresent =  driver.findElement(favoriteTeam).isDisplayed();
        if (isPresent) {

        } else {
            throw new Exception("Save button is not displayed MPP-588");
        }
        return this;
    }








    public testController generalListOfEmployeeBox() throws Exception {
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



    public testController closePopupButton() throws Exception {
        try {
            driver.findElement(cancelButtonManager).click();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-599");
        }
        return this;
    }

    public testController closeExitPopupButton() throws Exception {
        try {
            driver.findElement(exitButton).click();
        } catch (Exception e) {
            throw new Exception("Cancel button is not clickable MPP-598");
        }

        return this;
    }
    public testController doesCloseExist() throws Exception {
            Boolean isThere =  driver.findElement(cancelButtonManager).isDisplayed();
            if (isThere) {

            } else {
                throw new Exception("Cancel button is not clickable MPP-591");
            }
        return this;
    }

    public testController doesExitExist() throws Exception {

           Boolean isThere =  driver.findElement(exitButton).isDisplayed();
          if (isThere) {

          } else {
              throw new Exception("Cancel button is not clickable MPP-591");
          }

        return this;
    }



    public testController checkIfToogleExists() throws Exception {
        Boolean hirt = driver.findElement(togglePresent).isDisplayed();
        if (hirt) {
            System.out.println(hirt);
        } else {
            throw new Exception("Toggle is not displayed MPP-2689");
        }
        return this;
    }


    public testController checkIfDropDownExists() throws Exception {
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



    public testController closeAddNewTeamPopup() throws Exception {
        clickTab();
        clickTab();
        clickTab();
        clickTab();
        WebElement focusedele = driver.switchTo().activeElement();
        focusedele.click();
        driver.findElement(exitButton).click();
        return this;
    }




    public testController closeByCancelAddNewTeamPopup() throws Exception {

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









    public testController cancelInPrSet() throws Exception {
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


    public testController closeInPrSet() throws Exception {
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


    public testController cancelWithoutChangesInPrSet() throws Exception {
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



    public testController closeWithoutChangesInPrSet() throws Exception {
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

    public testController SelectFromTeamDropDownInEmpRole() throws Exception {
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


    public testController clickTeamManager() throws Exception {
        WebDriverWait waitHere12 = new WebDriverWait(driver, 5);
        waitHere12.until(ExpectedConditions.elementToBeClickable(teamManagerButton));
        driver.findElement(teamManagerButton).click();
        Thread.sleep(3000);
        return this;
    }




    public testController clickShiftTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        return this;
    }



    public testController clickTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        return this;
    }

    public testController clickDown() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        return this;
    }

    public testController clickRight() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(1000);
        return this;
    }

    public testController clickSpace() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(1000);
        return this;
    }
    public testController clickLeft() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_LEFT);
        robo.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(1000);
        return this;
    }
    public testController clickUp() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_UP);
        robo.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(1000);
        return this;
    }











}