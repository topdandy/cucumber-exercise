package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class myWishListPage {

    //Declare your locators here

    @FindBy(how = How.ID_OR_NAME, using = "email")
    public static WebElement ValidEmail;

    @FindBy(how = How.ID_OR_NAME, using = "passwd")
    public static WebElement ValidPassword;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
    public static WebElement SignInLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"my-account\"]")
    public static WebElement MyAccount;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
    public static WebElement MyWishList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mywishlist\"]/h1")
    public static WebElement SelectionPage;

    @FindBy(how = How.LINK_TEXT, using = "Blouse")
    public static WebElement SelectDress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
    public static WebElement ChangeQuantity;

    @FindBy(how = How.ID_OR_NAME, using = "group_1")
    public static WebElement ChangeSize;

    @FindBy(how = How.ID_OR_NAME, using = "add_to_cart")
    public static WebElement AddItemsToCart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement ProceedToCheckout;

    @FindBy(how = How.ID_OR_NAME, using = "total_price_container")
    public static WebElement TotalPrice;

    // Declare your methods

    public void insertValidEmail() {ValidEmail.sendKeys("Downtown_Abbey3@gmail.com");}

    public void insertValidPassword() {ValidPassword.sendKeys("April");}

    public void clickTheSignInLink() {SignInLink.click();}

    public void clickOnMyAccount() {MyAccount.getText();}

    public void clickOnMyWishList() {MyWishList.click();}

    public void navigatedToSelectionPage() {SelectionPage.isDisplayed();}

    public void makeSelection() {SelectDress.click();}

    public void chooseDressQuantity() {ChangeQuantity.click();}

    public void chooseDressSize() {
            Select group_1 = new Select(ChangeSize);
            group_1.selectByIndex(2);
    }
    public void clickAddToCart() {AddItemsToCart.click();}

    public void clickOnCheckout() {ProceedToCheckout.click();}

    public void AssertTotalPrice() {

        String ExpectedPrice = "$56.00";
        String ActualPrice = TotalPrice.getText();
        Assert.assertEquals(ExpectedPrice, ActualPrice);
        System.out.println(ActualPrice);
    }

}

