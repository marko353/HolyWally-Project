package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginButtonBy = By.xpath("/html/body/div/header/div/div[1]/a[6]");
    By emaFildBy = By.xpath("/html/body/div[1]/div/div/form/div[1]/div/input");
    By passwordFildBy = By.xpath("/html/body/div[1]/div/div/form/div[2]/div/input");
    By loginButonBy = By.xpath("/html/body/div[1]/div/div/form/div[4]/button/div");
    By errorContBy = By.xpath("/html/body/div[4]/div/div/span[1]");
    By forgButtonBy = By.xpath("/html/body/div[1]/div/div/form/div[4]/span");
    By forgotEmailFieldBy = By.xpath("/html/body/div[1]/div/div/form/div[1]/div/input");
    By sendButtonBy = By.xpath("/html/body/div[1]/div/div/form/div[2]/button/div");
    By flexContauneBy = By.xpath("/html/body/div[1]/div/div");
    By seButtonBy = By.xpath("/html/body/div[1]/div/div/form/div[2]/div/span");

    public LoginPage loginButton() {
        click(loginButtonBy);
        return this;
    }

    public LoginPage logVrongPas(String email, String password) {
        writeText(emaFildBy, password);
        writeText(passwordFildBy, password);
        click(loginButonBy);
        return this;
    }

    public LoginPage emptyMail(String expectedText) {
        String actualText = readText(errorContBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public LoginPage forgotButton() {
        click(forgButtonBy);
        return this;
    }

    public LoginPage forgotMailField(String mailText) {
        writeText(forgotEmailFieldBy, mailText);
        click(sendButtonBy);
        return this;
    }

    public LoginPage flexContauner(String expectedText) {
        String actualText = readText(flexContauneBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public LoginPage iconsee(String maiText) {
        writeText(passwordFildBy, maiText);
        click(seButtonBy);
        return this;
    }
}
