package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStep {

    private WebDriverManager Webdrivermanager;
    WebDriver driver = Webdrivermanager.chromedriver().create();

    LoginPage loginPage;

    public LoginStep() {
        this.loginPage= new LoginPage();
    }
    @Given("open the url Website soucedemo")
    public void openTheUrlWebsiteSoucedemo() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @And("user input Username with {string}")
    public void userInputUsernameWith(String username) {
        By usernameInputText = By.cssSelector("input#user-name");
        driver.findElement(usernameInputText).sendKeys("standard_user");
    }
    @Then("user input Password with {string}")
    public void userInputPasswordWith(String password) {
        By passwordInputText = By.xpath("//*[@id=\"password\"]");
        driver.findElement(passwordInputText).sendKeys("secret_sauce");
    }

    @Then("user click LOGIN button")
    public void userClickLOGINButton() {
        By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();
    }

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    @And("Username blank")
    public void usernameBlank() {
    }

    @Then("there is message error \"Epic sadface: Username is required'")
    public void thereIsMessageErrorEpicSadfaceUsernameIsRequired(String UsernameIsRequired) {
        assertTrue(driver.getPageSource().contains(UsernameIsRequired));// Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}
