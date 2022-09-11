package Step_definition;

import Base.TestBase;
import Pages.createNewUserpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class createNewUserTest extends TestBase {
    //public WebDriver driver;
    //@Given("^I am on the home page$")
    //public void iAmOnTheHomePage() {
      //  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.navigate().to("http://automationpractice.com/index.php?");

    //}

    //@When("^I click on the sign in link$")
    //public void iClickOnTheSignInLink() {
        //createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        //page.clickHompageSignIn();

//}

    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
        createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        page.enterEmailForNewUser();

    }
    @And("^I Click the create account button$")
    public void iClickTheCreateAccountButton() {
        createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        page.clickCreateAccountButton();

        }

    @And("^I enter all required details$")
    public void iEnterAllRequiredDetails() throws InterruptedException {
        Thread.sleep(10000);
        createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        page.clickOnFemalegender();
        page.enterCustomerFirstName();
        page.enterCustomerLastName();
        page.enterCustomerPassword();
        page.selectDOBDay();
        page.selectDOBMonths();
        page.selectDOBYears();
        page.enterCustomerAdd();
        page.enterCustomerCity();
        page.selectCustomerState();
        page.enterCustomerPostcode();
        page.enterCustomerMobile();
        page.enterAddAlias();

    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        page.clickRegisterButton();

    }

    @Then("^My new account should be created successfully$")
    public void myNewAccountShouldBeCreatedSuccessfully() {
        createNewUserpage page = PageFactory.initElements(driver, createNewUserpage.class);
        page.AssertNewUser();

        driver.quit();
    }



}
