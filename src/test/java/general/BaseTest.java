package general;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void initaliseBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/archanashirsat/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @AfterTest

   /** public static void screenshots(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File("./screenshots" + result.getName() + ".png"));
                System.out.println("Successfully captured a screenshot");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot " + e.getMessage());
            }
        }
    }**/
    public void teardown() {
        driver.quit();
    }
}
