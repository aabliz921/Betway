package Com.Betway.page;

import Com.Betway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "user-identifier-input")
    public WebElement inpBox_userName;

    @FindBy(id = "password-input")
    public WebElement inpBox_password;

    @FindBy(id = "submit-button")
    public WebElement bnt_signIn;

    @FindBy(xpath = "(//p[@*='form-message__text'])")
    public WebElement txt_errorMassage;
}
