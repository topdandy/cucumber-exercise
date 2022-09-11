package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addToCartPage {



    // Locators
    @FindBy(how = How.XPATH, using = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    public static WebElement LoggedInPage;

    @FindBy(how = How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    public static WebElement WOMENLink;

    @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]")
    public static WebElement PrintedDress;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to cart')]")
    public static WebElement AddToCart;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    public static WebElement Message;

    @FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    public static WebElement ProceedToCheckout;

    // Methods

    public void loggedInPage(){

        LoggedInPage.isDisplayed();
    }
    public void clickontheWomenLink(){

        WOMENLink.click();
    }
    public void clickonthePrintedDress(){

        PrintedDress.click();
    }
    public void clickonAddToCart(){

        AddToCart.click();
    }
    public void seeSuccessfulMessage(){
        String ExpectedMessage = "Product successfully added to your shopping cart";
        String ActualMessage = Message.getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
    }
    public void clickonProceedtoCheckout(){
        ProceedToCheckout.click();
    }

}
