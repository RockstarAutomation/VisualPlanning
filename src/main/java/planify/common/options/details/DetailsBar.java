package planify.common.options.details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.Planifi;

import java.util.PrimitiveIterator;

public class DetailsBar extends Planifi {
    public DetailsBar(WiniumDriver webDriver) {
        super(webDriver);
    }
//    PageObjects

    private WebElement getMainPathForDetailsElements(){
 //       return driver.findElementByXPath("//*[@AutomationId = 'UserControl']");
        return driver.findElementByClassName("KanbanPlanning");
    }

    private WebElement getWebDetailsPart(){
       // return getMainPathForDetailsElements().findElement(By.xpath("Pane[@ClassName = 'ScrollViewer']"));
        return getMainPathForDetailsElements().findElement(By.className("ScrollViewer"));
    }

    private WebElement getWebSummaryExtendButton(){
        //return getWebDetailsPart().findElement(By.xpath("[@AutomationId = 'tglBtn_Summary']"));
        return getWebDetailsPart().findElement(By.name("SHOW OTHER DETAILS"));
    }

    //Functionality

    public void clickOnSummaryExtendButton(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getWebSummaryExtendButton().click();
    }

}
