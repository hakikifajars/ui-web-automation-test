package uiauto.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import uiauto.pages.InventoryPage;
import uiauto.pages.LoginPage;
import uiauto.utilities.DriverManager;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Given("user opens SauceDemo login page")
    public void userOpensSauceDemoLoginPage() {
        loginPage.openLoginPage();
    }

    @When("user inputs username {string}")
    public void userInputsUsername(String username) {
        loginPage.inputUsername(username);
    }

    @When("user inputs password {string}")
    public void userInputsPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be redirected to inventory page")
    public void userShouldBeRedirectedToInventoryPage() {
        String actualTitle = inventoryPage.getPageTitle();

        Assert.assertEquals("Products", actualTitle);
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        String actualErrorMessage = loginPage.getErrorMessage();

        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"));
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}