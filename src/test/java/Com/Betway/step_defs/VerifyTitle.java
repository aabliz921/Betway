package Com.Betway.step_defs;

import Com.Betway.utilities.*;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class VerifyTitle {

    @Given("^User on the (.*) screen$")
    public void validationOfPage(String expectedPageTitle) {
        String url = Driver.get().getCurrentUrl();
        System.out.println("Home Page: " + url);

        String actualPageTitle = Driver.get().getTitle();
        System.out.println("The page title is: " + actualPageTitle);
        BrowserUtil.waitFor(1);
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }
}
