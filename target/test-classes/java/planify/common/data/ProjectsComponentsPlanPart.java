package planify.common.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;

public class ProjectsComponentsPlanPart {
    private WebElement element;

    public ProjectsComponentsPlanPart(WebElement winiumElement) {
        this.element = winiumElement;
    }

    public String getElementAttribute(String attribute){
        return element.getAttribute(attribute);
    }



}
