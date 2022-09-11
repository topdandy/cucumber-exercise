package Step_definition;

import Base.TestBase;
import Pages.addToCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class addToCart extends TestBase {
    @Given("^I am on the logged in page$")
    public void iAmOnTheLoggedInPage() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.loggedInPage();
    }

    @And("^I click on the WOMEN link$")
    public void iClickOnTheWOMENLink() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.clickontheWomenLink();
    }

    @And("^I click on the Printed Dress without orange skirt$")
    public void iClickOnThePrintedDressWithoutOrangeSkirt() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.clickonthePrintedDress();
    }

    @When("^I click on Add To Cart$")
    public void iClickOnAddToCart() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.clickonAddToCart();
    }

    @Then("^I should see a successful message$")
    public void iShouldSeeASuccessfulMessage() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.seeSuccessfulMessage();
    }

    @And("^I click on proceed to checkout$")
    public void iClickOnProceedToCheckout() {
        addToCartPage page = PageFactory.initElements(driver, addToCartPage.class);
        page.clickonProceedtoCheckout();

        driver.quit();
    }


}
