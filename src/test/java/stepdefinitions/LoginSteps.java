package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utilities.WebDriverHelpers;

public class LoginSteps {

    private WebDriverHelpers webDriverHelpers;
    private LoginPage loginPage;

    public LoginSteps(WebDriverHelpers driverHelpers){

        this.webDriverHelpers = driverHelpers;
        this.loginPage = new LoginPage(webDriverHelpers);
    }


    @Given("^I launch the automation practice on chrome browser$")
    public void loadApplication() throws Throwable {

        webDriverHelpers.driver.get("http://automationpractice.com/");
    }

    @And("^I click on sign in$")
    public void iClickOnSignIn() {
        loginPage.clickOnSignInLink();

    }


    @When("^I enter my email address \"([^\"]*)\"$")
    public void iEnterMyEmailAddress(String emailAddress) throws Throwable {
        loginPage.clickOnEmailSignLink(emailAddress);

    }


    @And("^my password successfully \"([^\"]*)\"$")
    public void myPasswordSuccessfully(String password) throws Throwable {
        loginPage.clickOnPasswordSignLink(password);

    }


    @Then("^i am successfully logged into the website$")
    public void iAmSuccessfullyLoggedIntoTheWebsite() throws Throwable {
        loginPage.clickOnLoginButton();
    }


    @And("^Account message is displayed in the home page$")
    public void accountMessageIsDisplayedInTheHomePage() {
        loginPage.setCreateSuccessMessage();
    }

}
