package Step_definition;

import Base.TestBase;
import Pages.contactUsPage;
import Pages.myWishListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class myWishList extends TestBase {
    @And("^I insert valid email$")
    public void iInsertValidEmail() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.insertValidEmail();  
    }
    
    @And("^I insert valid password$")
    public void iInsertValidPassword() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.insertValidPassword();

    }
    
    @And("^I click the sign-in link$")
    public void iClickTheSignInLink() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.clickTheSignInLink();
     
    }
    
    @When("^I click on my account$")
    public void iClickOnMyAccount() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.clickOnMyAccount();

    }

    @And("^I click on my wish list$")
    public void iClickOnMyWishList() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.clickOnMyWishList();

    }
    
    @Then("^I should be able navigated to selection page$")
    public void iShouldBeAbleNavigatedToSelectionPage() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.navigatedToSelectionPage();
     
    }
    
    @And("^I should be able select, change size and quantity$")
    public void iShouldBeAbleSelectChangeSizeAndQuantity() throws InterruptedException {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.makeSelection();
        page.chooseDressQuantity();
        page.chooseDressSize();

    }

    @When("^I click the add to cart$")
    public void iClickTheAddToCart() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.clickAddToCart();

    }

    @And("^I click on proceed to checkout$")
    public void iClickOnProceedToCheckout() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.clickOnCheckout();
    }

    @Then("^I should be able to see total price$")
    public void iShouldBeAbleToSeeTotalPrice() {
        myWishListPage page = PageFactory.initElements(driver, myWishListPage.class);
        page.AssertTotalPrice();

        driver.quit();
    }

}
