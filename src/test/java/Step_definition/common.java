package Step_definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class common extends TestBase {
    //public WebDriver driver;

    @Before
    public void setup() throws IOException {
        initialize();

    }






    @Given("^I am on the landing screen$")
    public void iAmOnTheLandingScreen() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        //System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.navigate().to("http://automationpractice.com/index.php?");
    }

    @And("^I select the signin link$")
    public void iSelectTheSigninLink() {
        driver. findElement(By.linkText("Sign in")).click();
    }
}
