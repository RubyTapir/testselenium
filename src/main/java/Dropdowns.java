import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdowns {

    static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("http://new-rutor.org/search/");
        /*driver.findElement(By.xpath("//select[@id='category_id']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Сериалы')]")).click();
        driver.findElement(By.xpath("//select[@id='search_method']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'все слова')]")).click();
        driver.findElement(By.xpath("//select[@id='search_in']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'названии и описании')]")).click();
        driver.findElement(By.xpath("//select[@id='sort_id']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'качающим')]")).click();*/ //это простая часть, она работает

        selectOption("Сериалы", "все слова");
    }

    public static void selectOption(String listname, String option) {
        String listXpath = String.format("//option[contains(text(),'%s')]", listname);
        String optionXpath = String.format("//option[contains(text(),'%s')]", option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click(); //это более сложный вариант, пока не работает):
    }
}
