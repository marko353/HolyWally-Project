package tests;

import org.junit.Test;

import pages.HeaderPage;
import pages.LoginPage;

public class HeaderTests extends BaseTests {

    @Test
    public void productP() {
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        loginPage.basePage();
        headerPage.hederProdukt();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void useCases() {
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        loginPage.basePage();
        headerPage.hederUseCases();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ourStoryP() {
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        loginPage.basePage();
        headerPage.ourStoryPage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
