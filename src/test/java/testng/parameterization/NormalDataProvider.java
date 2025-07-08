package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    @DataProvider(name = "test-data")
    public Object[][] dataFun() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"standard_user", "sauce"},
                {"user", "secret_sauce"},
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyLogin(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
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
