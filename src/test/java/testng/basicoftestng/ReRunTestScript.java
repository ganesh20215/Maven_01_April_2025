package testng.basicoftestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunTestScript implements IRetryAnalyzer {


    private int retryCount = 0;
    private int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
