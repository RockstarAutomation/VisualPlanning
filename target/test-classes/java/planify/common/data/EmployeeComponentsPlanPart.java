package planify.common.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;

public class EmployeeComponentsPlanPart {
    private WebElement element;
    private WiniumDriver driver;

//    private String roleTitle;
//    private String space;
//    private String rateValue;
//    private String rateTitle;
//    private String w4AvailbleValue;
//    private String w4AvailbleTitle;
//    private String w8AvailbleValue;
//    private String w8AvailbleTitle;
//    private String skillsTitle;
//    private String skillsValue;
//    private String name;

    public EmployeeComponentsPlanPart(WebElement element, WiniumDriver driver) {
        this.element = element;
        this.driver = driver;
    }

    public String getRateValue(String rate) {
        return driver.findElement(By.name(rate)).getAttribute("Name");
    }

    public String getW4AvailbleValue(String w4Availble) {
        return driver.findElement(By.name(w4Availble)).getAttribute("Name");
    }

    public String getW8AvailbleValue(String w8Availble) {
        return driver.findElement(By.name(w8Availble)).getAttribute("Name");
    }

    public String getSkillsValue(String skills) {
        return driver.findElement(By.name(skills)).getAttribute("Name");
    }

    public String getEmployeeName(String name) {
        return driver.findElement(By.name(name)).getAttribute("Name");
    }

}
