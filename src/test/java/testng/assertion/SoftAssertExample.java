package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void testCases_1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement logoElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        WebElement userNameTextBox = driver.findElement(By.id("user-name"));

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(logoElement.getText(), "Swag Labs");
        sf.assertTrue(loginBtn.isDisplayed());
        sf.assertFalse(userNameTextBox.isDisplayed());
        System.out.println("Hello People");
        sf.assertAll();
        driver.close();
    }
}
