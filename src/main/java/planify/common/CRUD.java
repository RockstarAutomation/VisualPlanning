package planify.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.popup.ConfigurationPopup;
import test.TestController;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class CRUD {
    protected WiniumDriver driver;
    private Boolean winState = true;

    @FindBy(name = "1")
    @CacheLookup
    private WebElement changeSizeOfWindow;

    @FindBy(name = "help")
    @CacheLookup
    private WebElement helpLink;

    @FindBy(name = "WINDOWS-7M766IE\\User")
    @CacheLookup
    private WebElement processConfig;

    protected CRUD(WiniumDriver webDriver){
        this.driver = webDriver;
        initElements();
    }

    private void initElements(){
        PageFactory.initElements(driver, this);
    }

    public void closeApplication(){}

    public CRUD miximazeWindowApplication(){
        changeSizeOfWindow.click();
        winState = false;
        return this;
    }
//TODO custom exception
    public CRUD minimazeWindowApplication(){
        if(winState.equals(false)) {
            changeSizeOfWindow.click();
        }
        else{
            throw new RuntimeException("The application has already deployed");
        }
        return this;
    }

    public ConfigurationPopup openConfigurationApplication(){
        processConfig.click();
        return new ConfigurationPopup();
    }
//TODO web help page
    public void gotoHelpWebPage(){
        helpLink.click();
    }

    public CRUD clickShiftTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_TAB);
        return this;
    }


    public CRUD clickTab() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        return this;
    }

    public CRUD clickDown() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        robo.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
        return this;
    }

    public CRUD clickRight() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        return this;
    }

    public CRUD clickSpace() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_SPACE);
        robo.keyRelease(KeyEvent.VK_SPACE);
        return this;
    }

    public CRUD clickLeft() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_LEFT);
        robo.keyRelease(KeyEvent.VK_LEFT);
        return this;
    }

    public CRUD clickUp() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_UP);
        robo.keyRelease(KeyEvent.VK_UP);
        return this;
    }




}
