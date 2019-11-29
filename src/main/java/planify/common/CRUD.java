package planify.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.WiniumDriver;
import planify.common.popup.ConfigurationPopup;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class CRUD {
    protected static WiniumDriver driver;
    private Boolean winState = true;

    private WebElement maximazeSizeOfWindow;
    private WebElement mainimazeSizeOfWindow;
    private WebElement helpLink;
    private WebElement processConfig;
    protected WebElement closeApplication;
    private WebElement visualPlanning ;


    protected CRUD(WiniumDriver webDriver){
        this.driver = webDriver;
    }

    private void initElements(){
        maximazeSizeOfWindow = driver.findElementByXPath("//Button[@name='1']");
        closeApplication = driver.findElementByXPath("//[@name = 'r']");
    }


    private WebElement getWebMaximazeSizeOfWindow(){
        //return driver.findElementByXPath("//*[@name='1']");
        return driver.findElementByName("1");
    }

    private WebElement getWebMinimazeSizeOfWindow(){
        //return driver.findElementByXPath("//*[@name='1']");
        return driver.findElementByName("2");
    }

    private WebElement getWebCloseApplication(){
        return driver.findElementByName("r");
    }

    public void closeApplication(){
        //visualPlanning = driver.findElementByXPath("/*[@name='Visual Planning']");
        //*[@name='Visual Planning']/*[@name = 'r']
        //HwndWrapper[DefaultDomain;;74c5f445-942d-45af-a0a4-5087916da51d]
        //closeApplication = driver.findElementByXPath("/*[@AutomationId = 'VisualPlanningUnity']");
        //driver.findElement(By.xpath("/*[@AutomationId = 'VisualPlanningUnity']//*[@name='r']")).click();
        //driver.findElement(exitButton).click();
        getWebCloseApplication().click();
    }

    public CRUD maximazeWindowApplication(){
        getWebMaximazeSizeOfWindow().click();
        winState = false;
        return this;
    }
//TODO custom exception
    public CRUD minimazeWindowApplication(){
        if(winState.equals(false)) {
            getWebMinimazeSizeOfWindow().click();
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

    public CRUD closeApp(){
        try {
            Robot robo = new Robot();
            robo.keyPress(KeyEvent.VK_ALT);
            robo.keyPress(KeyEvent.VK_F4);
        } catch (AWTException e) {
            e.printStackTrace();
        }
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

    public CRUD clickEnter() throws Exception {
        Robot robo = new Robot();
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
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
