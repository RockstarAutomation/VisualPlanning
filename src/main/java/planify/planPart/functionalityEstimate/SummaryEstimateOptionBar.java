package planify.planPart.functionalityEstimate;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.summary.ISummaryOptionBar;

public class SummaryEstimateOptionBar extends DetailsEstimateOptionsBar implements ISummaryOptionBar {
    public SummaryEstimateOptionBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
