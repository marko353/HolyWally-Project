package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);

    }

    By prodButtonBy = By.xpath("/html/body/div/header/div/div[1]/a[1]");
    By numberOfOLItemsBY = By.className("item-label");

    public ProductPage numberOfOLItems(int expectedNumber) {
        int actualNumOfItems = countItems(numberOfOLItemsBY);
        assertIntigerEquals(expectedNumber, actualNumOfItems);
        return this;
    }

    private void assertIntigerEquals(int expectedNumber, int actualNumOfItems) {
    }

    public ProductPage rproductButton() {
        click(prodButtonBy);
        return this;
    }

}
