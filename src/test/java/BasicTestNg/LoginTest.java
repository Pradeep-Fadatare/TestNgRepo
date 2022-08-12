package BasicTestNg;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeTest
    public void beforetest() {
        System.out.println("login");
    }

    @AfterTest
    public void aftertest() {
        System.out.println("logout");
    }

    @BeforeMethod
    public void beforemethod() {
        System.out.println("Connected to driver");
    }

    @AfterMethod
    public void aftermethod() {
        System.out.println("Disconnected to driver");
    }

    @Test
    public void blogintest() {
        System.out.println("it is login test");
        Assert.assertTrue(false);
    }


    @Test(dependsOnMethods = "blogintest",alwaysRun = true)
    public void alogouttest() {
        System.out.println("it is logout test");
    }
    @Test
    public void runtest() {
        System.out.println("it is running test");
    }

}


