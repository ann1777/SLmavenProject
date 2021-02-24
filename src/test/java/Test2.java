import org.junit.Test;
import pageobjects.BaseTest;
import pageobjects.MainPage;

public class Test2 extends BaseTest {
    private String email;
    private String password;

    MainPage mainPage = new MainPage(getDriver());

    public Test2(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Test
    public void checkLoginTest() throws Exception {
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        mainPage.sendKeysEmailField(email);
        mainPage.sendKeysPasswordField(password);

        mainPage.clickLoginBtn();

        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        Thread.sleep(2000);

        System.out.println(mainPage.getName());
    }
}
