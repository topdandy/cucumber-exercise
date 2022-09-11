package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class contactUsPage {
    @FindBy(how = How.ID, using = "contact-link")
    public static WebElement ContactUsLink;

    @FindBy(how = How.ID_OR_NAME, using = "id_contact")
    public static WebElement SubjectHeading;

    @FindBy(how = How.ID, using = "email")
    public static WebElement EmailAddress;

    @FindBy(how = How.ID_OR_NAME, using = "message")
    public static WebElement Message;

    @FindBy(how = How.ID_OR_NAME, using = "submitMessage")
    public static WebElement SendMessage;

    @FindBy(how =  How.XPATH, using = "//*[@id=\"center_column\"]/p")
    public static WebElement SuccessMessage;


    public void clickContactUsLink() {
        ContactUsLink.click();
    }

    public void selectSubjectHeading() {
        Select Subject = new Select(SubjectHeading);
        Subject.selectByIndex(1);
    }

    public void enterEmailAddress() {
        EmailAddress.sendKeys("ugochukwuuzoh@gmail.com");
    }

    public void enterMessage() {
        Message.sendKeys("Message");
    }

    public void clickSendMessage() {
        SendMessage.click();
    }

    public void AssertSuccessMessage() {
        String ExpectedSuccessMessage = "Your message has been successfully sent to our team.";
        String ActualSuccessMessage = SuccessMessage.getText();
        Assert.assertEquals(ExpectedSuccessMessage, ActualSuccessMessage);
        System.out.println(ActualSuccessMessage);
    }

}
