package planify.forecastPart.functionalityCapacity;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.managePart.AssignmentsBreadCrumb;

public class CapacityManipulation extends AssignmentsBreadCrumb implements IDataBar {
    public CapacityManipulation(WiniumDriver webDriver) {
        super(webDriver);
    }
}
