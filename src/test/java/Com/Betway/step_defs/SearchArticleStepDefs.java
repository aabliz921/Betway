package Com.Betway.step_defs;

import Com.Betway.page.ResultPage;
import Com.Betway.page.SportPage;
import Com.Betway.utilities.BrowserUtil;
import Com.Betway.utilities.Driver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchArticleStepDefs {

    SportPage sportPage = new SportPage();
    ResultPage resultPage = new ResultPage();
    List<WebElement> resultList = new ArrayList<>();
    String firstArticle;

    @When("User should search a article about {string}")
    public void user_should_search_a_article_about(String sport) {
        sportPage.inpBox_search.sendKeys(sport, Keys.ENTER);


    }

    @Then("User should see all article")
    public void user_should_see_all_article() {
        BrowserUtil.waitFor(1);
        resultList = resultPage.list_searchResults;
        assertTrue("Verify the search result displayed", resultList.size() != 0);
        firstArticle = resultPage.lbl_firstArticle.getText();


    }

    @And("User clicks on first article")
    public void user_clicks_on_first_article() {
        BrowserUtil.waitFor(1);
        resultPage.lbl_firstArticle.click();
        assertTrue("Verify the article page", firstArticle.contains(resultPage.txt_nameOfArticle.getText()));


    }
}
