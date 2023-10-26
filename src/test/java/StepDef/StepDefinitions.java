package StepDef;

import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {


    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());


    @Given("User Navigates To Zero Bank")
    public void user_navigates_to_zero_bank() {
        driver.getDriver().get(Config.getProperty("url"));
    }
    @When("User Enters Login as {string}")
    public void user_enters_login_as(String username) {
        loginPage.Login.sendKeys(username);
    }
    @When("User Enters Password as {string}")
    public void user_enters_password_as(String password) {
        loginPage.Password.sendKeys(password);
    }
    @When("User Clicks Sing In Button")
    public void user_clicks_sing_in_button() {
        loginPage.SingInButton.click();
        driver.getDriver().navigate().back();
    }
    @Then("User Should Into To Zero Bank Home Page")
    public void user_should_into_to_zero_bank_home_page() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("title"));

        driver.driverClose();
    }
}
