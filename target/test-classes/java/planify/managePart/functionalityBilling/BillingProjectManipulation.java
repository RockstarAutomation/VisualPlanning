package planify.managePart.functionalityBilling;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.managePart.BillingProjectionBreadCrumb;

public class BillingProjectManipulation extends BillingProjectionBreadCrumb  implements IDataBar {
    public BillingProjectManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
