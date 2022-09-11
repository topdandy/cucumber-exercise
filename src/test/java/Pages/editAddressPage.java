package Pages;

import Base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class editAddressPage extends TestBase {


    //Declare locators
    @FindBy(how = How.ID_OR_NAME, using = "email")
    public static WebElement emailAddressTextField;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement passwordTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement signInButton;

    @FindBy(how = How.LINK_TEXT, using = "MY ADDRESSES")
    public static WebElement myAddressesLink;

    @FindBy(how = How.LINK_TEXT, using = "Add a new address")
    public static WebElement addAnewAddressLink;

    @FindBy(how = How.ID_OR_NAME, using = "address1")
    public static WebElement addressTextField;

    @FindBy(how = How.ID_OR_NAME, using = "city")
    public static WebElement cityTextField;

    @FindBy(how = How.ID_OR_NAME, using = "id_state")
    public static WebElement selectStateField;

    @FindBy(how = How.ID_OR_NAME, using = "postcode")
    public static WebElement postcodeTextField;

    @FindBy(how = How.ID_OR_NAME, using = "phone_mobile")
    public static WebElement mobilePhoneTextField;

    @FindBy(how = How.ID_OR_NAME, using = "alias")
    public static WebElement addressTitleField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"submitAddress\"]/span")
    public static WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[1]")
    public static WebElement oldAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[1]")
    public static WebElement newAddress;

    @FindBy(how = How.LINK_TEXT, using = "Delete")
    public static WebElement deleteButton;

    //Declare methods
    public void enterUsername() {
        emailAddressTextField.sendKeys("oluwaseyeomowa@hotmail.com");
    }

    public void enterPassword() {
        passwordTextField.sendKeys("BugsTesters");
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickMyAddresses() {
        myAddressesLink.click();

    }

    public void clickAddAnewAddress() {
        addAnewAddressLink.click();

    }

    public void enterAddress() {
        addressTextField.sendKeys("310 Mill Rd");
    }

    public void enterCity() {
        cityTextField.sendKeys("Falmouth");
    }

    public void selectState() {
        Select State = new Select(selectStateField);
        State.selectByVisibleText("Massachusetts");

    }

    public void enterPostcode() {
        postcodeTextField.sendKeys("02540");
    }


    public void enterMobilePhone() {
        mobilePhoneTextField.sendKeys("(508) 457-5065");
    }

    public void newAddressTitle() {
        addressTitleField.clear();
        random = 100 + (int) (Math.random() * (1000 - 1) + 1);
        addressTitleField.sendKeys("My address" + " " + random);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void assertNewAddress() {
        String expectedAddress = newAddress.getText();
        String actualAddress = oldAddress.getText();
        Assert.assertEquals(expectedAddress, actualAddress);
        System.out.println(actualAddress);

    }

    public void clickDelete() {

        deleteButton.click();

    }

    public void clickPopUp() {
//        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();



    }

    public void assertAddressIsDeleted() {
        String expectedAddress = oldAddress.getText();
        String actualAddress = newAddress.getText();
        Assert.assertEquals(expectedAddress, actualAddress);
        System.out.println(actualAddress);

    }

}
