package planify.common.mainParts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;
import planify.managePart.*;

public class Manage extends Planifi {

    public Manage(WiniumDriver webDriver) {
        super(webDriver);
    }

    //Page object

    private WebElement getWebProjectStaffingCrud() {
        return driver.findElement(By.name("Project Staffing"));
    }

    private WebElement getWebEarnedValueCrud() {
        return driver.findElement(By.name("Earned Value"));
    }

    private WebElement getWebRevenueCrud() {
        return driver.findElement(By.name("Revenue"));
    }

    private WebElement getWebBillingProjectionCrud() {
        return driver.findElement(By.name("Billing Projection"));
    }

    private WebElement getWebAssignmentsCrud() {
        return driver.findElement(By.name("Assignments"));
    }


    //Functionality

    public boolean checkIfProjectStaffingIsDisplayed(){
        return getWebProjectStaffingCrud().isDisplayed();
    }

    public boolean checkIfAssignmentsIsDisplayed(){
        return getWebAssignmentsCrud().isDisplayed();
    }

    public boolean checkIfBillingProjectionIsDisplayed(){
        return getWebBillingProjectionCrud().isDisplayed();
    }

    public boolean checkIfRevenueIsDisplayed(){
        return getWebRevenueCrud().isDisplayed();
    }

    public boolean checkIfEarnedValueIsDisplayed(){
        return getWebEarnedValueCrud().isDisplayed();
    }

    //Business logic

    public AssignmentsBreadCrumb gotoAssignmentsBreadCrumb(){
        getWebAssignmentsCrud().click();
        return new AssignmentsBreadCrumb(driver);
    }

    public ProjectStaffingBreadCrumb gotoProjectStaffingBreadCrumb(){
        getWebProjectStaffingCrud().click();
        return new ProjectStaffingBreadCrumb(driver);
    }
    public EarnedValueBreadCrumb gotoEarnedValueBreadCrumb(){
        getWebEarnedValueCrud().click();
        return new EarnedValueBreadCrumb(driver);
    }
    public RevenueBreadCrumb gotoRevenueBreadCrumb(){
        getWebRevenueCrud().click();
        return new RevenueBreadCrumb(driver);
    }
    public BillingProjectionBreadCrumb gotoBillingProjectionBreadCrumb(){
        getWebBillingProjectionCrud().click();
        return new BillingProjectionBreadCrumb(driver);
    }
}
