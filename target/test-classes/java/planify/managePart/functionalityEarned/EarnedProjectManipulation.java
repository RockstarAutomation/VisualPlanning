package planify.managePart.functionalityEarned;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.manageOptions.IDataBar;
import planify.managePart.EarnedValueBreadCrumb;

public class EarnedProjectManipulation extends EarnedValueBreadCrumb  implements IDataBar {
    public EarnedProjectManipulation(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
