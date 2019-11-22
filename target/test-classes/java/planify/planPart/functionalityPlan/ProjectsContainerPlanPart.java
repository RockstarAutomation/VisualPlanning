package planify.planPart.functionalityPlan;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.projectList.IProjectsContainer;
import planify.planPart.PlanBreadCrumb;

public class ProjectsContainerPlanPart extends PlanBreadCrumb implements IProjectsContainer {
    public ProjectsContainerPlanPart(WiniumDriver webDriver) {
        super(webDriver);
    }
}
