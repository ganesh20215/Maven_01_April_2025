package testng.basicoftestng;

import org.testng.annotations.*;

public class PreSetUpMethod {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterMethod
    public void post() {
        System.out.println("After Method");
    }

    @BeforeMethod
    public void pre() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @Test
    public void testCase_1() {
        System.out.println("test case 1");
    }

    @Test
    public void testCase_2() {
        System.out.println("test case 2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
