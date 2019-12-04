package planify.planPart.functionalityEstimate;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

public class DetailsEstimateOptionsBar extends RoleContainerEstimatePart {
    public DetailsEstimateOptionsBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
