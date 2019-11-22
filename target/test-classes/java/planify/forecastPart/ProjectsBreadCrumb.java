package planify.forecastPart;

import org.openqa.selenium.winium.WiniumDriver;
import planify.common.mainParts.Forecast;
import planify.common.options.details.ICalendarDetailsBar;
import planify.common.options.details.IUploadPhotoDetailsBar;
import planify.common.options.projectList.IProjectsContainer;
import planify.common.sidebar.*;

public class ProjectsBreadCrumb extends Forecast implements ISettingsCriteriaSidebar, IOfficeOrganizationCriteriaSidebar,
        IProjectManagerCriteriaSidebar, IPICCriteriaSidebar, IClientCriteriaSidebar, IProjectsContainer, IUploadPhotoDetailsBar, ICalendarDetailsBar {
    public ProjectsBreadCrumb(WiniumDriver webDriver) {
        super(webDriver);
    }
}
