package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage extends BasePage {

    public FooterPage(WebDriver driver) {
        super(driver);

    }

    By linkedinBy = By.xpath("/html/body/div/footer/div[2]/div[1]/div[2]/a/i");

    public FooterPage navLinkedin() {
        click(linkedinBy);
        return this;
    }

}
