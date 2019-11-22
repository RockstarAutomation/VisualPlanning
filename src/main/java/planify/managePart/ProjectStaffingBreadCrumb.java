package planify.managePart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Manage;
import planify.common.sidebar.*;

public class ProjectStaffingBreadCrumb extends Manage implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectTypeCriteriaSidebar, IProjectManagerCriteriaSidebar, IPICCriteriaSidebar, ISupervisorCriteriaSidebar  {
    public ProjectStaffingBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
