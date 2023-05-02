package Pages;

import HelpMethods.PageMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class IndexPage extends BasePage {
    @FindBy ( xpath = "//*[@id='continue']")
    private WebElement enterButton;

    @FindBy(id = "postal-code")
    private WebElement postalCode;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "checkout")
    private WebElement checkoutbttn;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement addToCartProdus3;

    @FindBy(xpath = "//*[@id='item_2_title_link']/div")
    private WebElement product3;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/div/span/select")
    private WebElement dropdownSorting;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/div/span")
    private WebElement dropdownStangaSus;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement addToCartProdus2;

    @FindBy(id = "item_5_title_link")
    private WebElement product2;


    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    private WebElement cart;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartProdus1;

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement usernameElement;

    @FindBy(xpath = "//*[@id='item_4_title_link']/div")
    private WebElement product1;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
    private WebElement searchLine;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[2]/div/div/div/a")
    private WebElement searchElement;


    @FindBy ( xpath = "//*[@id='login-button']" )
    private WebElement loginButton;

    @FindBy ( xpath = "//*[@id='password']" )
    private WebElement password;

    @FindBy ( xpath = "//*[@id='post-8']/div/div/div/p[1]/a" )
    private WebElement logout;

    @FindBy ( xpath = "//*[@id='username']" )
    private WebElement account2;

    @FindBy ( xpath = "//*[@id='customer_login']/div[2]/form/p[4]/button" )
    private WebElement registerButton;

    @FindBy ( xpath = "//*[@id='reg_password']" )
    private WebElement passwordElement;

    @FindBy ( xpath = "//*[@id='reg_email']" )
    private WebElement emailElement;

    @FindBy ( xpath = "//*[@id='reg_username']" )
    private WebElement usernameRegister;

    @FindBy ( xpath = "//*[@id='user-name']" )
    private WebElement account;

    @FindBy ( xpath = "/html/body/p/a" )
    private WebElement dismissBttn;


    public IndexPage ( WebDriver driver ) {
        super ( driver );
    }
    public LoginPage enterClick ( ) {
        element.clickElement (enterButton);

        return new LoginPage ( driver );
    }

    public LoginPage zipCodeSend( String zipCodeTxt ) {
        element.fillElement ( postalCode , zipCodeTxt );
        return new LoginPage ( driver );
    }

    public LoginPage lastNameSend( String lastnameTxt ) {
        element.fillElement ( lastName , lastnameTxt );
        return new LoginPage ( driver );
    }

    public LoginPage firstnameSend( String firstnameTxt ) {
        element.fillElement ( firstName , firstnameTxt );
        return new LoginPage ( driver );
    }

    public LoginPage checkoutClick( ) {
        element.clickElement ( checkoutbttn );

        return new LoginPage ( driver );

    }


    public LoginPage addToCartprodus3Click ( ) {
        element.clickElement (addToCartProdus3);

        return new LoginPage ( driver );
    }

    public LoginPage produs3Click ( ) {
        element.clickElement (product3);

        return new LoginPage ( driver );
    }

    public LoginPage sortingClick ( ) {
        element.clickElement (dropdownStangaSus);

        return new LoginPage ( driver );
    }
    public LoginPage methody(){
        Select objSelect = new Select(dropdownSorting);

        objSelect.selectByValue ( "lohi" );
        return new LoginPage ( driver );
    }
    public LoginPage addToCartprodus2Click ( ) {
        element.clickElement (addToCartProdus2);

        return new LoginPage ( driver );
    }

    public LoginPage produs2Click ( ) {
        element.clickElement (product2);

        return new LoginPage ( driver );
    }

    public LoginPage continueShopingBttnClick ( ) {
        element.clickElement (continueShopping );

        return new LoginPage ( driver );
    }

    public LoginPage cartClick ( ) {
        element.clickElement (cart );

        return new LoginPage ( driver );
    }
    public LoginPage addToCartprodus1Click ( ) {
        element.clickElement (addToCartProdus1 );

        return new LoginPage ( driver );
    }

    public LoginPage produs1Click ( ) {
        element.clickElement (product1 );

        return new LoginPage ( driver );
    }
    public LoginPage searchClickAndSendText(String searchText){
        element.clickElement ( searchElement );
        element.fillElement ( searchLine,searchText );
      searchLine.sendKeys ( Keys.ENTER );
        return new LoginPage ( driver );
    }

    public LoginPage passwordClick ( ) {
        element.clickElement ( password );

        return new LoginPage ( driver );
    }
    public LoginPage passwordClear ( ) {
        element.clearElement ( password );

        return new LoginPage ( driver );

    }

    public LoginPage passwordSend ( String passwordText ) {
        element.fillElement ( password , passwordText );
        return new LoginPage ( driver );
    }
    public LoginPage accountClick ( ) {
        element.clickElement ( account );

        return new LoginPage ( driver );

    }

    public LoginPage registerClisk ( ) {
        element.clickElement ( registerButton );

        return new LoginPage ( driver );
    }

    public LoginPage emailSend ( String email ) {
        element.fillElement ( emailElement , email );
        return new LoginPage ( driver );
    }

    public LoginPage UsernameSend ( String username ) {
        element.fillElement ( usernameRegister , username );
        return new LoginPage ( driver );

    }

    public LoginPage dismiss ( ) {
        element.clickElement ( dismissBttn );
        return new LoginPage ( driver );
    }

    public LoginPage usernameClick ( ) {
        element.clickElement ( usernameElement );

        return new LoginPage ( driver );

    }
    public LoginPage usernameClear ( ) {
        element.clearElement ( usernameElement );

        return new LoginPage ( driver );

    }

    public LoginPage accountClick2 ( ) {
        element.clickElement ( account2 );
        return new LoginPage ( driver );
    }

    public LoginPage usernameElementSendUsername ( String username ) {
        element.fillElement ( usernameElement , username );
        return new LoginPage ( driver );
    }

    public void helping ( ) {
        PageMethods helper = new PageMethods ( driver );
        helper.navigateToPage ( "https://shop.demoqa.com/my-account/" );

    }

    public LoginPage logout ( ) {
        element.clickElement ( logout );
        return new LoginPage ( driver );
    }

    public LoginPage passwordClickClick ( ) {
        element.clickElement ( password );

        return new LoginPage ( driver );

    }

    public LoginPage passSendText ( String passWord ) {
        element.fillElement ( password , passWord );
        return new LoginPage ( driver );
    }

    public LoginPage loginClick ( ) {
        element.clickElement ( loginButton );

        return new LoginPage ( driver );

    }


}
