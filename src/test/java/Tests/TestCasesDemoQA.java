package Tests;

import Objects.LoginObject;
import Objects.User;
import Pages.IndexPage2;
import ShareData.Hooks2;
import org.testng.annotations.Test;



public class TestCasesDemoQA extends Hooks2 {
    @Test

    public void testingMethod() throws InterruptedException {
        User user = new User ();
        LoginObject loginObject = new LoginObject ( testData );
        IndexPage2 indexPage = new IndexPage2 ( getDriver () );


        setupTheUser(user, loginObject);
         registering(user, indexPage);
        logingInUser(user, indexPage);
        productSearchingAndShippingDataInpution ( indexPage );




    }

    private void productSearchingAndShippingDataInpution ( IndexPage2 indexPage ) throws InterruptedException {
        testReport.attacheReport("pass", "Searching for a product");
        indexPage.searchClickAndSendText ( "sandal" );
        testReport.attacheReport("pass", "Clicking on the product");
        indexPage.produs1Click ();
        testReport.attacheReport("pass", "Changing the color within a dropdown");
        indexPage.colorDRPDWNclick ();
        indexPage.colorSelect ( "yellow" );
        testReport.attacheReport("pass", "Changing the size within a dropdown");
        indexPage.sizeDRPDWNclick ();
        indexPage.sizeSelect ( "38" );
        testReport.attacheReport("pass", "Adding the product to the cart");
        indexPage.addToCartClick ();
        testReport.attacheReport("pass", "Another search for an another product");
        indexPage.searchClickAndSendText ( "dress" );
        testReport.attacheReport("pass", "Clicking on that product");
        indexPage.produs2Click ();
        testReport.attacheReport("pass", "Changing the color of it using dropdown");
        indexPage.colorDRPDWNclick ();
        indexPage.colorSelect ( "white" );
        testReport.attacheReport("pass", "The same proccedure with the size, using a dropdown");
        indexPage.sizeDRPDWNclick ();
        indexPage.sizeSelect ( "small" );
        testReport.attacheReport("pass", "Adding it to the cart");
        indexPage.addToCartClick2 ();
        testReport.attacheReport("pass", "Another search for an another product" );
        indexPage.searchClickAndSendText ( "talkies" );
        indexPage.pageMethods.scrolldown ( 1000 );
        testReport.attacheReport("pass", "Same color and size adjusting using dropdowns");
        indexPage.colorDRPDWNclick2 ();
        indexPage.colorSelect2 ( "Black" );
        indexPage.sizeDRPDWNclick2 ();
        indexPage.sizeSelect2 ( "S" );
        testReport.attacheReport("pass", "Adding that item to the shopping cart");
        indexPage.addToCartClick3 ();
        testReport.attacheReport("pass", "Checking out the shopping cart");
        Thread.sleep ( 12 );
        indexPage.viewCartBttnClick ();
        indexPage.pageMethods.scrolldown ( 1350 );
        testReport.attacheReport("pass", "Clicking on the next bttn");
        indexPage.nextToBuy ();
        testReport.attacheReport("pass", "Completing the billing fields with different credentials using simple text boxes searching list type dropdowns");
        indexPage.firstNameSend ( "Reginald" );
        indexPage.lastNameSend ( "Barnington" );
        indexPage.countrySelect ();
        indexPage.adressclick ();
        indexPage.adressSend ( "Str. Noua Partida 14" );
        indexPage.citySend ( "Ploiesti" );
        indexPage.postalCodeSend ( "451784" );

        indexPage.phoneSend ( "0785415249" );
        testReport.attacheReport("pass", "Accepting the therms and conditions.");
        indexPage.termsClick ();
        testReport.attacheReport("pass", "The last bttn  is never used because it is just a test ont a testing website");
    }
    private void setupTheUser(User user, LoginObject loginObject) {
        user.setUsername(loginObject.getUsername());
        user.setEmail(loginObject.getEmail());
        user.setPassword(loginObject.getPassword());
    }
    private void logingInUser (User user, IndexPage2 indexPage1)  {
        indexPage1.helping();
        testReport.attacheReport("pass", "I redirect to the login page");

        indexPage1.accountClick2();
        testReport.attacheReport("pass", "I click on the username field to fill it with text");


        indexPage1.accountSendText(user.getUsername());
        testReport.attacheReport("pass", "I fill the username with text, with the username");


        indexPage1.passwordClickClick();
        testReport.attacheReport("pass", "I click on the password field to fill it with text");


        indexPage1.passSendText(user.getPassword());
        testReport.attacheReport("pass", "I fill the password section with text, with the password");


        indexPage1.loginClick();
        testReport.attacheReport("pass", "I click on the login button");




    }
    private void registering ( User user, IndexPage2 indexPage)  {
        indexPage.dismiss();
        testReport.attacheReport("pass", "I click on dismiss");


        indexPage.accountClick();
        testReport.attacheReport("pass", "I click on account");


        indexPage.accountClick();


        indexPage.UsernameSend(user.getUsername());
        testReport.attacheReport("pass", "I fill the username section with text");


        indexPage.emailSend(user.getEmail());

        testReport.attacheReport("pass", "I fill the email section with text");


        indexPage.passwordSend(user.getPassword());

        testReport.attacheReport("pass", "I fill the password section with text");


        indexPage.registerClisk();
        testReport.attacheReport("pass", "I click on the register button");


        indexPage.pageMethods.scrolldown(250);
        indexPage.logout();
        testReport.attacheReport("pass", "I do the logout process");

    }
}

