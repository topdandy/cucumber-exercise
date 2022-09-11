package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static Base.TestBase.driver;

public class FadedSSt_shirtPage {


    @FindBy(how = How.LINK_TEXT,using = "Sign in")
    public static WebElement HomepageSIGNinLink;

    @FindBy(how = How.ID_OR_NAME,using = "email")
    public static WebElement ValidEmailField;

    @FindBy(how = How.ID_OR_NAME,using = "passwd")
    public static WebElement ValidPasswordField;

    @FindBy(how = How.XPATH,using = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public static WebElement TshirtsLink;

    @FindBy(how = How.XPATH,using = "//*[@id=\"uniform-layered_id_attribute_group_1\"]/span")
    public static WebElement SizeBox;


    @FindBy(how = How.ID_OR_NAME,using = "layered_id_feature_5")
    public static WebElement CompositionBox;

    @FindBy(how = How.XPATH,using = "//*[@id=\"layered_id_feature_11\"]")
    public static WebElement StyleBox;

    @FindBy(how = How.ID_OR_NAME,using = "layered_id_feature_17")
    public static WebElement PropertiesBox;

    @FindBy(how = How.XPATH,using = "//*[@id=\"layered_quantity_1\"]")
    public static WebElement AvailableBox;

    @FindBy(how = How.ID_OR_NAME,using = "layered_manufacturer_1")
    public static WebElement ManufactureBox;

    @FindBy(how = How.ID_OR_NAME,using = "layered_condition_new")
    public static WebElement ConditionBox;

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span")
    public static WebElement InStockButton;


    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
    public static WebElement AddtoCartButton;

    @FindBy(how = How.XPATH,using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement CheckoutLink;

    @FindBy(how = How.XPATH,using = "//*[@id=\"cart_title\"]/span")
    public static WebElement NewTshirtAdded;





    //public void homescreenLogin(){
       // HomepageSIGNinLink.click();
    //}

    public void selectEmailfield(){
        ValidEmailField.sendKeys("ugwunna0589@gamil.com");
    }

    public void selectPasswordfield(){
        ValidPasswordField.sendKeys("chisco3434");
    }

    public void clickShirt(){
        TshirtsLink.click();
    }

    public void clickSizebox(){
        SizeBox.click();
    }


    public void ClickCompoBox(){
        CompositionBox.click();
    }

    public void ClickStylebox(){
        StyleBox.click();
    }


    public void ClickPropertybox(){
        PropertiesBox.click();
    }

    public void ClickAvailbox(){
        AvailableBox.click();
    }

    public void ClickManufacturebox(){
        ManufactureBox.click();
    }

    public void ClickConditionbox(){
        ConditionBox.click();
    }

    public void clickInstockbox(){
        InStockButton.click();
    }


    public void clickAddtocartbutton(){
        AddtoCartButton.click();
    }

    public void clickCheckoutlink(){
        CheckoutLink.click();
    }

    public void assertNewShirt(){
        String ExpectedNewMessage = "Your shopping cart contains: 1 Product";
        String ActualNewMessage = NewTshirtAdded.getText();
        Assert.assertEquals(ActualNewMessage,ExpectedNewMessage);
        System.out.println(ActualNewMessage);
    }


    }


