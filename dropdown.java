package Packagetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class dropdown{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.findElement(By.name("my-text")).sendKeys("Santosh");
        driver.findElement(By.name("my-password")).sendKeys("12345");
        driver.findElement(By.name("my-textarea")).sendKeys("This is a test");
        
        WebElement dropdown = driver.findElement(By.name("my-select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Two");

        driver.findElement(By.id("my-check-1")).click();
        driver.findElement(By.id("my-radio-2")).click();

        driver.findElement(By.cssSelector("button")).click();

        System.out.println(driver.findElement(By.id("message")).getText());
        
       }
}
