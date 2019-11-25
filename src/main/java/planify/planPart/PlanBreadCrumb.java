package planify.planPart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

public class PlanBreadCrumb extends Plan implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectTypeCriteriaSidebar, IProjectManagerCriteriaSidebar, IPICCriteriaSidebar, ISupervisorCriteriaSidebar {


    public PlanBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }


    @Override
    public PlanBreadCrumb clickClearSetting() {
        getWebClearSetting().click();
        return new PlanBreadCrumb(driver);
    }

    @Override
    public Planifi clickApplySettings() {
        return null;
    }

    @Override
    public Planifi clickMyProjects() {
        return null;
    }

    @Override
    public Planifi clickActiveProjectsOnly() {
        return null;
    }

    @Override
    public Planifi clickShowUnpostedTime(WebElement element, WiniumDriver driver) {
        return null;
    }

    @Override
    public Planifi clickBillingRates(WebElement element, WiniumDriver driver) {
        return null;
    }

    @Override
    public Planifi clickProjectsWithMilestones(WebElement element, WiniumDriver driver) {
        return null;
    }

    @Override
    public Planifi clickSettings(WebElement element, WiniumDriver driver) {
        return null;
    }
}
