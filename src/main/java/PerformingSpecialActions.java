import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PerformingSpecialActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
         driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
        WebElement droppable = driver.findElement(By.id("droppable"));
        WebElement draggable = driver.findElement(By.id("draggable"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(draggable,droppable).build().perform();

        Actions contextClick = new Actions(driver);
        contextClick.contextClick().build().perform();

        Actions actionObj = new Actions(driver);
        actionObj.keyDown(Keys.F1).build().perform();

    }
}
