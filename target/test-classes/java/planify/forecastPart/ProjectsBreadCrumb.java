package planify.forecastPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Forecast;
import planify.common.options.details.ICalendarDetailsBar;
import planify.common.options.details.IUploadPhotoDetailsBar;
import planify.common.options.projectList.IProjectsContainer;
import planify.common.sidebar.*;

public class ProjectsBreadCrumb extends Forecast  {
    public ProjectsBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
