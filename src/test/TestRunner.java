import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import planify.common.Planifi;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class TestRunner {

    private String WINIUM_DRIVER_URL = "http://localhost:9999";
    private String DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\driver";
    private  String WINIUM_DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\Winium.Desktop.Driver.exe";
    private  Planifi page;
    private Process shell;
    private  File file = new File(WINIUM_DRIVER_PATH);
    private  DesktopOptions options;
    private  WiniumDriverService service;
    private  String PLANIFI_PATH = "C:\\Users\\User\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\VisualPlanning\\VisualPlanning.appref-ms";

    static WiniumDriver driverWinium;

@BeforeClass
public void checkIfDriverIsClosed(){
    if(service != null){
        service.stop();
        service = null;
    }
}

    //@BeforeTest
//    public static void setupEnvironment(){
//        options = new DesktopOptions(); //Instantiate Winium Desktop Options
//        options.setApplicationPath(PLANIFI_PATH);
//        //File driverPath = new File("C:\\WiniumDriver\\Winium.Desktop.Driver.exe");
//        service = new WiniumDriverService.Builder()
//                .usingDriverExecutable(file)
//                .usingPort(9999)
//                .withVerbose(true)
//                .withSilent(false)
//                .buildDesktopService();
//        try {
//            service.start();
//        } catch (IOException e) {
//            System.out.println("Exception while starting WINIUM service");
//            e.printStackTrace();
//        }
//        driverWinium = new WiniumDriver(service,options);
//        page = new Planifi(driverWinium);
//    }


    @BeforeMethod
    public void runWiniumDriver(){
        options = new DesktopOptions(); //Instantiate Winium Desktop Options
        options.setApplicationPath(PLANIFI_PATH);
        //File driverPath = new File("C:\\WiniumDriver\\Winium.Desktop.Driver.exe");
        service = new WiniumDriverService.Builder()
                .usingDriverExecutable(file)
                .usingPort(9999)
                .withVerbose(true)
                .withSilent(false)
                .buildDesktopService();
        try {
            service.start();
        } catch (IOException e) {
            System.out.println("Exception while starting WINIUM service");
            e.printStackTrace();
        }
        driverWinium = new WiniumDriver(service,options);
        page = new Planifi(driverWinium);
        //driverWinium.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @AfterTest
    public void tearDown(){
        service.stop();
    }
    //@AfterMethod
    public void killWiniumDriver(){
        shell.destroy();
    }
}
