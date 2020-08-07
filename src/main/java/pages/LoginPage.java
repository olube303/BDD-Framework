package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.WebDriverHelpers;

public class LoginPage extends WebDriverHelpers {

    private WebDriverHelpers webDriver;

    private By signInLink = By.xpath("//a[contains(text(),'Sign in')]");
    private By emailSignLink = By.id("email");
    private By passwordSignLink = By.id("passwd");
    private By clickOnLogin = By.xpath("//div[@id='columns']//p//span[1]");
    private By createSuccessMessage = By.xpath("//h1[contains(text(),'My account')]");

    public LoginPage(WebDriverHelpers webDriver){
        this.webDriver = webDriver;
    }

    public void clickOnSignInLink(){
        webDriver.driver.findElement(signInLink).click();
    }

    public void clickOnEmailSignLink(String email){
        webDriver.driver.findElement(emailSignLink).sendKeys(email);
    }

    public void clickOnPasswordSignLink(String password){
        webDriver.driver.findElement(passwordSignLink).sendKeys(password);
    }

    public void clickOnLoginButton() throws InterruptedException {
        webDriver.driver.findElement(clickOnLogin).click();
        Thread.sleep(2000);
    }

    public void setCreateSuccessMessage(){
        webDriver.driver.findElement(createSuccessMessage).getText();
    }

    public String currentUrl(){
        return webDriver.driver.getCurrentUrl();
    }


}
