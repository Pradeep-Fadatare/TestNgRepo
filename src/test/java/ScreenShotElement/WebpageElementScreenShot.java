package ScreenShotElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WebpageElementScreenShot {
    @Test
    void screenshot() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        File file=logo.getScreenshotAs(OutputType.FILE);

        File file1=new File("logo.png");
        FileUtils.copyFile(file,file1);

    }
}
