package RetryAnnalyser;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//@Listeners(ITestListenerDemo.class)
public class RetryAnnalyserDemo{
 ExtentReports extentReports=new ExtentReports();
    ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("AutomationBy Pradeep.html");
    ExtentTest test;

    @BeforeTest
    public void beforetest(){
        extentReports.attachReporter(extentSparkReporter);
    }
    @AfterTest
    public void aftertest(){
        extentReports.flush();
    }

    @Test
    public void test1() {
        test= extentReports.createTest("First test").assignDevice("chrome").assignAuthor("A");
        System.out.println("testcase 1");
        Assert.assertTrue(true);
        test.pass("test passed");
    }

    @Test
    public void test2() {
        test= extentReports.createTest("Second test").assignDevice("firefox").assignAuthor("B");
        System.out.println("testcase 2");
        test.fail("test failed");
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        test= extentReports.createTest("Third test").assignDevice("edge").assignAuthor("C");
        System.out.println("testcase 3");
        test.fail("test failed");

        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "test2")
    public void test4() {
        test= extentReports.createTest("Forth test").assignDevice("IE").assignAuthor("D");

        System.out.println("testcase 4");
        test.skip("test skipped");
        Assert.assertTrue(true);
    }


}
