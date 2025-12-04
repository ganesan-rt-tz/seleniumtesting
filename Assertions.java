package Packagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // assertTitle
        String title = driver.getTitle();
        System.out.println(title.equals("Web form") ? "Title OK" : "Title Not OK");

        // type
        driver.findElement(By.id("my-text-id")).sendKeys("Hello");

        // assertValue
        String val = driver.findElement(By.id("my-text-id")).getAttribute("value");
        System.out.println(val.equals("Hello") ? "Value OK" : "Value Not OK");

        // assertElementPresent
        boolean present = driver.findElements(By.cssSelector("input[type='submit']")).size() > 0;
        System.out.println(present ? "Submit Present" : "Submit Missing");

        driver.quit();
    }
}
