package com.popUpSmart.pages;

import com.popUpSmart.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
