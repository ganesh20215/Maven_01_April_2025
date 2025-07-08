package testng.parameterization;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "excel-data")
    public Object[][] dataFun() throws IOException {
        Object[][] arrObj = getExcelData("D:\\classes\\TestNGDemoForMorningBatch.xlsx", "TestCases");
        return arrObj;
    }

    public Object[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePath);
        Workbook wb = WorkbookFactory.create(fp);
        Sheet sh = wb.getSheet(sheetName);

        int rows = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows-1][cols];

        for (int i = 1; i < rows; i++){
            Row r = sh.getRow(i);
            for (int j = 0; j< cols; j++){
                Cell cell = r.getCell(j);
                data[i-1][j] = cell.toString();
            }
        }
        return data;
    }

    @Test(dataProvider = "excel-data")
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
