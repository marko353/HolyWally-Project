package tests;

import org.junit.Test;

import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTests {

    int expectedNumOLItems = 20;

    @Test
    public void productP() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.basePage();
        productPage.rproductButton();
        productPage.numberOfOLItems(expectedNumOLItems);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
