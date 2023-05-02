package Pages;


import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy ( xpath = "//*[@id='password']" )
    private WebElement password;

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement usernameElement;
    @FindBy ( xpath = "//*[@id='login-button']" )
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='login_button_container']/div/form/div[3]/h3")
    private WebElement error;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void LoginInvalid(LoginObject loginObject){

        element.fillElement(usernameElement, loginObject.getUsernameInvalid());

        element.fillElement(password, loginObject.getPassword());
        element.clickElement(loginButton);
        element.validateElementText(error, loginObject.getMessage());




    }

    public void LoginValid(LoginObject loginObject){

        element.fillElement(usernameElement, loginObject.getUsername ());

        element.fillElement(password, loginObject.getPassword());
        element.clickElement(loginButton);




    }



}
