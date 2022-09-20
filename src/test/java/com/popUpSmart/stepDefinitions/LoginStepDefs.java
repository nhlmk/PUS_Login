package com.popUpSmart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("user is on the login page of the application")
    public void userIsOnTheLoginPageOfTheApplication() {
    }

    @When("user enters below {string} and {string}")
    public void userEntersBelowAnd(String arg0, String arg1) {
    }

    @And("user clicks Login button")
    public void userClicksLogInButton() {
    }

    @Then("user should see the dashboard page")
    public void userShouldSeeTheDashboardPage() {
    }

    @Then("user should see the error message - This field is required")
    public void userShouldSeeTheErrorMessageThisFieldIsRequired() {
    }

    @Then("user should see the error message - Incorrect email or password")
    public void userShouldSeeTheErrorMessageIncorrectEmailOrPassword() {
    }

    @Given("user is on the home page of application")
    public void userIsOnTheHomePageOfApplication() {
    }

    @When("user clicks the signin link from the top right corner")
    public void userClicksTheSigninLinkFromTheTopRightCorner() {
    }
}
