package Step_definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidLoginTest extends TestBase {


    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String email) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email);

    }

    @And("^I type \"([^\"]*)\"$")
    public void iType(String password) throws Throwable {
        driver.findElement(By.name("passwd")).sendKeys(password);
    }

    @When("^I select the login button$")
    public void iSelectTheLoginButton() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I should get the right \"([^\"]*)\"$")
    public void iShouldGetTheRight(String errormessage) throws Throwable {
        String ExpectedErrorMessage = errormessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

        driver.quit();

    }


}
