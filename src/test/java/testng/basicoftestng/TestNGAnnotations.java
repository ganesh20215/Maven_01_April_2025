package testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    public  WebDriver driver;

    @BeforeMethod
    public void prerequisite(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testForGoogle(){
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }


    @Test
    public void testForAmazon(){
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
    }
}
