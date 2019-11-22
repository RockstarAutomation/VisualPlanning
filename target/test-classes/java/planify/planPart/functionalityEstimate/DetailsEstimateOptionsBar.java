package planify.planPart.functionalityEstimate;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.options.details.*;

public class DetailsEstimateOptionsBar extends RoleContainerEstimatePart implements IBudgetDetailsBar, IDisciplineBudgetDetailsBar, IExportDetailsBar,
        IFollowingsDetailsBar, IImportEmployeesDetailsBar, IRefreshDetailsBar, ISaveDetailsBar, IShowOtherDetailsBar {
    public DetailsEstimateOptionsBar(WiniumDriver webDriver) {
        super(webDriver);
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }
}
