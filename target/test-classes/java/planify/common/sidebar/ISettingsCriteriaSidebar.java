package planify.common.sidebar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

import java.lang.reflect.Type;

public interface ISettingsCriteriaSidebar {
//    default Planifi clickClearSetting(WiniumDriver driver){
//        new Planifi(driver).getWebClearSetting().click();
//        return new Planifi(driver);
//    }
//
//    default Planifi clickApplySettings(WiniumDriver driver){
//        new Planifi(driver).getWebApplySetting().click();
//        return new Planifi(driver);
//    }
//    Planifi clickMyProjects(){
//
//    }

    Planifi clickActiveProjectsOnly();

    Planifi clickShowUnpostedTime(WebElement element, WiniumDriver driver);

    Planifi clickBillingRates(WebElement element, WiniumDriver driver);

    Planifi clickProjectsWithMilestones(WebElement element, WiniumDriver driver);

    Planifi clickSettings(WebElement element, WiniumDriver driver);
//    default <T> T clickOn(Class<T> atClass,){
//
//        try {
//            return  atClass.newInstance();
//        } catch (IllegalAccessException | InstantiationException ex) {
//            throw  new RuntimeException(ex.getMessage());
//        }
//    }
}

