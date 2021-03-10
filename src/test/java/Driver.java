import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Driver {

   @Test
           public void test1() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/archanashirsat/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("archanashirsat0208@gmail.com");
        driver.findElement(By.cssSelector("input[name='spree_user[password]']")).sendKeys("Practise12");
        driver.findElement(By.cssSelector("input[name='commit']")).click();
        driver.findElement(By.cssSelector("a[href='/products/ruby-on-rails-tote']")).click();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().wait(3000);
        driver.findElement(By.xpath("a[text()='Logout']")).click();
        System.out.println("Logout");

        driver.quit();

    }
}
