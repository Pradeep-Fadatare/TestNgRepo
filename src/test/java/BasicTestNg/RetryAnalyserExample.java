package BasicTestNg;

import RetryAnnalyser.RetryAnalyserImp;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class RetryAnalyserExample{

    @Test
    public void test1(){
        System.out.println("test 1");
        Assert.assertTrue(false);
    }
}
