package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test
    public void testCase_1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.edso.in");
        Assert.assertTrue(false);
        driver.close();
    }

    @Test
    public void testCase_2(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.close();
    }


    @Test
    public void testCase_3(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        driver.close();
    }

}
