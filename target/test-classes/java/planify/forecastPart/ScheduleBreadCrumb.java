package planify.forecastPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Forecast;
import planify.common.options.scheduleListing.IScheduleListingOptionBar;

public class ScheduleBreadCrumb extends Forecast implements IScheduleListingOptionBar {
    public ScheduleBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
