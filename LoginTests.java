package tests;

import org.junit.Test;

import pages.LoginPage;

public class LoginTests extends BaseTests {
    String eMailWrong = "testMail@gmail.com";
    String passwordWrong = "testiranje";
    String errorContaText = "!Invalid username or passwordCLOSE";
    String forgotMail = "testtest65@gmail.com";
    String flexText = "Success!An email has been sent to your inbox.Go back to Login";
    String seePassword = "testiranjeholiwoli333";

    @Test
    public void loginButtonClick() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.loginButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void insertWrongEmailAndPass() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.logVrongPas(eMailWrong, passwordWrong);
        loginPage.emptyMail(errorContaText);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void isertWithForgotPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.forgotButton();
        loginPage.forgotMailField(flexText);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    @Test
    public void iconsee() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.loginButton();
        loginPage.iconsee(seePassword);

    }

}
