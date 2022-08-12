package IlistenerScreenShotDemo;
import Common.LaunchBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends LaunchBrowser {
    @Test
    public void launchApp(){
        driver.get("https://ebay.com");
        Assert.assertTrue(false);
    }
}
