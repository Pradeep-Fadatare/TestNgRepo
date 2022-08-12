package ChromeDevToolsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.log.Log;
import org.testng.annotations.Test;

public class GenerateConsoleLog {
    @Test(priority = 1,description = "get console logs")
    public void consolelog(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            DevTools devTools = ((ChromiumDriver) driver).getDevTools();
            devTools.createSession();
            devTools.send(Log.enable());
//            devTools.addListener(Log.entryAdded(), entry -> System.out.println(entry.asSeleniumLogEntry()));
//            devTools.addListener(org.openqa.selenium.bidi.log.Log.entryAdded()

    }
}
