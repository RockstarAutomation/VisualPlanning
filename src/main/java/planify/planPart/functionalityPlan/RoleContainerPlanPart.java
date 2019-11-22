package planify.planPart.functionalityPlan;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.employeeList.IRoleContainer;
import planify.planPart.functionalityEstimate.EmployeeContainerEstimatePart;

public class RoleContainerPlanPart extends EmployeeContainerEstimatePart implements IRoleContainer {
    public RoleContainerPlanPart(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
