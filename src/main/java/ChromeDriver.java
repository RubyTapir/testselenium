import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне


        driver.get("https://market.yandex.by");
        driver.findElement(By.xpath("//a[@class='link topmenu__link'][contains(text(),'Бытовая техника')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Стиральные машины')]")).click();
    }
}
