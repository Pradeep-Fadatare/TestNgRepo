package SoftAsser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
        @Test
        public void verifytitle(){
            SoftAssert softAssert=new SoftAssert();
            String exceptedtitle="Electronics, Cars,vbFashion, Collectibles & More | eBay";
            String expectedtext="Buy";
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.ebay.com/");
            String actualtitle=driver.getTitle();
            softAssert.assertEquals(actualtitle,exceptedtitle);
            String actualtext=driver.findElement(By.xpath("//a[@class='gf-bttl thrd'][1]")).getText();
            Assert.assertEquals(actualtext,expectedtext,"Test Varification Failed");
            driver.close();


        }

        public static class BeforeAfterSuite {

            @BeforeSuite
            public void datasetup(){
                System.out.println("common data setup");
            }
            @AfterSuite
            public void datateardown(){
                System.out.println("common data cleanup");
            }
        }
    }
