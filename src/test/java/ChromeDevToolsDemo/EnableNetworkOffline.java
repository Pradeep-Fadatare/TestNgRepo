package ChromeDevToolsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.mobile.NetworkConnection;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.openqa.selenium.devtools.v101.network.Network.loadingFailed;
import static org.openqa.selenium.devtools.v85.network.Network.emulateNetworkConditions;
import static org.testng.AssertJUnit.assertEquals;

public class EnableNetworkOffline {
    @Test(priority = 1, description = "enable network offfline")
    public void offlinechrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromiumDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.of(10000), Optional.empty(), Optional.empty()));
        devTools.send(emulateNetworkConditions(true, 100, 1000, 2000, Optional.of(ConnectionType.WIFI)));
        devTools.addListener(loadingFailed(), loadingFailled -> assertEquals(loadingFailled.getErrorText(), "NET::ERR_INTERNET_DISCONNECTED"));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("hii");
    }
}
