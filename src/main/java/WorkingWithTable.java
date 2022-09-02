import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkingWithTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.drive", "chromedrive.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // some_file >>table file.html
        driver.get("http://localhost:63342/Selenium/some_file/tablePage.html?_ijt=8t17q3gppmv0vsa6g298cf882f&_ij_reload=RELOAD_ON_SAVE");
        WebElement webElement = driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]"));
        System.out.println(webElement.getText());
        WebElement webElement2 = driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[2]"));
        System.out.println(webElement2.getText());
        WebElement webElement3 = driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]"));
        System.out.println(webElement3.getText());
        List<WebElement> webElementList = driver.findElements(By.xpath("/html/body/table/tbody[1]"));
        for (WebElement e: webElementList
             ) {
            System.out.println(e.getText());
        }
        driver.close();
    }
}