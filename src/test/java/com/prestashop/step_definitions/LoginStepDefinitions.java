package com.prestashop.step_definitions;

import java.util.concurrent.TimeUnit;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.MyAccountPage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class LoginStepDefinitions {
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    
	    new HomePage().signIn.click();
	}

	@When("I login using username {string} and password {string}")
	public void i_login_using_username_and_password(String userName, String password) {
	    SigninPage signInPage = new SigninPage();
	    signInPage.loginEmail.sendKeys(userName);
	    signInPage.pasword.sendKeys(password);
	    signInPage.submitLogin.click();
	}

	@Then("user's full name {string} {string} should be displayed")
	public void user_s_full_name_should_be_displayed(String firstName, String userLastName) {
	    String expected = firstName + " " + userLastName;
	    String actual = new MyAccountPage().fullName.getText();
	    assertEquals(expected, actual);
	}
	
}
