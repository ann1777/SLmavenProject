package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{
    private WebDriver driver;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCode;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement continueBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement firstName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastName;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement password1;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement password2;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement registerBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement confirmationMessage;


    public SignUpPage(WebDriver driver) {
       super(driver);
    }

    public void sendKeysZipCodeField(String a) {
        zipCode.sendKeys(a);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public void sendKeysFirstNameField(String a) {
        firstName.sendKeys(a);
    }

    public void sendKeysLastNameField(String a) {
        lastName.sendKeys(a);
    }

    public void sendKeysEmailField(String a) {
        email.sendKeys(a);
    }

    public void sendKeysPassword1Field(String a) {
        password1.sendKeys(a);
    }

    public void sendKeysPasswordField2(String a) {
        password2.sendKeys(a);
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }
    public String getTextConfirmationMessage(){
       return confirmationMessage.getText();
    }
}





