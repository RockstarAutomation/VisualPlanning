package planify.planPart;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

public class PlanBreadCrumb extends Plan implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectTypeCriteriaSidebar, IProjectManagerCriteriaSidebar, IPICCriteriaSidebar, ISupervisorCriteriaSidebar {



    public PlanBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElemets();
    }

    private void initElemets(){
        PageFactory.initElements(driver, this);
    }


}
