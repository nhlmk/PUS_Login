package com.popUpSmart.stepDefinitions;

import com.popUpSmart.pages.BasePage;
import com.popUpSmart.pages.LoginPage;
import com.popUpSmart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefs {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is on the home page of application")
    public void userIsOnTheHomePageOfApplication() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Popupsmart"));
    }

    @When("user clicks the signin link from the top right corner")
    public void userClicksTheSigninLinkFromTheTopRightCorner() {
        basePage.signinLink.click();
    }

    @When("user enters below {string} and {string}")
    public void userEntersBelowAnd(String arg0, String arg1) {
        wait.until(ExpectedConditions.visibilityOf(loginPage.loginButton));
        loginPage.nameInput.sendKeys(arg0);
        loginPage.passwordInput.sendKeys(arg1);
    }

    @And("user clicks Login button")
    public void userClicksLogInButton() {
        loginPage.loginButton.click();
    }

    @Then("user should see the dashboard page")
    public void userShouldSeeTheDashboardPage() {
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("//a[@href='/dashboard']"))));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @Then("user should see the error message - This field is required")
    public void userShouldSeeTheErrorMessageThisFieldIsRequired() {
        loginPage.requiredField.isDisplayed();
    }

    @Then("user should see the error message - Incorrect email or password")
    public void userShouldSeeTheErrorMessageIncorrectEmailOrPassword() {
        loginPage.incorrectData.isDisplayed();
    }


}
