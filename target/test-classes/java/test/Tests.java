package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests  //extends TestRunner{
{
    protected WebDriver driver;
    private TestController page;

    @DataProvider
    public Object[][] dataProvider(){
        return new Object[][]{
                {"dsadas", "dasadas"}
        };
    }

    @Test
    public void test(){
        List<String> array = new ArrayList<>();
        array.add("asds1");
        array.add("as5ds1");
        array.add("as4ds1");
        array.add("as3ds1");
        array.add("asd2s1");
        for(String variable : array){
            System.out.println(variable);
        }
    }
    @Test(dataProvider = "dataProvider")
    public void search(String data) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoSearch(data);
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

    @Test(dataProvider = "dataProvider")
    public void searchEmployee(String value, String employee) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoEmployeeSearch(value, employee);
        page.exitApp();
    }

    @Test(dataProvider = "dataProvider")
    public void searchRole(String value, String role) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.inputDataIntoRoleSearch(value, role);
        page.exitApp();
    }

    @Test(dataProvider = "dataProvider")
    public void editDefaultHoursInProjectsSettingsPopUp(String value) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.defaultHoursEditInPrSet(value);
        page.exitApp();
    }

    @Test(dataProvider = "dataProvider")
    public void saveChangesInProjectsSettingsPopUp(String value) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.saveInPrSet(value);
        page.exitApp();
    }


    @Test(dataProvider = "dataProvider")
    public void discardChangesInProjectsSettingsPopUp(String value) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.cancelInPrSet(value);
        page.exitApp();
    }

    @Test(dataProvider = "dataProvider")
    public void discardChangesInPrSetPopUp(String value) throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.closeInPrSet(value);
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

    //@Test
    public void generalListOfEmployeeBoxTest() throws Exception {
        page.skipUpgrade();
        page.resolutionMaximize();
        page.clickTeamManager();
        //page.generalListOfEmployeeBox();
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















