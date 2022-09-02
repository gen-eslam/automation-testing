import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver","chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.wikpedia.org");
        //driver.close();
        // locators
        //id
        driver.findElement(By.id("js-link-box-en"));

        //x-path
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));





       // driver.close();
    }
}
