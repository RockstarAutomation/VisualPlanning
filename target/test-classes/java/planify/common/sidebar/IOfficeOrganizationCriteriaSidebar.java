package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IOfficeOrganizationCriteriaSidebar {
    default Planifi clickConsolidation(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickOfficeOrganization(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickCSSLLS(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickAfflitesGroup(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickSHWCalifornia(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickSHWLLPGroup(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickSHWMichigan(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
