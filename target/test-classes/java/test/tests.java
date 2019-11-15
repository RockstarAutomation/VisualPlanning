package test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.TimeUnit.SECONDS;

public class tests {
    public WebDriver driver;
    private testController page;


    @BeforeMethod
    public void setup() throws Exception {
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Planifi/VisualPlanning.appref-ms");
        // option.setCapability("launchDelay","5");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        Thread.sleep(6000);
        page = new testController(driver);
    }


    @Test
    public void search() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoSearch();
        page.exitApp();
    }

//    @Test
//    public void ProjectDetailsShow() throws Exception {
//        page.skipUpgrade();
//        page.resolutionMaximize();
//        page.showProjectDetails();
//        page.exitApp();
//    }


    @Test
    public void myProjectsToggleON() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SwitchOnMyProjects();
        page.exitApp();
    }

    @Test
    public void FiltersTabHideShow() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.ShowHideFiltersTab();
        page.exitApp();
    }
    @Test
    public void activeProjectsOnlyToggleON() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SwitchOnActiveProjects();
        page.exitApp();
    }

    @Test
    public void openProjectsSettingsPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.ProjectsSettingsPopUp();
        page.exitApp();
    }


    @Test
    public void CheckCheckboxOfficeOrg() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.OfficeOrgCheckboxCheck();
        page.exitApp();
    }
    @Test
    public void SelectMethodOptionInPrSettings() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.methodDropDownInPrSettingsPopUp();
        page.exitApp();
    }
    @Test
    public void BillingRatesSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SwitchOnBillingRates();
        page.exitApp();
    }

    @Test
    public void ShowUnpostedTimeSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SwitchOnShowUnpostedTime();
        page.exitApp();
    }

    @Test
    public void ProjectsWithMilestonesTimeSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SwitchOnProjectsWithMilestones();
        page.exitApp();
    }
    @Test
    public void CheckCheckboxProjectManager() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.ProjectManagerCheckboxCheck();
        page.exitApp();
    }


    @Test
    public void CheckCheckboxProjectType() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.ProjectTypeCheckboxCheck();
        page.exitApp();
    }

    @Test
    public void CheckCheckboxPic() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.PicCheckboxCheck();
        page.exitApp();
    }


    @Test
    public void ClearButton() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.ClearOnFiltersTab();
        page.exitApp();
    }

    @Test
    public void searchEmployee() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoEmployeeSearch();
        page.exitApp();
    }

    @Test
    public void searchRole() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoRoleSearch();
        page.exitApp();
    }

    @Test
    public void editDefaultHoursInProjectsSettingsPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.defaultHoursEditInPrSet();
        page.exitApp();
    }

    @Test
    public void saveChangesInProjectsSettingsPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SaveInPrSet();
        page.exitApp();
    }



    @Test
    public void discardChangesInProjectsSettingsPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.cancelInPrSet();
        page.exitApp();
    }

    @Test
    public void discardChangesInPrSetPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.closeInPrSet();
        page.exitApp();
    }

    @Test
    public void clickCancelButtonPrSetPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.cancelWithoutChangesInPrSet();
        page.exitApp();
    }

    @Test
    public void closePrSetPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.closeWithoutChangesInPrSet();
        page.exitApp();
    }

    @Test
    public void selectOptionFromTeamDropDown() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.SelectFromTeamDropDownInEmpRole();
        page.exitApp();
    }



////////////////////////////////////////////////////////






    @Test
    public void checkIfToogleExistsTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.checkIfToogleExists();
        page.exitApp();
    }



    @Test
    public void hiddenLabelTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.hiddenLabelCheck();
        page.exitApp();
    }

    @Test
    public void managerDropDownExistence() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.checkIfDropDownExists();
        page.exitApp();
    }

    @Test
    public void generalListOfEmployeeBoxTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.generalListOfEmployeeBox();
        page.exitApp();
    }


    @Test
    public void closePopupButtonTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.closePopupButton();
        page.exitApp();
    }

    @Test
    public void closeByExitPopupButtonTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.closeExitPopupButton();
        page.exitApp();
    }

    @Test
    public void closeAddNewTeamPopupTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.closeAddNewTeamPopup();
        page.exitApp();
    }

    @Test
    public void closeByCancelAddNewTeamPopupTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.closeByCancelAddNewTeamPopup();
        page.exitApp();
    }


    @Test
    public void closePopupButtonWorkingTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.doesCloseExist();
        page.exitApp();
    }

    @Test
    public void exitPopupButtonWorkingTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.doesExitExist();
        page.exitApp();
    }

    @Test
    public void saveButtonExistTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.saveButtonExist();
        page.exitApp();
    }


    @Test
    public void teamNameExistTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.teamNameExist();
        page.exitApp();
    }


    @Test
    public void addFavoriteTeamTitleTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.favoriteTeamTitle();
        page.exitApp();
    }

    @Test
    public void createNewTeamWindow() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        page.favoriteTeamTitle();
        page.exitApp();
    }















}















