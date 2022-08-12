package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Paralleltest1 {

    static WebDriver driver;

    @BeforeMethod
    void launchbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe ");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

    }

    @AfterMethod
    void closebrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    void logotest() {
        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());

    }
    @Test
    void homepage(){
       Assert.assertEquals( driver.getTitle(),"OrangeHRM");
    }


}
