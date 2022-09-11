package Step_definition;

import Base.TestBase;
import Pages.FadedSSt_shirtPage;
import Pages.createNewUserpage;
import com.gargoylesoftware.htmlunit.Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FadedSSt_shirt extends TestBase{




    @And("^I enter valid email$")
    public void iEnterValidEmail() {
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.selectEmailfield();


    }

    @And("^I enter a valid password$")
    public void iEnterAValidPassword() {
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.selectPasswordfield();
    }


    @When("^I select faded short sleeve T-shirt$")
    public void iSelectFadedShortSleeveTShirt() {
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.clickShirt();

    }

    @And("^I select all required criteria$")
    public void iSelectAllRequiredCriteria() throws InterruptedException {
        Thread.sleep(10000);
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.clickSizebox();
        page.ClickCompoBox();
        Thread.sleep(10000);
        page.ClickStylebox();
        page.ClickPropertybox();
        page.ClickAvailbox();
        page.ClickManufacturebox();
        page.ClickConditionbox();
        page.clickInstockbox();
        Thread.sleep(10000);


    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.clickAddtocartbutton();
        Thread.sleep(10000);
    }

    @And("^I click on proceed to checkout link$")
    public void iClickOnProceedToCheckoutLink() {

        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.clickCheckoutlink();
    }

    @Then("^A shirt should be added to my cart successfully$")
    public void aShirtShouldBeAddedToMyCartSuccessfully() {
        FadedSSt_shirtPage page = PageFactory.initElements(driver,FadedSSt_shirtPage.class);
        page.assertNewShirt();

    }


}
