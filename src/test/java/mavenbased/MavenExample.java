package mavenbased;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.edso.in");
        driver.manage().window().maximize();
        driver.close();
    }
}
