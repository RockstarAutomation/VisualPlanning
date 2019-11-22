package planify.managePart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Manage;
import planify.common.sidebar.*;

public class AssignmentsBreadCrumb extends Manage implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        ISupervisorCriteriaSidebar, ISkillsCriteriaSidebar, ITeamsCriteriaSidebar {
    public AssignmentsBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
