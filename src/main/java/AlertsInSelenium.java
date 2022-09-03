import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class AlertsInSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:63342/Selenium/some_file/alerts.html?_ijt=p30ps9sr91tdi6n7ohbe19odrg");
        WebElement basicAlertButton =driver.findElement(By.cssSelector("body > button:nth-child(2)"));
        WebElement confirmationAlertButton =driver.findElement(By.cssSelector("body > button:nth-child(5)"));
        WebElement promptAlertButton =driver.findElement(By.cssSelector("body > button:nth-child(8)"));
        basicAlertButton.click();
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert basicAlert =driver.switchTo().alert();
        basicAlert.accept();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        confirmationAlertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.dismiss();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        promptAlertButton.click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("fares");
        promptAlert.accept();





    }
}
