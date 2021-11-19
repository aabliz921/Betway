package Com.Betway.page;

import Com.Betway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage {

    public ResultPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindAll({
            @FindBy(xpath ="//div[@class='ssrcss-dirbxo-PromoSwitchLayoutAtBreakpoints e3z3r3u0']")
    })
    public List<WebElement> list_searchResults;
    //@FindBy(xpath = "//a[@class='ssrcss-bxvqns-PromoLink e1f5wbog0']")


    @FindBy(xpath = "//span[@role='text']/..")
    public WebElement lbl_firstArticle;

    @FindBy(css = ".no-margin")
    public WebElement txt_nameOfArticle;




}
