package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IProjectManagerCriteriaSidebar {
    default Planifi clickSelectAllProjectManagers(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickProjectManager(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi chooseProjectManager(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
