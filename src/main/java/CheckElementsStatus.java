import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckElementsStatus {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); //браузер открывается в большом окне

        driver.get("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");

        WebElement button = driver.findElement(By.xpath("//p//a[@title='Button Object Reference'][contains(text(),'❮ Button Object')]"));
        System.out.println(button.isEnabled()); //проверяем, доступна ли кнопка

        if (button.isEnabled()) button.click();

        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html");

        WebElement radio1 = driver.findElement(By.xpath("//form[@name='agreementFormjdk-11.0.1-oth-JPR']//input[1]"));
        WebElement radio2 = driver.findElement(By.xpath("//form[@name='agreementFormjdk-11.0.1-oth-JPR']//input[2]"));

        System.out.println("Radiobutton2 is selected: " + radio2.isSelected());
        if (!radio1.isSelected()) radio1.click();

        driver.get("https://www.ebay.com/");

        WebElement link1 = driver.findElement(By.xpath("//a[contains(text(),'Электроника')]"));
        WebElement link2 = driver.findElement(By.xpath("//a[contains(text(),'iPhone')]"));

        if (link1.isDisplayed()) link1.click();
        else link2.click();

    }
}
