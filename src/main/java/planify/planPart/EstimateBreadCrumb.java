package planify.planPart;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Plan;
import planify.common.sidebar.*;

public class EstimateBreadCrumb extends Plan {
    public EstimateBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
