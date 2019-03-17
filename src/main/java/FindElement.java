import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание - 10 сек
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://ru.wikipedia.org");

        WebElement link = driver.findElement(By.linkText("Войти")); //найти элемент по тексту ссылки
        WebElement link2 = driver.findElement(By.partialLinkText("об ошибке")); //по части текста ссылки
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement idSpecialPages = driver.findElement(By.id("t-specialpages"));
        WebElement featuredArticle = driver.findElement(By.cssSelector("#main-tfa > div.main-box-subtitle"));
        WebElement featuredPicture = driver.findElement(By.xpath("//*[@id=\"Изображение_дня\"]"));

        driver.quit();
    }
}
