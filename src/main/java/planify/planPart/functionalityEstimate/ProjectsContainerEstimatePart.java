package planify.planPart.functionalityEstimate;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.projectList.IProjectsContainer;
import planify.planPart.EstimateBreadCrumb;

public class ProjectsContainerEstimatePart extends EstimateBreadCrumb implements IProjectsContainer {
    public ProjectsContainerEstimatePart(WiniumDriver webDriver) {
        super(webDriver);
    }
}
