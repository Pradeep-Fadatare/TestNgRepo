package ITestListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ItestListener1.class)
public class ListenersTest {

    @Test
    void Test1(){
        System.out.println("Test1 Passed");
        Assert.assertEquals(3,3);
    }

    @Test
    void Test2(){
        System.out.println("Test2 Failed");
        Assert.assertEquals("a","b");

    }
    @Test
    void Test3(){
        System.out.println("Test3 Skipped");
        throw new SkipException("This is Skip Exception");
    }



}
