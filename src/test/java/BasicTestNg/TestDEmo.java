package BasicTestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestDEmo implements IRetryAnalyzer {


    @Override
    public boolean retry(ITestResult iTestResult) {
        int retry=0;
        int maxretry=3;
        if (retry<maxretry){
            retry++;
            return true;
        }
        return false;
    }
}
