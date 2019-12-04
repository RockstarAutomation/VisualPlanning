import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import planify.common.InstallPlanifi;
import planify.common.Planifi;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static planify.common.CRUD.waitFiveSeconds;

public abstract class InstallTestRunner {
    private String DRIVER_PATH;
    private String WINIUM_DRIVER_PATH;
    private File file;
    private DesktopOptions options;
    private WiniumDriverService service;
    private String PLANIFI_INSTALL_PATH;
    private Properties properties;
    WebDriver driver;

//    static WiniumDriver winiumDriver;

    @BeforeClass
    public void checkIfDriverIsClosed() {
        properties = new Properties();
        try {
            properties.load(Planifi.class.getResourceAsStream("/pom.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WINIUM_DRIVER_PATH = properties.getProperty("winium.driver.path");
        PLANIFI_INSTALL_PATH = properties.getProperty("planifi.install.application.path");
        DRIVER_PATH = properties.getProperty("chrome.driver.path");
        file = new File(WINIUM_DRIVER_PATH);
        if (service != null) {
            service.stop();
            service = null;
        }
    }

    public WiniumDriver runWiniumDriver() {
        WiniumDriver driver;
        options = new DesktopOptions();
        options.setApplicationPath(PLANIFI_INSTALL_PATH);
        service = new WiniumDriverService.Builder()
                .usingDriverExecutable(file)
                .usingPort(Integer.parseInt(properties.getProperty("winium.driver.port")))
                .withVerbose(true)
                .withSilent(false)
                .buildDesktopService();
        try {
            service.start();
        } catch (IOException e) {
            System.out.println("Exception while starting WINIUM service");
            e.printStackTrace();
        }
        driver = new WiniumDriver(service, options);
        return driver;
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        service.stop();

    }

    public void planifiDownload() {
        System.setProperty("webdriver.chrome.driver",
                DRIVER_PATH);
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> chromePrefs = new HashMap<>();
        options.addArguments("lang=en-US");
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory","C:\\Users\\User\\Downloads" );
//        chromePrefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data");
//        options.addArguments("--test-type");
//        options.addArguments("--disable-extensions"); //to disable browser extension popup
   //     options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(properties.getProperty("planifi.download.url"));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Download')]")));
        driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitFiveSeconds();
        driver.close();
        driver.quit();
        //return new InstallPlanifi(runWiniumDriver());
    }



}
