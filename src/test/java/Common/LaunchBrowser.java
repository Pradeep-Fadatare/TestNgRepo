package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchBrowser {
    public static WebDriver driver;

    @BeforeSuite
    public void laumchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe ");
        driver=new ChromeDriver();
    }

    @AfterSuite
    public void CloseeBrowser(){
        driver.close();
    }
}
