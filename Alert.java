package Packagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class Alert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        Actions act = new Actions(driver);

        //
        driver.get("https://demoqa.com/menu");
        WebElement hover = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        act.moveToElement(hover).perform();

        driver.get("https://demoqa.com/buttons");
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightClick).perform();

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(doubleClick).perform();

        driver.get("https://demoqa.com/droppable");
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement tgt = driver.findElement(By.id("droppable"));
        act.dragAndDrop(src, tgt).perform();

        driver.get("https://demoqa.com/slider");
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        act.clickAndHold(slider).moveByOffset(99, 0).release().perform();

        driver.get("https://demoqa.com/text-box");
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Ganesan");

        username.sendKeys(Keys.TAB);
        username.sendKeys(Keys.ENTER);

        username.sendKeys(Keys.CONTROL + "a");
        username.sendKeys(Keys.CONTROL + "c");
        username.sendKeys(Keys.CONTROL + "v");

        username.sendKeys(Keys.ARROW_DOWN);
        username.sendKeys(Keys.ARROW_UP);

        System.out.println("SUCESS");    }
}
