package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class TestRunner {

    private String WINIUM_DRIVER_URL = "http://localhost:9999";
    private String DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\driver";
    private TestController page;

    protected WiniumDriver driverWinium;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(System.getProperty("planifi.directory"));
        System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
        driverWinium = new WiniumDriver(new URL(WINIUM_DRIVER_URL), options);
        driverWinium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page = new TestController(driverWinium);
    }
}
