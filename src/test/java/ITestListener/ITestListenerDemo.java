package ITestListener;

import UtilityClass.ScreenShot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

    public class ITestListenerDemo extends ScreenShot implements ITestListener {
        @Override
        public void onTestStart(ITestResult result) {
            System.out.println("onTestStart");
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            System.out.println("onTestSuccess");

        }

        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("onTestFailure");
            try {
                screenshot();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            System.out.println("onTestSkipped");
        }

        @Override
        public void onStart(ITestContext context) {
            System.out.println("onStart");
        }

        @Override
        public void onFinish(ITestContext context) {
            System.out.println("onFinish");
        }
    }

