package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IProjectTypeCriteriaSidebar {
    default Planifi clickPromotional(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
    default Planifi clickOverhead(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickRegular(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickSellectAllProjectTypes(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickProjectType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

}
