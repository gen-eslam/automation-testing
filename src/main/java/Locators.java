import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikpedia.org");
        //driver.close();
        // locators
        //id // english
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-en"));
        Long end = System.currentTimeMillis();
        System.out.println("ID " + (end - start));

        //x-path // japan
        start = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        end = System.currentTimeMillis();
        System.out.println("X-path " + (end - start));

        //cssSelector
        start = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#js-link-box-ja"));
        end = System.currentTimeMillis();
        System.out.println("css selector " + (end - start));


        // driver.close();
    }
}
