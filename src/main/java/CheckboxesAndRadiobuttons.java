import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxesAndRadiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://market.yandex.by");
        driver.findElement(By.xpath("//a[@class='link topmenu__link'][contains(text(),'Бытовая техника')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Стиральные машины')]")).click();

        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'BEKO')]")).isSelected());
        driver.findElement(By.xpath("//span[contains(text(),'BEKO')]")).click();
        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'BEKO')]")).isSelected()); //сейчас выводит false, хотя должно быть true - нужно найти правильный input
        driver.findElement(By.xpath("//span[contains(text(),'Hotpoint-Ariston')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Weissgauff')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Самовывоз')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'С доставкой')]")).click();



    }
}
