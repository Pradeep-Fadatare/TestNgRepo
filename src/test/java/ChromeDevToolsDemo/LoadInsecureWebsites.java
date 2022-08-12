package ChromeDevToolsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.security.Security;
import org.testng.annotations.Test;

public class LoadInsecureWebsites {
    @Test
    public void insecurewebsiteload() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromiumDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Security.setIgnoreCertificateErrors(true));
        driver.get("https://expired.badssl.com/");
    }

}
