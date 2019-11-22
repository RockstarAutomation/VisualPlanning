import jdk.javadoc.internal.tool.Main;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import planify.common.Planifi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class TestRunner {

    private String WINIUM_DRIVER_URL = "http://localhost:9999";
    private String DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\driver";
    private String WINIUM_DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\Winium.Desktop.Driver.exe";
    private Planifi page;
    private Process shell;

    WiniumDriver driverWinium;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(System.getProperty("planifi.directory"));
        System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
        driverWinium = new WiniumDriver(new URL(WINIUM_DRIVER_URL), options);
        driverWinium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page = new Planifi(driverWinium);
    }


    @BeforeMethod
    public void runWiniumDriver(){
        Properties properties = new Properties();
        try {
            properties.load(Main.class.getResourceAsStream("/pom.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ProcessBuilder pro = new ProcessBuilder(WINIUM_DRIVER_PATH,
                "Winium.Desktop.Driver",
                WINIUM_DRIVER_URL);
        try {
            shell = pro.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.getProperty("planifyPath");
        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability();
    }

    @AfterMethod
    public void killWiniumDriver(){
        shell.destroy();
    }
}
