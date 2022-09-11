package Step_definition;

import Base.TestBase;
import Pages.ChiffonDress_CheckoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ChiffonDressCheckout extends TestBase {
    @And("^I  type in  email$")
    public void iTypeInEmail() {
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.enterEmailField();


    }

    @And("^I type valid password$")
    public void iTypeValidPassword() {
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.enterPasswordField();
    }

    @And("^I click sign in$")
    public void iClickSignIn() {ChiffonDress_CheckoutPage page =PageFactory.initElements(driver,ChiffonDress_CheckoutPage.class);
page.clickSignin();
    }

    @And("^I click on Dresses link$")
    public void iClickOnDressesLink() {ChiffonDress_CheckoutPage page =PageFactory.initElements(driver,ChiffonDress_CheckoutPage.class);
   page.clickDressesLink();
    }

    @When("^I select on the Chiffon Dress$")
    public void iSelectOnTheChiffonDress() {
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.clickPrintedChiffonDress();
    }

    @And("^I select all necessary  criteria$")
    public void iSelectAllNecessaryCriteria() throws InterruptedException {
        Thread.sleep(10000);
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.clickQuantity();
        Thread.sleep(10000);
        page.clickSize();
        Thread.sleep(10000);
        page.clickColor();
        Thread.sleep(10000);
    }

    @And("^I click on the Add to Cart button$")
    public void iClickOnTheAddToCartButton() {
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.clickaddToCart();

    }
    @And("^I click Proceed to Checkout$")
    public void iClickProceedToCheckout() {ChiffonDress_CheckoutPage page =PageFactory.initElements(driver,ChiffonDress_CheckoutPage.class);
        page.clickproceedToCheckout();


    }


    @Then("^A Chiffon dress in added successfully$")
    public void aChiffonDressInAddedSuccessfully() {
        ChiffonDress_CheckoutPage page = PageFactory.initElements(driver, ChiffonDress_CheckoutPage.class);
        page.assertSummary();
    }





}
