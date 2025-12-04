package Packagetest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomT {
    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // open (Selenese: open https://example.com)
        driver.get("https://example.com");

        // type (Selenese: type id=email test@gmail.com)
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");

        // click (Selenese: click id=loginBtn)
        driver.findElement(By.id("loginBtn")).click();

        // Close browser
        driver.quit();
    }
}
