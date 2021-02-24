package Steps;

import pageobjects.BaseTest;
import pageobjects.MainPage;
import pageobjects.SignUpPage;

public class SignUp extends BaseTest {

    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    public void navigateToSignUpForm() {
        mainPage.clickSignUpLink();
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeField("11111");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.sendKeysFirstNameField("Jek");
        signUpPage.sendKeysLastNameField("London");
        signUpPage.sendKeysEmailField("JL@xxx.com");
        signUpPage.sendKeysPassword1Field("1111");
        signUpPage.sendKeysPasswordField2("1111");
        signUpPage.clickRegisterBtn();
    }

    public String checkThatConfirmationMessageAppears() {
        return signUpPage.getTextConfirmationMessage();
    }

    public String getEmail() {
        return mainPage.getEmailText();
    }

    public String getPassword() {
        return mainPage.getPasswordText();
    }
}
