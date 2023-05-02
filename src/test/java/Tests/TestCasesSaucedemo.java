package Tests;
import Objects.LoginObject;
import Objects.User;
import Pages.IndexPage;
import Pages.LoginPage;
import ShareData.HooksSaucedemo;
import org.testng.annotations.Test;
public class TestCasesSaucedemo extends HooksSaucedemo {

    @Test ( testName = "LoginInvalidValid",priority = 1)
    public void metodaLoginInvalidAndValid ( ) {

        User user = new User ();
        LoginObject loginObject = new LoginObject ( testData );
        IndexPage indexPage = new IndexPage ( getDriver () );
        LoginPage loginPage = new LoginPage ( getDriver () );


        testReport.attacheReport ( "pass" , "I open a Chrome WBS and access the testing page" );
        loginPage.LoginInvalid ( loginObject );
        testReport.attacheReport ( "pass" , "I manage to validate invalid login" );
        indexPage.usernameClick ();
        testReport.attacheReport ( "pass" , "I click on the username field" );
        indexPage.usernameClear ();
        testReport.attacheReport ( "pass" , "I manage to clear the username field " );
        user.setUsername ( loginObject.getUsername () );
        indexPage.usernameElementSendUsername ( user.getUsername () );
        testReport.attacheReport ( "pass" , "I send visible text given in the TestCasesSaucedemoData.properties to the username field" );
        indexPage.passwordClick ();
        testReport.attacheReport ( "pass" , "I click on the password field" );
        indexPage.passwordClear ();
        testReport.attacheReport ( "pass" , "I manage to clear the password field " );
        user.setPassword ( loginObject.getPassword () );
        indexPage.passwordSend ( user.getPassword () );
        testReport.attacheReport ( "pass" , "I send visible text given in the TestCasesSaucedemoData.properties to the password field" );
        indexPage.loginClick ();
        testReport.attacheReport ( "pass" , "I click on the login button" );


    }


    @Test ( testName = "loginAgainAndOperationsWithProducts",priority = 2 )
    public void loginAgainAndOperationsWithProducts ( ) {
        User user2 = new User ();
        LoginObject loginObject = new LoginObject ( testData );
        IndexPage indexPage = new IndexPage ( getDriver () );
        LoginPage loginPage = new LoginPage ( getDriver () );
        testReport.attacheReport ( "pass" , "I open a Chrome WBS and access the testing page" );
        testReport.attacheReport ("pass","I do a login with true credentials");
        loginPage.LoginValid ( loginObject );
        testReport.attacheReport ("pass","The login was succesful");
        testReport.attacheReport ("pass","I click on one of the items");
        indexPage.produs1Click ();
        testReport.attacheReport ("pass","Then I add that to the shopping cart");
        indexPage.addToCartprodus1Click ();
        testReport.attacheReport ("pass","Then I click on the cart icon ,up in the right corner of the webpage");
        indexPage.cartClick ();
        testReport.attacheReport ("pass","I manage to click on the ,continueshopping, button ");
        indexPage.continueShopingBttnClick ();
        testReport.attacheReport ("pass","I schearch for more items");
        indexPage.produs2Click ();
        testReport.attacheReport ("pass","Adding more items to the cart");
        indexPage.addToCartprodus2Click ();
        testReport.attacheReport ("pass","Clicking again on the cart icon to see whats in there");
        indexPage.cartClick ();
        testReport.attacheReport ("pass","Continue the shopping");
        indexPage.continueShopingBttnClick ();
        testReport.attacheReport ("pass","Sorting the products after the price, low-/to/-high ratio");
        indexPage.sortingClick ();
        indexPage.methody ();
        testReport.attacheReport ("pass","Another item choosen and dropped in the cart");
        indexPage.produs3Click ();
        indexPage.addToCartprodus3Click ();
        testReport.attacheReport ("pass","See if the cart has those 3 items what I`ve added before");
        indexPage.cartClick ();
        testReport.attacheReport ("pass","Pressing the checkout button for finishing the process");
        indexPage.checkoutClick ();
        testReport.attacheReport ("pass","Completing the required fields with the right parameters imported from the data input file");
        testReport.attacheReport ("pass","Firstly I manage to import the first name of the user person");
        user2.setFirstName ( loginObject.getFirstName () );
        indexPage.firstnameSend ( user2.getFirstName () );
        testReport.attacheReport ("pass","Second phase is to import the last name of the user from the properties file and to complete the fields with thoose parameters");
        user2.setLastName ( loginObject.getLastName () );
        indexPage.lastNameSend ( user2.getLastName () );
        testReport.attacheReport ("pass","The same procces is required for the zip code of the user, imported and sent for the page`s field");
        user2.setZipcode ( loginObject.getZipcode () );
        indexPage.zipCodeSend ( user2.getZipcode () );
        testReport.attacheReport ("pass","validating the parameters by clicking the enter button");
        indexPage.enterClick ();
        testReport.attacheReport ("pass","My test`s last step would be to finish this persons command with the products in the cart, but I dont do this for obvious reasons");



    }
}
