package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void setUp(String browserName) {
        if (browserName.equals("chome")) {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com/");
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
    }

    @Parameters({"username", "password"})
    @Test
    public void verifyLogin(String username, String password) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
