package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    final WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_login")
    public WebElement Login;

    @FindBy(id = "user_password")
    public WebElement Password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement SingInButton;
}
