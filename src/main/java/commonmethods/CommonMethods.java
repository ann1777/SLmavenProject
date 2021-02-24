package commonmethods;

import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;

public class CommonMethods extends BasePage {

    public CommonMethods(WebDriver driver){
        super(driver);
    }
    public void navigateToSite(){
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
    }
}
