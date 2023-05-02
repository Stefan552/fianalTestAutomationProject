package Pages;

import HelpMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class IndexPage2 extends BasePage{
    public IndexPage2 ( WebDriver driver ) {
        super ( driver );


    }
    Actions actions = new Actions ( driver );
    @FindBy(xpath = "//*[@id='color']")
    private WebElement colors2;

    @FindBy (xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[2]/div/h3/a")
    private WebElement product1;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[3]/div[2]/form/input[1]")
    private WebElement searchLine;

    @FindBy(xpath = "//*[@id='noo-site']/header/div[2]/div/div/div/a")
    private WebElement searchElement;

    @FindBy ( xpath = "//*[@id='product-704']/div[1]/div[2]/form/div/div[2]/button" )
    private WebElement addToCartBttn3;


    @FindBy ( xpath = "//*[@id='customer_login']/div[1]/form/p[3]/button" )
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

    @FindBy ( xpath = "//*[@id='noo-site']/header/div[1]/div/ul[2]/li[2]/a" )
    private WebElement account;

    @FindBy ( xpath = "/html/body/p/a" )
    private WebElement dismissBttn;

    @FindBy ( xpath = "//*[@id='color']" )
    private WebElement colorDRPDWN2;

    @FindBy ( xpath = "//*[@id='pa_color']" )//*[@id="color"]
    private WebElement colorDRPDWN;

    @FindBy ( id = "pa_color" )
    private WebElement colors;

@FindBy ( xpath = "//*[@id='pa_size']" )
private WebElement sizeDRPDWN;
    @FindBy ( xpath = "//*[@id='size']" )
    private WebElement sizeDRPDWN2;

    @FindBy ( id = "pa_size" )
    private WebElement sizes;

    @FindBy ( xpath = "//*[@id='product-1306']/div[1]/div[2]/form/div/div[2]/button" )
    private WebElement addToCartBttn;

    @FindBy(xpath = "//*[@id='product-1473']/div[1]/div[2]/form/div/div[2]/button")
    private WebElement addToCartBttn2;

    @FindBy (xpath = "//*[@id='noo-site']/div[2]/div[2]/div/div/div[1]/div/h3/a")
    private WebElement product2;

    @FindBy(id = "nav-menu-item-cart")
    private WebElement cartBtnnClick;

    @FindBy(xpath = "//*[@id='post-6']/div/div/div[2]/div[2]/div/a")
    private WebElement nexttobuy;

    @FindBy(xpath = "//*[@id='billing_first_name']")
    private WebElement billingFirstName;

    @FindBy(xpath = "//*[@id='billing_last_name']")
    private WebElement billingLastName;

    @FindBy(id = "billing_address_1")
    private WebElement billingAddress;

    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    private WebElement countrySelect;



    @FindBy(xpath = "//*[@id='billing_city']")
    private WebElement citySelect;

    @FindBy(xpath = "//*[@id='select2-billing_state-container']")
    private WebElement regiuneClick;

    @FindBy(xpath = "//*[@id='billing_address_2']")
    private WebElement oldalclick;


    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement regiuneInput;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    private WebElement postCode;

    @FindBy(id = "billing_phone")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='billing_email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id='terms']")
    private WebElement termAndConditions;

    @FindBy(xpath = "//*[@id='select2-billing_country-result-kf5k-HU']")
    private WebElement Hungary;


    public LoginPage countrySelect(){

      element.clickElement ( countrySelect );
        List<WebElement> p = driver.findElements(By.xpath("//*[@id='select2-billing_country-results']"));
        for (WebElement i:p){
            if (i.getText ().equals ( "Afghanistan" )){
                i.click ();
            }
        }
        return new LoginPage ( driver );
    }
    public LoginPage regiuneClick ( ) {
        element.clickElement ( regiuneClick );
        return new LoginPage ( driver );
    }
    public LoginPage regiuneSelect(String regiune){
        element.fillElement ( regiuneInput,regiune );
        return new LoginPage ( driver );
    }



    public LoginPage emailSend2 ( String email ) {
        element.fillElement ( emailAddress , email );
        return new LoginPage ( driver );

    }

    public LoginPage firstNameSend ( String firstname ) {
        element.fillElement (billingFirstName , firstname );
        return new LoginPage ( driver );

    }
    public LoginPage termsClick ( ) {
        element.clickElement ( termAndConditions );
        return new LoginPage ( driver );
    }

    public LoginPage lastNameSend ( String lastname ) {
        element.fillElement ( billingLastName , lastname );
        return new LoginPage ( driver );

    }
    public LoginPage adressclick ( ) {
        element.clickElement ( billingAddress );
        return new LoginPage ( driver );
    }
    public LoginPage adressSend ( String adress ) {
        element.fillElement ( billingAddress , adress );
        return new LoginPage ( driver );

    }

    public LoginPage citySend ( String cityname ) {
        element.fillElement ( citySelect , cityname );
        return new LoginPage ( driver );

    }
    public LoginPage postalCodeSend ( String postalcode ) {
        element.fillElement ( postCode , postalcode );
        return new LoginPage ( driver );

    }

    public LoginPage phoneSend ( String phoneNumer ) {
        element.fillElement ( phoneNumber , phoneNumer );
        return new LoginPage ( driver );

    }

    public LoginPage nextToBuy( ) {
        element.clickElement (nexttobuy );

        return new LoginPage ( driver );
    }

    public LoginPage viewCartBttnClick( ) {
        element.clickElement (cartBtnnClick );

        return new LoginPage ( driver );
    }

    public LoginPage colorSelect2(String colorValue){
        Select objSelect = new Select(colors2);

        objSelect.selectByValue (colorValue );
        return new LoginPage ( driver );
    }
    public LoginPage addToCartClick3 ( ) {
        element.clickElement (addToCartBttn3);

        return new LoginPage ( driver );
    }
    public LoginPage addToCartClick2 ( ) {
        element.clickElement (addToCartBttn2 );

        return new LoginPage ( driver );
    }
    public LoginPage addToCartClick ( ) {
        element.clickElement (addToCartBttn );

        return new LoginPage ( driver );
    }
    public LoginPage produs2Click ( ) {
        element.clickElement (product2 );

        return new LoginPage ( driver );
    }
    public LoginPage sizeDRPDWNclick2 ( ) {
        element.clickElement (sizeDRPDWN2 );

        return new LoginPage ( driver );
    }

    public LoginPage sizeDRPDWNclick ( ) {
        element.clickElement (sizeDRPDWN );

        return new LoginPage ( driver );
    }
    public LoginPage sizeSelect2(String sizeValue){
        Select objSelect = new Select(sizeDRPDWN2);

        objSelect.selectByValue (sizeValue );
        return new LoginPage ( driver );
    }
    public LoginPage sizeSelect(String sizeValue){
        Select objSelect = new Select(sizes);

        objSelect.selectByValue (sizeValue );
        return new LoginPage ( driver );
    }

    public LoginPage colorSelect(String colorValue){
        Select objSelect = new Select(colors);

        objSelect.selectByValue (colorValue );
        return new LoginPage ( driver );
    }
    public LoginPage colorDRPDWNclick ( ) {
        element.clickElement (colorDRPDWN );

        return new LoginPage ( driver );
    }

    public LoginPage colorDRPDWNclick2 ( ) {
        element.clickElement (colorDRPDWN2 );

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

    public LoginPage registerClisk ( ) {
        element.clickElement ( registerButton );

        return new LoginPage ( driver );
    }

    public LoginPage passwordSend ( String password ) {
        element.fillElement ( passwordElement , password );
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

    public LoginPage accountClick ( ) {
        element.clickElement ( account );

        return new LoginPage ( driver );

    }

    public LoginPage accountClick2 ( ) {
        element.clickElement ( account2 );
        return new LoginPage ( driver );
    }

    public LoginPage accountSendText ( String accountName ) {
        element.fillElement ( account2 , accountName );
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
