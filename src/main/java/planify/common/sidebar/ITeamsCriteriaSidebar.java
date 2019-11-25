package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface ITeamsCriteriaSidebar {

    default Planifi clickSelectAllTeams(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickTeams(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi chooseTeams(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
