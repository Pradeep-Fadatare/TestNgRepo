package NewTabOpening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newWindow {
    @Test
    public void opennewtab() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.3");
        Thread.sleep(3000);
        driver.quit();
    }
}
