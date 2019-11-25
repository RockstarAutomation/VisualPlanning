package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface ISupervisorCriteriaSidebar {
    default Planifi clickSelectAllSupervisor(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickSupervisor(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi chooseSupervisor(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
