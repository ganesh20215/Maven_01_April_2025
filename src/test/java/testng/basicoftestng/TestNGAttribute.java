package testng.basicoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 100000, invocationTimeOut = 1)
    public void testFaruk() {
        System.out.println("Hello Faruk? How Are you??");
    }
}
