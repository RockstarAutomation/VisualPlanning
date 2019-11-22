package planify.planPart.functionalityEstimate;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.employeeList.IEmployeeContainer;

public class EmployeeContainerEstimatePart extends ProjectsContainerEstimatePart implements IEmployeeContainer {
    public EmployeeContainerEstimatePart(WiniumDriver webDriver) {
        super(webDriver);
    }
}
