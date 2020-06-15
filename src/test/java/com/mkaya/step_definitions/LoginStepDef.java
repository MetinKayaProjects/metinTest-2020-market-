package com.mkaya.step_definitions;

import com.mkaya.pages.LoginPage;
import com.mkaya.utilities.ConfigurationReader;
import com.mkaya.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("user is at the home page")
    public void user_is_at_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

//    @When("user login as a <{string}>")
//    public void user_login_as_a(String driver) {
//        LoginPage loginPage = new LoginPage();
//        String username = ConfigurationReader.get("driver_username");
//        String password = ConfigurationReader.get("driver_password");
//        loginPage.login(username, password);
//    }

    @When("user login as a {string}")
    public void user_login_as_a(String driver) throws InterruptedException {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
Thread.sleep(5000);
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.submit.click();
       // loginPage.login(username, password);
    }

    @Then("user should be able to see the dashboard page")
    public void user_should_be_able_to_see_the_dashboard_page() {
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
