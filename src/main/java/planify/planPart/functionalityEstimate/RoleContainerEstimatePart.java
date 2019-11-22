package planify.planPart.functionalityEstimate;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.employeeList.IRoleContainer;

public class RoleContainerEstimatePart extends EmployeeContainerEstimatePart implements IRoleContainer {
    public RoleContainerEstimatePart(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
