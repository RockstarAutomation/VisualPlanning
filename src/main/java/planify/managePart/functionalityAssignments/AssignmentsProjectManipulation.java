package planify.managePart.functionalityAssignments;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.managePart.AssignmentsBreadCrumb;

public class AssignmentsProjectManipulation extends AssignmentsBreadCrumb {
    public AssignmentsProjectManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
