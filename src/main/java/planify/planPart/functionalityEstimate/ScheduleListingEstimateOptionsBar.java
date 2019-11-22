package planify.planPart.functionalityEstimate;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.scheduleListing.IScheduleListingOptionBar;

public class ScheduleListingEstimateOptionsBar extends DetailsEstimateOptionsBar implements IScheduleListingOptionBar {
    public ScheduleListingEstimateOptionsBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
