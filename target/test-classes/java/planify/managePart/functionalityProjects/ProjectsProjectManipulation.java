package planify.managePart.functionalityProjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.forecastPart.ProjectsBreadCrumb;

public class ProjectsProjectManipulation extends ProjectsBreadCrumb implements IDataBar {
    public ProjectsProjectManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
