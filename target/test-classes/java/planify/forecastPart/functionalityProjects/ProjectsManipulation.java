package planify.forecastPart.functionalityProjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.managePart.EarnedValueBreadCrumb;

public class ProjectsManipulation extends EarnedValueBreadCrumb  implements IDataBar {
    public ProjectsManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
