package planify.planPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

public class EstimateBreadCrumb extends Plan implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectTypeCriteriaSidebar, IProjectManagerCriteriaSidebar, IPICCriteriaSidebar {
    public EstimateBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
