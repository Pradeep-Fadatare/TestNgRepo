package ScreenShotElement;

import HighlightElement.ElementHighlighting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WebPageSpecificSectionSS extends ElementHighlighting {
    public static WebDriver driver;

    @BeforeMethod
    public void beforemethod(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
   // @Test
    void screenshot() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        File file=logo.getScreenshotAs(OutputType.FILE);

        File file1=new File("logo.png");
        FileUtils.copyFile(file,file1);
    }

    @Test
    public void sectionSS() throws IOException, InterruptedException {
        driver.get("https://demo.nopcommerce.com/");
        WebElement pagesection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        highlight(pagesection,driver);
        Thread.sleep(3000);
        File src=pagesection.getScreenshotAs(OutputType.FILE);
        File destfile=new File("Featureproduct.png");
        FileUtils.copyFile(src,destfile);
        Thread.sleep(3000);
        driver.close();
    }
}
