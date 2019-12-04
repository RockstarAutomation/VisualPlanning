package planify.planPart.functionalityPlan;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.planPart.functionalityEstimate.ProjectsContainerEstimatePart;

public class EmployeeContainerPlanPart extends ProjectsContainerEstimatePart {
    public EmployeeContainerPlanPart(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
