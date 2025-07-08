package testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void loginToAmazon() {
        Assert.assertTrue(false);
        System.out.println("Login To Amazon");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifySearch() {
        System.out.println("verify search");
    }

    @Test(groups = {"smoke"})
    public void addToCart() {
        System.out.println("Add to Cart");
    }
}
