package planify.planPart.functionalityPlan;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.details.*;
import planify.planPart.functionalityEstimate.RoleContainerEstimatePart;

public class DetailsPlanOptionsBar extends RoleContainerEstimatePart implements IBudgetDetailsBar, IDisciplineBudgetDetailsBar, IExportDetailsBar,
        IFollowingsDetailsBar, IImportEmployeesDetailsBar, IRefreshDetailsBar, ISaveDetailsBar, IShowOtherDetailsBar {
    public DetailsPlanOptionsBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
