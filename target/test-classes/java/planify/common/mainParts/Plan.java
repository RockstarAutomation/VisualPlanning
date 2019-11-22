package planify.common.mainParts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.planPart.EstimateBreadCrumb;
import planify.planPart.PlanBreadCrumb;

public class Plan extends Planifi {
    private WebElement estimateCrud;




    public Plan(WiniumDriver webDriver) {
        super(webDriver);
    }

    private WebElement getPlanWebElement(){
       return driver.findElementByName("PLAN");
    }
    private WebElement getEstimateWebElement() {
        return driver.findElementByName("ESTIMATE");
    }

    public PlanBreadCrumb clickPlanCrudGoToPlan() {
        getPlanWebElement().click();
        return new PlanBreadCrumb(driver);
    }

    protected EstimateBreadCrumb clickPlanCrudGoToEstimate() {
        getEstimateWebElement() .click();
        return new EstimateBreadCrumb(driver);
    }
}
