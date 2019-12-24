

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import planify.common.Planifi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Date;

import static planify.common.CRUD.waitFiveSeconds;

public abstract class TestRunner {
    //DB
    private List<String> listSQLResult;
    private final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss";
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getName());

    private String dbUser;
    private String dbPassword;
    private  String dbURL;

    private String WINIUM_DRIVER_URL;
    private String DRIVER_PATH;
    private String WINIUM_DRIVER_PATH;
    private Planifi page;
    private File file ;
    private DesktopOptions options;
    private WiniumDriverService service;
    private String PLANIFI_PATH;
    private Properties properties;
    private WebDriver driver;

    static WiniumDriver driverWinium;

    @BeforeClass
    public void checkIfDriverIsClosed() {
        properties = new Properties();
        try {
            properties.load(Planifi.class.getResourceAsStream("/pom.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        WINIUM_DRIVER_PATH = properties.getProperty("winium.driver.path");
        PLANIFI_PATH = properties.getProperty("panifi.path");
        DRIVER_PATH = properties.getProperty("chrome.driver.path");
        WINIUM_DRIVER_URL = properties.getProperty("winium.driver.url");
        file = new File(WINIUM_DRIVER_PATH);
        if (service != null) {
            service.stop();
            service = null;
        }
    }


    @BeforeMethod(alwaysRun = true)
    public void runWiniumDriver() {
        options = new DesktopOptions();
        options.setApplicationPath(PLANIFI_PATH);
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
        driverWinium = new WiniumDriver(service, options);
        page = new Planifi(driverWinium);
        waitFiveSeconds();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult testResult) {
        if (!testResult.isSuccess()) {
            try {
                String name = takeScreenShot();
//                takePageSource(name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        page.closeApplication();
        service.stop();

    }

    public List<String> databaseInit(String query) {
        listSQLResult = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next())
                listSQLResult.add(rs.getString(12));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSQLResult;

    }

    public List<String> initDB(String query) throws SQLException {
        listSQLResult = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
                listSQLResult.add(rs.getString(1));
        }
        return listSQLResult;
    }
    private String takeScreenShot() throws IOException {
        String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
        File scrFile = ((TakesScreenshot) driverWinium).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./img/" + currentTime + "_screenshot.png"));
        log.info("Screenshot was taken");
        Path content = Paths.get("./img/" + currentTime + "_screenshot.png");
        try (InputStream is = Files.newInputStream(content)){
            Allure.addAttachment("Screenshot", is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./img/" + currentTime + "_screenshot";
    }
//
//    private void takePageSource(String fileName) {
//        String pageSource = driverWinium.getPageSource();
//        Path path = Paths.get(fileName + ".txt");
//        byte[] strToBytes = pageSource.getBytes();
//        try {
////            Files.write(path, strToBytes, StandardOpenOption.CREATE);
//            Files.write(path, strToBytes, StandardOpenOption.CREATE);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
