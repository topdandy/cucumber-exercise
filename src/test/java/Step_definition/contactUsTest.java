package Step_definition;

import Base.TestBase;
import Pages.contactUsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class contactUsTest extends TestBase {
    @When("^I click on the Contact link$")
    public void iClickOnTheContactLink() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.clickContactUsLink();
    }

    @And("^I select subject heading$")
    public void iSelectSubjectHeading() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.selectSubjectHeading();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.enterEmailAddress();
    }

    @And("^I write a message$")
    public void iWriteAMessage() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.enterMessage();
    }

    @When("^I click the send button$")
    public void iClickTheSendButton() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.clickSendMessage();
    }

    @Then("^I should get a success message$")
    public void iShouldGetASuccessMessage() {
        contactUsPage page = PageFactory.initElements(driver, contactUsPage.class);
        page.AssertSuccessMessage();

        driver.quit();
    }


}
