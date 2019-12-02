import jdk.javadoc.internal.tool.Main;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import planify.common.Planifi;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static planify.common.CRUD.waitFiveSeconds;

public abstract class TestRunner {
    //DB
    private List<String> listSQLResult;

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

    static WiniumDriver driverWinium;

    @BeforeClass
    public void checkIfDriverIsClosed() {
        properties = new Properties();
        try {
            properties.load(Main.class.getResourceAsStream("/pom.properties"));
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

//TODO driver path

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

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        page.closeApplication();
        service.stop();

    }

    public List<String> databaseInit(String query) {
        //https://stackoverflow.com/questions/13283991/how-to-access-the-remote-database-using-java
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
}
