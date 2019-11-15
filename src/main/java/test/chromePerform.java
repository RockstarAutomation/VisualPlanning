package test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import static java.util.concurrent.TimeUnit.SECONDS;


public class chromePerform {
    public WebDriver driver;

    @Parameters({
            "browser"
    })
    @BeforeMethod
    public void setup2() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C://chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(40, SECONDS);
    }



@Test
    public void openPlanifyWebApp() throws Exception {

        Thread.sleep(3000);
        driver.get("http://analyzer-api.incoding.biz");
        driver.findElement(By.xpath("/html/body/div[3]/header/table/tbody/tr/td[3]/a[1]")).click();
        System.out.println("Nice");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/a[3]/span")).click();



        String hi = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/select/option[3]")).getAttribute("selected");
        System.out.println(hi);



    List<WebElement> Access = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/select"));
    for (WebElement row : Access) {
        if (row.isDisplayed()) {
            System.out.println(row.getText());
        }
    }
}


}










