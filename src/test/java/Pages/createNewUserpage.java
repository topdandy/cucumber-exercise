package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class createNewUserpage {

    public int random;

    //Declare your locators here

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement HomePageSignInLink;

    @FindBy(how = How.ID_OR_NAME, using = "email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.CSS, using = "#SubmitCreate > span")
    public static WebElement CreateAccountButton;

    @FindBy(how = How.ID_OR_NAME, using = "id_gender2")
    public static WebElement FemaleGenderButton;

    @FindBy(how = How.ID_OR_NAME, using = "customer_firstname")
    public static WebElement CustomerFirstname;

    @FindBy(how = How.ID_OR_NAME, using = "customer_lastname")
    public static WebElement CustomerLastname;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement NewAccountPasssword;

    @FindBy(how = How.ID_OR_NAME, using = "days")
    public static WebElement DOBDays;

    @FindBy(how = How.ID_OR_NAME, using = "months")
    public static WebElement DOBMonths;

    @FindBy(how = How.ID_OR_NAME, using = "years")
    public static WebElement DOBYears;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement CustomerAdd;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement customerCity;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement CustomerState;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement CustomerPostCode;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement MobilePhone;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement CustomerAlias;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
    public static WebElement RegisterButton;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement NewUser;

    // Declare Your methods

    public void clickHompageSignIn() {
        HomePageSignInLink.click();
    }

    public void enterEmailForNewUser() {
        random = 100 + (int) (Math.random()* (1000-1) + 1);
        CreateNewUserEmailField.sendKeys("lanre_april" + random  + "@gmail.com");
    }

    public void clickCreateAccountButton() {
        CreateAccountButton.click();
    }

    public void clickOnFemalegender() {
        FemaleGenderButton.click();

    }
    public void enterCustomerFirstName() {
        CustomerFirstname.sendKeys("Dorice");
    }

    public void enterCustomerLastName() {
        CustomerLastname.sendKeys("Mbonde");
    }

    public void enterCustomerPassword() {
        NewAccountPasssword.sendKeys("testing");
    }

    public void selectDOBDay() {
        Select Day = new Select(DOBDays);
        Day.selectByIndex(10);

    }
    public void selectDOBMonths() {
        Select Month = new Select(DOBMonths);
        Month.selectByIndex(10);
    }

    public void selectDOBYears() {
        Select Years = new Select(DOBYears);
        Years.selectByValue("1990");
    }

    public void enterCustomerAdd() {
        CustomerAdd.sendKeys("1 fake street");
    }

    public void enterCustomerCity() {
        customerCity.sendKeys("Chicago");
    }

    public void selectCustomerState() {
        Select state = new Select(CustomerState);
        state.selectByVisibleText("Illinois");
    }

    public void enterCustomerPostcode() {
        CustomerPostCode.sendKeys("00000");
    }

    public void enterCustomerMobile() {
        MobilePhone.sendKeys("123456789");
    }
    public void enterAddAlias() {
        CustomerAlias.sendKeys("Testing house");
    }

    public void clickRegisterButton() {
        RegisterButton.click();
    }

    public void AssertNewUser() {
        String ExpectedNewUSer = "Dorice Mbonde";
        String ActualNewUser = NewUser.getText();
        Assert.assertEquals(ExpectedNewUSer, ActualNewUser);
        System.out.println(ActualNewUser);
    }



}
