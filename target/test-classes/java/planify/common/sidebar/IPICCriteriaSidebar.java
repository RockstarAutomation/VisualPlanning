package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IPICCriteriaSidebar {

    default Planifi clickSelectAllPIC(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickPIC(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi choosePIC(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
