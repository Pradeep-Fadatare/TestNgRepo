package RetryAnnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImp implements IRetryAnalyzer {

        private int retrycount = 0;
        private int maxretrycount = 4;

        @Override
        public boolean retry(ITestResult iTestResult) {
            if (retrycount < maxretrycount) {
                retrycount++;
                return true;
            }
            return false;
        }
    }

