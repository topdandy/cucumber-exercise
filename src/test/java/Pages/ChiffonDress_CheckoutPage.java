package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ChiffonDress_CheckoutPage {

    public WebDriver driver;

    @FindBy(how = How.ID_OR_NAME, using = "email")
    public static WebElement EmailField;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement PasswordField;

    @FindBy(how = How.XPATH,using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement Signin;

    @FindBy(how = How.LINK_TEXT, using = "DRESSES")
    public static WebElement DressesLink;

    @FindBy(how = How.LINK_TEXT, using = "Printed Chiffon Dress")
    public static WebElement PrintedChiffonDress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
    public static WebElement Quantity;

    @FindBy(how = How.ID_OR_NAME, using = "group_1")
    public static WebElement Size;

    @FindBy(how = How.NAME, using = "Green")
    public static WebElement Color;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement proceedToCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_title\"]/span")
    public static WebElement Summary;


    public void enterEmailField() {
        EmailField.sendKeys("lanre.ikuesan@gmail.com ");
    }

    public void enterPasswordField() {
        PasswordField.sendKeys("testing");
    }

    public void clickSignin() {Signin.click();}

    public void clickDressesLink() {
        DressesLink.click();
    }

    public void clickPrintedChiffonDress() {
        PrintedChiffonDress.click();
    }

    public void clickQuantity() {
        Quantity.click();
    }

    public void clickSize() {
        Select smallSize = new Select(Size);
        smallSize.selectByIndex(1);

        Select mediumSize = new Select(Size);
         mediumSize.selectByIndex(2);

        //Select largeSize = new Select(Size);
        //largeSize.selectByIndex(3);

    }

    public void clickColor() {

        Color.click();
    }

    public void clickaddToCart() {
        addToCart.click();
    }

    public void clickproceedToCheckout() {
            proceedToCheckout.click();
    }

    public void assertSummary() {
        String ExpectedNewMessage = "Your shopping cart contains: 2 Products";
        String ActualNewMessage = Summary.getText();
        Assert.assertEquals(ActualNewMessage, ExpectedNewMessage);
        System.out.println(ActualNewMessage);


    }


}
