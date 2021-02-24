import Steps.SignUp;
import org.junit.Assert;
import org.junit.Test;
import pageobjects.BaseTest;


import java.util.concurrent.ExecutionException;

public class Test1 extends BaseTest {

    SignUp su = new SignUp();

    @Test
    public void signUp() throws Exception {
        su.navigateToSignUpForm();
        su.enterZipCode();
        su.enterMainData();
        Assert.assertEquals("Account is created!", su.checkThatConfirmationMessageAppears());

        Test2 t2 = new Test2(su.getEmail(), su.getPassword());
        t2.checkLoginTest();
    }


}