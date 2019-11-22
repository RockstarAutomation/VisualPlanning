package planify.common.mainParts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.planPart.EstimateBreadCrumb;
import planify.planPart.PlanBreadCrumb;

public class Plan extends Planifi {
    @FindBy(name = "PLAN")
    private WebElement planCrud;

    @FindBy(name = "PLAN")
    private WebElement estimateCrud;




    public Plan(WiniumDriver webDriver) {
        super(webDriver);
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }

    public PlanBreadCrumb clickPlanCrudGoToPlan() {
        planCrud.click();
        driver.findElementByXPath("");
        return new PlanBreadCrumb(driver);
    }

    protected EstimateBreadCrumb clickPlanCrudGoToEstimate() {
        planCrud.click();
        return new EstimateBreadCrumb(driver);
    }
}
