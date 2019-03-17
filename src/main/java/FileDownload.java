import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FileDownload {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://www.google.by/imghp?hl=ru&tab=wi");
        driver.findElement(By.xpath("//span[@class='S3Wjs']")).click();
        driver.findElement(By.xpath("//a[@class='qbtbha qbtbtxt qbclr']")).click();
        driver.findElement(By.xpath("//input[@id='qbfile']")).sendKeys("c:\\Downloads\\zlatan.jpg");
    }
}
