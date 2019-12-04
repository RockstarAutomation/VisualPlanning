package planify.planPart.functionalityPlan;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.planPart.functionalityEstimate.RoleContainerEstimatePart;

public class DetailsPlanOptionsBar extends RoleContainerEstimatePart {
    public DetailsPlanOptionsBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
