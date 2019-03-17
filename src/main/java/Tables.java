import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));

        Table table1 = new Table(tableElement, driver);

        System.out.println("Rows number is: " + table1.getRows().size());
        System.out.println(table1.getValueFromCell1(2,3));
        System.out.println(table1.getValueFromCell2(4, "Company"));
    }
}
