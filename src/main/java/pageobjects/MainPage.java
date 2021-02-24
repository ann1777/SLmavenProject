package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUp;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[3]/input")
    private WebElement login;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[1]/p/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[2]/p/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[2]/td/form/input[2]")
    private WebElement searchBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a")
    private WebElement shoppingCart;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")
    private WebElement generatedEmail;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]")
    private WebElement generatedPassword;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span")
    private WebElement name;

    public void clickLoginBtn(){
        login.click();
    }

    public void clickShoppingCart(){
        shoppingCart.click();
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public void sendKeysSearchField(String a){
        searchField.sendKeys(a);
    }

    public void sendKeysEmailField(String a){
        email.sendKeys(a);
    }

    public void sendKeysPasswordField(String a){
        password.sendKeys(a);
    }

    public void clickSignUpLink(){
        signUp.click();
    }

    public String getPasswordText(){
        return generatedPassword.getText();
    }

    public String getEmailText(){
        return generatedEmail.getText();
    }

    public String getName(){
        return name.getText();
    }

}
