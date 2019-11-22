package planify.planPart.functionalityPlan;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.summary.ISummaryOptionBar;

public class SummaryPlanOptionBar extends DetailsPlanOptionsBar implements ISummaryOptionBar {
    public SummaryPlanOptionBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
