package planify.managePart.functionalityProjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.forecastPart.ProjectsBreadCrumb;

public class ScheduleManipulation extends ProjectsBreadCrumb implements IDataBar {
    public ScheduleManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
