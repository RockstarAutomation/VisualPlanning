package planify.common.mainParts;

import org.openqa.selenium.By;
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
    private WebElement getApplyWebElement(){
        return driver.findElementByName("APPLY");
    }
    private WebElement getEstimateWebElement() {
        return driver.findElementByName("ESTIMATE");
    }
    //[@AutomationId='PLAN']/following-sibling:/[@ControlType='ControlType.Tab'][@ControlType='ControlType.Tab']/
    private WebElement getXpathEstimateWebElement() {
        return driver.findElement(By.xpath("/*[@AutomationId = 'VisualPlanningUnity']//*[@name='ESTIMATE']"));
    }

    public PlanBreadCrumb clickPlanCrudGoToPlan() {
        getPlanWebElement().click();
        return new PlanBreadCrumb(driver);
    }

    public EstimateBreadCrumb clickPlanCrudGoToEstimate() {
        getEstimateWebElement() .click();
        return new EstimateBreadCrumb(driver);
    }

    public EstimateBreadCrumb clickXpathPlanCrudGoToEstimate() {
        getXpathEstimateWebElement() .click();
        return new EstimateBreadCrumb(driver);
    }

}
