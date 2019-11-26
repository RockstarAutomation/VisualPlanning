package planify.common.sidebar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

public interface ISkillsCriteriaSidebar {

    default Planifi clickSelectAllSkills(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi clickSkills(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }

    default Planifi chooseSkills(WebElement element, WiniumDriver driver){
        element.click();
        return new Planifi(driver);
    }
}
