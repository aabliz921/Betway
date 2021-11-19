package Com.Betway.step_defs;

import Com.Betway.page.SportPage;
import Com.Betway.page.LoginPage;
import Com.Betway.utilities.BrowserUtil;
import Com.Betway.utilities.ConfigurationReader;
import Com.Betway.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class LoginStepDefs {
    SportPage sportPage = new SportPage();
    LoginPage loginPage = new LoginPage();
    String error;

    @Given("Navigate BBC home page")
    public void navigate_bbc_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        sportPage.btn_consent.click();
        BrowserUtil.waitFor(1);

    }

    @Then("Select {string} button")
    public void select_button(String string) {
        assertTrue(sportPage.labl_signIn.isDisplayed());
        sportPage.labl_signIn.click();
        BrowserUtil.waitFor(1);
    }

    @When("User input userName {string}")
    public void user_input_user_name(String userName) {
        BrowserUtil.waitFor(1);
        assertTrue(loginPage.inpBox_userName.isEnabled());
        loginPage.inpBox_password.sendKeys(userName);
    }

    @Then("User input password {string}")
    public void user_input_password(String password) {
        BrowserUtil.waitFor(1);
        assertTrue(loginPage.inpBox_password.isEnabled());
        loginPage.inpBox_password.sendKeys(password);
    }

    @Then("User Clicks signIn button")
    public void user_clicks_sign_in_button() {
        assertTrue(loginPage.bnt_signIn.isDisplayed());
        loginPage.bnt_signIn.click();
    }

    @Then("Screen display error massage {string}")
    public void screen_display_error_massage(String errorMSG) {
        error = loginPage.txt_errorMassage.getText();
        assertEquals("Verify the error massage", error, errorMSG);


    }

}
