package planify.managePart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Manage;
import planify.common.sidebar.IOfficeOrganizationCriteriaSidebar;
import planify.common.sidebar.IPICCriteriaSidebar;
import planify.common.sidebar.IProjectManagerCriteriaSidebar;
import planify.common.sidebar.ISettingsCriteriaSidebar;

public class BillingProjectionBreadCrumb extends Manage implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectManagerCriteriaSidebar, IPICCriteriaSidebar {
    public BillingProjectionBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
