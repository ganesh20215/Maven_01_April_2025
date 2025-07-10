package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void testDemo(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement logoElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));
        Assert.assertEquals(logoElement.getText(), "Swag Labs");
        Assert.assertTrue(loginBtn.isDisplayed());
        Assert.assertFalse(userNameTextBox.isDisplayed());
        System.out.println("Hello People");
        driver.close();
    }
}
