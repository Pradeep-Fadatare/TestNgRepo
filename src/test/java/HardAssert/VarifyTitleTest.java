package HardAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VarifyTitleTest {
    @Test(groups = "regression")
    public void verifytitle(){
        String exceptedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualtitle=driver.getTitle();
        Assert.assertEquals(exceptedtitle,actualtitle);
        driver.close();

    }
}
