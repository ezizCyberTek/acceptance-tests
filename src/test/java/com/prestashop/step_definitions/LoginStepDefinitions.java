package com.prestashop.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.MyAccountPage;
import com.prestashop.pages.RegistrationPage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class LoginStepDefinitions {
	
	SigninPage signInPage = new SigninPage();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    new HomePage().signIn.click();
	}

	@When("I login using username {string} and password {string}")
	public void i_login_using_username_and_password(String userName, String password) {
	    
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
	
	@When("the user tries to register an invalid email")
	public void the_user_tries_to_register_an_invalid_email() {
		
		signInPage.signupEmail.sendKeys("wrongEmail");
		signInPage.createAccountButton.click();
	}

	@Then("the system should display error message {string}")
	public void the_system_should_display_error_message(String message) {
	  BrowserUtils.waitForVisibility(signInPage.invalidEmailMessage, 5);
	  String actual = signInPage.invalidEmailMessage.getText();
	  assertEquals(message, actual);
	}
	
	@When("the user tries to register a blank email")
	public void the_user_tries_to_register_a_blank_email() {
		signInPage.signupEmail.sendKeys("");
		signInPage.createAccountButton.click();
	}
	
	String email; // declaring outside of the method, so we can share it with other methods
	
	@Given("there is an existing user")
	public void there_is_an_existing_user() {
		//generate and enter a new email
		Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		email = faker.name().username() + "@gmail.com";
		String passcode = firstName+lastName;
		Address address = faker.address();
		
		signInPage.signupEmail.sendKeys(email);
		signInPage.createAccountButton.click();
		
		RegistrationPage registrPage = new RegistrationPage();
		BrowserUtils.waitForVisibility(registrPage.firstName, 5);
		
	    registrPage.firstName.sendKeys(firstName);
	    registrPage.lastName.sendKeys(lastName);
	    registrPage.password.sendKeys(passcode);
	    new Select(registrPage.days).selectByValue("5");
	    new Select(registrPage.months).selectByValue("7");
	    new Select(registrPage.years).selectByValue("2012");
	    registrPage.firstNameAddress.sendKeys(firstName);
	    registrPage.lastNameAddress.sendKeys(lastName);
	    registrPage.company.sendKeys("CTIS");
	    registrPage.address.sendKeys(address.buildingNumber() + " " + address.streetName());
	    registrPage.city.sendKeys(address.city());
	    new Select(registrPage.state).selectByValue("7");
	    registrPage.zipCode.sendKeys("15202");
	    registrPage.phone.sendKeys(faker.phoneNumber().cellPhone());
	    registrPage.submitAccount.click();
	    
	    MyAccountPage myAccountPage = new MyAccountPage();
	    BrowserUtils.waitForVisibility(myAccountPage.fullName, 5);
	    
	    assertTrue(myAccountPage.fullName.getText().contentEquals(firstName + " " + lastName));
	    myAccountPage.logOut.click();
	}

	@When("the user tries to register the same email")
	public void the_the_user_tries_to_register_the_same_email() {
		signInPage.signupEmail.sendKeys(email);
		signInPage.createAccountButton.click();
		
	}
	
}
