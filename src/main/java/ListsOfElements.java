import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ListsOfElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://market.yandex.by");
        driver.findElement(By.xpath("//a[@class='link topmenu__link'][contains(text(),'Бытовая техника')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Стиральные машины')]")).click();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='_178jz2CyDL']//div[3]")); //это список всех чекбоксов раздела "Производители" (неточный, нужно искать нужный путь)
        //checkboxes.get(3).click(); //нажимаем на 4-й чекбокс из списка

        for (WebElement checkbox : checkboxes) {
            checkbox.click(); //выделяем все чекбоксы из списка
        }
    }
}
