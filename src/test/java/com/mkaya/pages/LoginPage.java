package com.mkaya.pages;

import com.mkaya.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "#prependedInput")
    public WebElement username;

    @FindBy(css = "input[id=prependedInput2]")
    public WebElement password;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement submit;

//    public void login(String username, String password) {
//        usernameBox.sendKeys(username);
//        passwordBox.sendKeys(password);
//        submit.click();
//
//        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
//        wait.until(ExpectedConditions.titleIs("Dashboard"));
//
//    }

    public void login(String usernameStr, String passwordStr){
        username.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
//        password.sendKeys(passwordStr + Keys.ENTER);
        submit.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        wait.until(ExpectedConditions.titleIs("Dashboard"));

    }
}
