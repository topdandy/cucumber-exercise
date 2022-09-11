package Step_definition;

import Base.TestBase;
import Pages.editAddressPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class editAddressTest extends TestBase {

    @And("^I enter correct username$")
    public void iEnterCorrectUsername() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.enterUsername();
    }

    @And("^I enter correct password$")
    public void iEnterCorrectPassword() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.enterPassword();
    }

    @And("^I sign in$")
    public void iSignIn() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickSignIn();
    }

    @When("^I click my addresses link$")
    public void clickMyAddressesLink() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickMyAddresses();
    }

    @And("^I click add a new address button$")
    public void iClickAddANewAddressButton() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickAddAnewAddress();
    }

    @And("^I fill the required fields$")
    public void iFillTheRequiredFields() throws InterruptedException{
        Thread.sleep(10000);
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.enterAddress();
        page.enterCity();
        page.selectState();
        page.enterPostcode();
//        page.selectCountry();
        page.enterMobilePhone();
        page.newAddressTitle();

    }



    @When("^I click save button$")
    public void iClickSaveButton() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickSave();
    }

    @Then("^My new address should be updated successfully$")
    public void myNewAddressShouldBeUpdatedSuccessfully() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.assertNewAddress();
        //driver.quit();
    }

    @And("^I input valid email$")
    public void iInputValidEmail() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.enterUsername();

    }

    @And("^I input valid password$")
    public void iInputValidPassword() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.enterPassword();
    }

    @And("^I press sign in$")
    public void iPressSignIn() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickSignIn();
    }

    @When("^I click address link$")
    public void iClickAddressLink() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickMyAddresses();
    }

    @And("^I click delete button$")
    public void iClickDeleteButton() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickDelete();
    }

    @And("^I click ok on the pop-up$")
    public void iClickOkOnThePopUp() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.clickPopUp();
    }

    @Then("^Address is deleted successfully$")
    public void addressIsDeletedSuccessfully() {
        editAddressPage page = PageFactory.initElements(driver, editAddressPage.class);
        page.assertAddressIsDeleted();

        driver.quit();
    }



}
