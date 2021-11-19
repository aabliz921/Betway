package Com.Betway.step_defs;

import Com.Betway.page.SportPage;
import Com.Betway.utilities.BrowserUtil;
import Com.Betway.utilities.ConfigurationReader;
import Com.Betway.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DisplayTeamNameStepDefs {

    SportPage sportPage = new SportPage();
    List<WebElement> matchList = new ArrayList<>();

    @Given("navigate to BBC sport page")
    public void navigate_to_bbc_sport_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        sportPage.btn_consent.click();
        BrowserUtil.waitFor(1);

    }

    @Given("User should able to see today's matches")
    public void user_should_able_to_see_todays_matches() {
       assertTrue(sportPage.labl_today.isDisplayed());
        sportPage.labl_today.click();
        BrowserUtil.waitFor(1);

    }

    @And("Verify the team names on the screen")
    public void verify_the_team_names_on_the_screen() {
        matchList = sportPage.list_teamName;
       assertTrue("Verify the today's matches are displayed",matchList.size()>0);

        if (matchList.size() == 0) {
            System.out.println("There are not matchs today");
        } else {
            System.out.println("There are " + matchList.size() + " matchs today");
        }

        for (int i = 0; i < matchList.size(); i++) {

            System.out.println(matchList.get(i).getText());
            System.out.println(" ");
        }


    }


}
