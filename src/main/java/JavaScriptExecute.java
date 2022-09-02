import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com/course/core-java-programming-language-tutorial/");
        WebElement signUpButton = driver.findElement(By.cssSelector("#udemy > div.main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.udlite-header.ud-app-loaded > div.udlite-text-sm.header--header--3sK1h.header--flex-middle--2Xqjv > div:nth-child(9) > a > span"));
       WebElement instructor = driver.findElement(By.cssSelector("#udemy > div.main-content-wrapper > div.main-content > div > div > div.paid-course-landing-page__container > div.paid-course-landing-page__body > div > div.component-margin.styles--instructors--2JsS3 > div > div:nth-child(2) > div.udlite-heading-lg.udlite-link-underline.instructor--instructor__title--34ItB > a"));
        //same algo
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);
        //same algo
        //Clicking with javascriptExecutor
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver ;
        javascriptExecutor.executeScript("arguments[0].click();", instructor);

        //Setting up timeout
        javascriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");
        // Changing the web page
        javascriptExecutor.executeScript("window.location ='https//:www.wikipedia.com'");
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");


        //driver.close();

    }
}
