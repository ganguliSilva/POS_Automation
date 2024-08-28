package org.posAutomation.tests;

import org.posAutomation.functions.Webby;
import org.posAutomation.pages.BasePage;

public class BaseFunctions extends BasePage {

    //@BeforeMethod
    public void setup() throws InterruptedException {
        new BasePage();
    }

    //@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    //@Test
    public void login(){
        Webby.setText(loginPage.usernameField, "admin");
        Webby.setText(loginPage.passwordField, "pointofsale");
        Webby.click(loginPage.loginButton);
    }


}
