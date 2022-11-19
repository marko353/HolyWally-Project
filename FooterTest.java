package tests;

import org.junit.Test;

import pages.FooterPage;

import pages.LoginPage;

public class FooterTest extends BaseTests {

    @Test
    public void productP() {
        LoginPage loginPage = new LoginPage(driver);
        FooterPage footerPage = new FooterPage(driver);

        loginPage.basePage();
        footerPage.navLinkedin();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
