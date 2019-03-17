import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFields {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).getAttribute("value"));
        driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).clear();

        /*driver.get("https://github.com/");
        driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys("testusername8899");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("testusername8");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[2]/div/form/button")).click();*/

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("alarma@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("papilloma");
        driver.findElement(By.cssSelector("#u_0_3")).submit();
        System.out.println("E-mail is: " + driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("value"));


    }
}
