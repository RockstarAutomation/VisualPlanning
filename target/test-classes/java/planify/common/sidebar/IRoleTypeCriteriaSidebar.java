package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IRoleTypeCriteriaSidebar {
    default Planifi clickSelectAllRoleType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickRoleType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi chooseRoleType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
