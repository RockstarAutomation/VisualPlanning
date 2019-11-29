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

public abstract class TestRunner {
    //DB
    private List<String> listSQLResult;
    private String instanceName = "";
    private String dbName = "SHW7";
    private String user = "planifi";
    private String pass = "Incoding,1";
    private String connectionURL = "jdbc:sqlserver://localhost:1433"+
            "databaseName=" + dbName + ";integratedSecurity=true;";
            private String test = "jdbc:sqlserver://192.168.1.220;"+
            "DatabaseName=" + dbName + "user="+user+";password="+pass;

    private String WINIUM_DRIVER_URL = "http://localhost:9999";
    private String DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\driver";
    private String WINIUM_DRIVER_PATH = "C:\\Users\\User\\PlanifiPr\\Winium.Desktop.Driver.exe";
    private Planifi page;
    private Process shell;
    private File file = new File(WINIUM_DRIVER_PATH);
    private DesktopOptions options;
    private WiniumDriverService service;
    private String PLANIFI_PATH = "C:\\Users\\User\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\VisualPlanning\\VisualPlanning.appref-ms";

    static WiniumDriver driverWinium;

    @BeforeClass
    public void checkIfDriverIsClosed() {
        if (service != null) {
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


    @BeforeMethod(alwaysRun = true)
    public void runWiniumDriver() {
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
        driverWinium = new WiniumDriver(service, options);
        page = new Planifi(driverWinium);
        //driverWinium.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


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
                con = DriverManager.getConnection(test, user, pass);
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
        try (Connection con = DriverManager.getConnection(connectionURL, user, pass)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
                listSQLResult.add(rs.getString(1));
        }
        return listSQLResult;
    }
}
