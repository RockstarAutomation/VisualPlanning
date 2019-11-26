package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface IPhaseTypeCriteriaSidebar {
    default Planifi clickSelectAllPhaseType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickPhaseType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi choosePhaseType(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
