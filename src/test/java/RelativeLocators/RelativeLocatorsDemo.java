package RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RelativeLocatorsDemo {
    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
    }
    @AfterClass
    public void close(){
    driver.close();
    }

    @Test(description = "locate 5th test")
    public void relativelocate(){
        WebElement book5=driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
        String id=book5.getAttribute("id");
        System.out.println(id);
        Assert.assertEquals("pid5",id);
    }
}
