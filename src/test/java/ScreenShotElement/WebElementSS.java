package ScreenShotElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WebElementSS {
    public static WebDriver driver;

    @BeforeMethod
    public void beforemethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void elelmentSS() throws IOException, InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
        highlight(element,driver);
        Thread.sleep(3000);
        File src = element.getScreenshotAs(OutputType.FILE);
        File destfile = new File("new.png");
        FileUtils.copyFile(src, destfile);
        Thread.sleep(3000);
        driver.close();
    }

    public void highlight(WebElement ele, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.boarder='2px solid red'",ele);
    }
}
