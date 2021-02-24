import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipCodeInput = driver.findElement(By.name("zip_code"));

        zipCodeInput.sendKeys("12345");

        WebElement continueBtn = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        continueBtn.click();

        Thread.sleep(1000);

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstNameInput.sendKeys("vika");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastNameInput.sendKeys("vika");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("vika@example.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password1']"));
        passwordInput.sendKeys("1111");

        WebElement password2Input = driver.findElement(By.xpath("//input[@name='password2']"));
        password2Input.sendKeys("1111");

        WebElement registerBtn = driver.findElement(By.xpath("//input[@value='Register']"));
        registerBtn.click();

        Thread.sleep(1000);

        WebElement confMsg = driver.findElement(By.xpath("/html/body/center/table[@class='form_all_underline']/tbody/tr[4]/td/span[@class='confirmation_message']"));

        Assert.assertEquals("Account is created!", confMsg.getText());

        driver.close();
        driver.quit();
    }
}
