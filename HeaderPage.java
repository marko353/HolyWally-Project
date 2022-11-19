package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);

    }

    By productButtonBy = By.xpath("/html/body/div/header/div/div[1]/a[1]");
    By UseCasesButtonBy = By.xpath("/html/body/div/header/div/div[1]/a[2]");
    By ourPageBy = By.xpath("/html/body/div/header/div/div[1]/a[3]");

    public HeaderPage hederProdukt() {
        click(productButtonBy);
        return this;
    }

    public HeaderPage hederUseCases() {
        click(UseCasesButtonBy);
        return this;
    }

    public HeaderPage ourStoryPage() {
        click(ourPageBy);
        return this;
    }

}
