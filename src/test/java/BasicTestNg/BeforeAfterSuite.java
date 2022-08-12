package BasicTestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuite {
    @BeforeSuite
    public void beforesuite(){
        System.out.println(("before suite"));
    }
@AfterSuite
    public void aftersuite(){
        System.out.println(("After suite"));
    }
}
