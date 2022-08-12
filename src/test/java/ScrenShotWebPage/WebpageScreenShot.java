package ScrenShotWebPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WebpageScreenShot {

    @Test
    public void setUp() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://thecgf.com/results/games/3052");

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File src=takesScreenshot.getScreenshotAs(OutputType.FILE);

        File file=new File("Homepage.png");
        FileUtils.copyFile(src,file);
        Thread.sleep(3000);
        driver.close();
    }
}
