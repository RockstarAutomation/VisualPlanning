package planify.forecastPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Forecast;
import planify.common.sidebar.IOfficeOrganizationCriteriaSidebar;
import planify.common.sidebar.IRoleTypeCriteriaSidebar;
import planify.common.sidebar.ISettingsCriteriaSidebar;
import planify.common.sidebar.ISkillsCriteriaSidebar;

public class EmployeeScheduleBreadCrumb extends Forecast implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IRoleTypeCriteriaSidebar, ISkillsCriteriaSidebar {
    public EmployeeScheduleBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
