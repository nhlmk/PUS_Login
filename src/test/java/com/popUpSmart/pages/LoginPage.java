package com.popUpSmart.pages;

import com.popUpSmart.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement nameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(className = "app-components-ErrorBubble-___style__ErrorBubble___35Mgo")
    public WebElement requiredField;

    @FindBy(xpath = "//div[.='Incorrect email or password.']")
    public WebElement incorrectData;


}
