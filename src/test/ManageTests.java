import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;
import planify.tools.Listener;

@Listeners(Listener.class)
public class ManageTests extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
//        popup = new WarningUpdatePopup(driverWinium);
//        planifi = popup.cancelWarningPopup();
        planifi = new Planifi(driverWinium);
    }

    @Story("Check if ‘Billing Rates’ On/Off switches toggle exists in 'Filters' tab")
    @Test
    public void testMPP551() {
        planifi.gotoManagePart()
                .gotoProjectStaffingBreadCrumb()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnSixthToggleWithNumberOfWeeks()
                .expandSideBar()
                .gotoManagePart()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOnSixthToggleWithNumberOfWeeks();


    }

    @Story(" Check if ‘Show Unposted Time’ On/Off switches toggles in 'Settings' tab works appropriately.")
    @Test
    public void testMPP2686() {
        try {
            planifi.gotoManagePart()
                    .gotoProjectStaffingBreadCrumb()
                    .gotoSidebar()
                    .clickSettingsDropDown()
                    .clickOnFivthToggleWithNumberOfWeeks()
                    .gotoManagePart()
                    .gotoSidebar()
                    .expandSideBar()
                    .clickSettingsDropDown()
                    .clickOnFivthToggleWithNumberOfWeeks() ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
