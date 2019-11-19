package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tests  extends TestRunner{
    protected WebDriver driver;
    private TestController page;


//    @BeforeMethod
//    public void setUp() throws Exception {
//        DesktopOptions option = new DesktopOptions();
//        //option.setApplicationPath("C:\\Planifi/VisualPlanning.appref-ms");
//        option.setApplicationPath("C:\\Users\\User\\AppData\\Roaming\\Microsoft\\Windows" +
//                "\\Start Menu\\Programs\\VisualPlanning.appref-ms");
//        // option.setCapability("launchDelay","5");
//        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
//        Thread.sleep(6000);
//        page = new TestController(driver);
//    }


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
    public void myProjectsToggleOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.switchOnMyProjects();
        page.exitApp();
    }

    @Test
    public void filtersTabHideShow() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.showHideFiltersTab();
        page.exitApp();
    }

    @Test
    public void activeProjectsOnlyToggleON() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.switchOnActiveProjects();
        page.exitApp();
    }

    @Test
    public void openProjectsSettingsPopUp() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.projectsSettingsPopUp();
        page.exitApp();
    }


    @Test
    public void checkCheckboxOfficeOrg() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.officeOrgCheckboxCheck();
        page.exitApp();
    }

    @Test
    public void selectMethodOptionInPrSettings() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.methodDropDownInPrSettingsPopUp();
        page.exitApp();
    }

    @Test
    public void billingRatesSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.switchOnBillingRates();
        page.exitApp();
    }

    @Test
    public void showUnpostedTimeSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.switchOnShowUnpostedTime();
        page.exitApp();
    }

    @Test
    public void projectsWithMilestonesTimeSwitchOn() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.switchOnProjectsWithMilestones();
        page.exitApp();
    }

    @Test
    public void checkCheckboxProjectManager() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.projectManagerCheckboxCheck();
        page.exitApp();
    }


    @Test
    public void checkCheckboxProjectType() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.projectTypeCheckboxCheck();
        page.exitApp();
    }

    @Test
    public void checkCheckboxPic() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.picCheckboxCheck();
        page.exitApp();
    }


    @Test
    public void clearButton() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clearOnFiltersTab();
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
        page.saveInPrSet();
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
        page.selectFromTeamDropDownInEmpRole();
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















