package tests;

import org.junit.Test;

import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {
    String eMailField = "testmail435@gmail.com";
    String comName = "TestingDOO";
    String name = "Marko";
    String lastName = "Markovic";
    String telUsMore = "automatskotestiranjesoftvera";
    String projectNuber = "1000";

    @Test
    public void loginButtonClick() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        loginPage.basePage();
        registerPage.registerButton();
        registerPage.emailField(eMailField);
        registerPage.compName(comName);
        registerPage.firsName(name);
        registerPage.lastName(lastName);
        registerPage.telUsAbout(telUsMore);
        registerPage.projNum(projectNuber);
        registerPage.registerButt();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
