package BasicTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchBrowserFromTestNg {
    public static WebDriver driver;

    @Parameters({"browser"})
    @Test
    public void launchApplication(String browser){

        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        }
        else if (browser.equals("chrome1")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
        }


        driver.close();
    }
}
