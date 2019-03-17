import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        WebElement link = driver.findElement(By.xpath("//*[@id=\"n-bug_in_article\"]/a"));
        System.out.println(link.getText());
        link.click();

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline py-2 d-block d-lg-inline-block'][contains(text(),'Business')]")).click();

    }
}
