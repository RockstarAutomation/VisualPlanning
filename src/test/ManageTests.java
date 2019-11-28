import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import planify.common.Planifi;
import planify.common.popup.WarningUpdatePopup;

public class ManageTests extends TestRunner {

    private Planifi planifi;
    private WarningUpdatePopup popup;

    @BeforeMethod
    public void setUp() {
        popup = new WarningUpdatePopup(driverWinium);
        planifi = popup.cancelWarningPopup();
        // planifi = new Planifi(driverWinium);
    }

    /**
     * Check if ‘Billing Rates’ On/Off switches toggle exists in 'Filters' tab
     */
    @Test
    public void testMPP551() {
        planifi.gotoPlanPart()
                .clickPlanCrudGoToPlan()
                .gotoSidebar()
                .clickSettingsDropDown()
                .clickOffFirstToggle()
                .clickOnFirstToggle()
                .clickOnThirdToggle()
                .applyOptionsFilter();
    }

    /**
     * Check if ‘Show Unposted Time’ On/Off switches toggles in 'Settings' tab works appropriately.
     */
    @Test
    public void testMPP2686() {
        try {
            planifi.gotoManagePart()
                    .gotoProjectStaffingBreadCrumb()
                    .gotoSidebar()
                    .clickSettingsDropDown()
                    .clickLeft()
                    .clickLeft()
                    .clickLeft();
            planifi.gotoSidebar()
                    .clickOnFourthToggle();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
