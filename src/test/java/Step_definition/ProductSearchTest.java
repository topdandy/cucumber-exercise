package Step_definition;

import Base.TestBase;
import Pages.ProductSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchTest extends TestBase {

    @Given("^I enter search term \"([^\"]*)\"$")
    public void iEnterSearchTerm(String query) throws Throwable {
        ProductSearchPage page = PageFactory.initElements(driver, ProductSearchPage.class);
        page.enterSearchTerm(query);
    }

    @And("^I click a search button$")
    public void iClickASearchButton() {
        ProductSearchPage page = PageFactory.initElements(driver, ProductSearchPage.class);
        page.clickSearchButton();
    }

    @Then("^the search should return the correct products \"([^\"]*)\"$")
    public void theSearchShouldReturnTheCorrectProducts(String confirmation) throws Throwable {
        ProductSearchPage page = PageFactory.initElements(driver, ProductSearchPage.class);
        page.assertSearch(confirmation);
    }
}
