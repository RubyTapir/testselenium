import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        WebDriverWait wait = (new WebDriverWait(driver, 5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@title='Visit the main page']"))); //ожидаем, пока на странице не появится указанный элемент, потом выполняем последующие действия

        driver.findElement(By.xpath("//a[contains(text(),'Create a book')]")).click();

}
}
