package Com.Betway.page;

import Com.Betway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;
import java.util.List;

public class SportPage {
    public SportPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//p[@class='fc-button-label' and contains(.,'Consent')]")
    public WebElement btn_consent;

    @FindBy(css = "#idcta-username")
    public WebElement labl_signIn;

    @FindBy(xpath = "//span[contains(.,'TODAY')]")
    public WebElement labl_today;

    @FindAll({@FindBy(css = ".gs-o-list-ui__item.gs-u-pb-")})
    public List<WebElement> list_teamName;

    @FindBy(id = "orb-search-q")
    public WebElement inpBox_search;



}
