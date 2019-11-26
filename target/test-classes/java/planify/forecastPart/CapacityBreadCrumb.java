package planify.forecastPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Forecast;
import planify.common.sidebar.IOfficeOrganizationCriteriaSidebar;
import planify.common.sidebar.IRoleTypeCriteriaSidebar;
import planify.common.sidebar.ISettingsCriteriaSidebar;
import planify.common.sidebar.ISkillsCriteriaSidebar;

public class CapacityBreadCrumb extends Forecast {
    public CapacityBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
