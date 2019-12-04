package planify.forecastPart.functionalityEmployeeSchedule;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.managePart.BillingProjectionBreadCrumb;

public class EmployeeScheduleManipulation extends BillingProjectionBreadCrumb   {
    public EmployeeScheduleManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
