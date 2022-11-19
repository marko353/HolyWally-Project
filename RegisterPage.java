package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By buttonReg = By.cssSelector("button.btn");
    By emailTexBy = By.xpath("//*[@id='demo_request_email']");
    By companyNameBy = By.xpath("//*[@id='demo_request_company_name']");
    By firstNameBy = By.xpath("//*[@id='demo_request_first_name']");
    By lastNameBy = By.xpath("//*[@id='demo_request_last_name']");
    By telUsAboutBy = By.xpath("//*[@id='demo_request_message']");
    By prjectNumber = By.xpath("//*[@id='demo_request_projected_number']");
    By registerButtBy = By.xpath("/html/body/div/footer/div[3]/div[3]/form/div[2]/div/div/button[1]");

    public RegisterPage registerButton() {
        click(buttonReg);
        return this;
    }

    public RegisterPage emailField(String mailText) {
        writeText(emailTexBy, mailText);
        return this;
    }

    public RegisterPage compName(String mailText) {
        writeText(companyNameBy, mailText);
        return this;
    }

    public RegisterPage firsName(String mailText) {
        writeText(firstNameBy, mailText);
        return this;
    }

    public RegisterPage lastName(String mailText) {
        writeText(lastNameBy, mailText);
        return this;
    }

    public RegisterPage telUsAbout(String mailText) {
        writeText(telUsAboutBy, mailText);
        return this;
    }

    public RegisterPage projNum(String mailText) {
        writeText(prjectNumber, mailText);
        return this;
    }

    public RegisterPage registerButt() {
        click(registerButtBy);
        return this;
    }

}
