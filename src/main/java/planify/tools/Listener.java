package planify.tools;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Listener  implements ITestListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static ByteArrayOutputStream context;
    public static PrintStream contextPrint;
    private  PrintWriter writer;
    private File file;


    public void onTestStart(ITestResult result) {
        context = new ByteArrayOutputStream();
        contextPrint = new PrintStream(context, true);
        logger.info(result.getName() + " started\n");
        file = new File("C:\\Automation\\PlanifiPr\\logs\\TestLogs.log");
        try {
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.print("");
        writer.close();

    }

    public void onTestSuccess(ITestResult result) {
        logger.debug(context.toString());
        attach(result.getName());

    }

    public void onTestFailure(ITestResult result) {
        logger.error(result.getName() + "Failed", result.getThrowable());
        //Allure.addAttachment(result.getName(), new ByteArrayInputStream(((TakesScreenshot) winyushka).getScreenshotAs(OutputType.BYTES)));
        attach(result.getName());

    }

    private void attach(String fileName) {
        Path content = Paths.get("./logs/TestLogs.log");
        try {
            InputStream is = Files.newInputStream(content);
            Allure.addAttachment("Logs for " + fileName, is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
