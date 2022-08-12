package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileOutputStream;
import java.time.Duration;

public class Paralleltest2 {
    static WebDriver driver;

    @BeforeMethod
    void launchbrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe ");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

    }

    @AfterMethod
    void closebrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }
    @Test
    void login(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

}
