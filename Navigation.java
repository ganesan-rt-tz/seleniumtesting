package Packagetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Navigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");
        System.out.println("Home Page Title: " + driver.getTitle());

        driver.findElement(By.linkText("Projects")).click();
        System.out.println("Projects Page Title: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("After Back: " + driver.getTitle());

        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getTitle());

        driver.navigate().refresh();
        System.out.println("After Refresh: " + driver.getTitle());

        driver.quit();
    }
}
