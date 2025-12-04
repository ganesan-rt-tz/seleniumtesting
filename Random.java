package Packagetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/slider");

        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Random r = new Random();
        int randomValue = r.nextInt(101);

        js.executeScript("arguments[0].value = " + randomValue + ";", slider);
        js.executeScript("arguments[0].dispatchEvent(new Event('change'));", slider);

        String currentValue = slider.getAttribute("value");

        System.out.println("Expected: " + randomValue);
        System.out.println("Actual: " + currentValue);

        if(currentValue.equals(String.valueOf(randomValue)))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        driver.quit();
    }
}
