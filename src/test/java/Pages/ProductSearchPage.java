package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductSearchPage {
    @FindBy(how = How.NAME, using = "search_query")
    public static WebElement SearchInput;

    @FindBy(how = How.ID_OR_NAME, using = "submit_search")
    public static WebElement SearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/h1/span[2]")
    public static WebElement ConfirmMessage;

    public void enterSearchTerm(String query) {
        SearchInput.sendKeys(query);
    }

    public void clickSearchButton() {
        SearchButton.click();
    }

    public void assertSearch(String confirmation) {
        String ExpectedMessage = confirmation;
        String ActualMessage = ConfirmMessage.getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
    }
}
