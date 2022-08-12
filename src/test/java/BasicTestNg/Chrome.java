package BasicTestNg;

import Common.LaunchBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Chrome extends LaunchBrowser {

    @Test
    public void intobrowser(){
        driver.get("https://www.facebook.com");
        Assert.assertTrue(false);
    }
}
