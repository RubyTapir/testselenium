import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //неявное ожидание - 10 сек

        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://www.seleniumhq.org");
        driver.navigate().to("https://www.google.by"); //результат тот же, что и с get
        driver.navigate().back(); //вернуться на страницу назад
        driver.navigate().forward(); //на страницу вперёд
        driver.navigate().refresh();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
