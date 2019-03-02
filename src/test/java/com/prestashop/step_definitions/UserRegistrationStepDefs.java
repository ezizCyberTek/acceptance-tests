package com.prestashop.step_definitions;

import java.util.List;
import java.util.Map;

import com.github.javafaker.Faker;
import com.prestashop.beans.User;
import com.prestashop.pages.MyAccountPage;
import com.prestashop.pages.MyPersonalInformationPage;
import com.prestashop.pages.RegistrationPage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.BrowserUtils;
import cucumber.api.java.en.*;
import static org.junit.Assert.*;

public class UserRegistrationStepDefs {
	
	SigninPage signInPage = new SigninPage();
	RegistrationPage registrPage = new RegistrationPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	MyPersonalInformationPage myPersonalInfoPage = new MyPersonalInformationPage();
	
	@Given("the user enters a random email")
	public void the_user_enters_a_random_email() {
	    String emailAddress = new Faker().internet().emailAddress();
	    signInPage.signupEmail.sendKeys(emailAddress);
	    signInPage.createAccountButton.click();
	    
	    BrowserUtils.waitForVisibility(registrPage.firstName, 5);
	}

	@Given("the user enters personal information")
	public void the_user_enters_personal_information(Map<String, String> user) {
	    System.out.println(user);
	    
	    registrPage.firstName.sendKeys(user.get("First Name"));
	    registrPage.lastName.sendKeys(user.get("Last Name"));
	    registrPage.address.sendKeys(user.get("Address"));
	    registrPage.city.sendKeys(user.get("City"));
	    registrPage.company.sendKeys(user.get("Company"));
	    
	}
	
	@Given("the user enters personal info") // using custom
	public void the_user_enters_personal_info(List<User> users) {
	   for (User user : users) {
		   System.out.println(user.getFirstName());
		   System.out.println(user.getLastName());
		   System.out.println(user.getAddress());
		   System.out.println(user.getCity());
		   System.out.println(user.getCompany());
		   
		    registrPage.firstName.sendKeys(user.getFirstName());
		    registrPage.lastName.sendKeys(user.getLastName());
		    registrPage.address.sendKeys(user.getAddress());
		    registrPage.city.sendKeys(user.getAddress());
		    registrPage.company.sendKeys(user.getCompany());
	   }
	}
	
	@When("the user clicks on my personal information button")
	public void the_user_clicks_on_my_personal_information_button() {
	    myAccountPage.myPersonalInfo.click();
	    BrowserUtils.waitForVisibility(myPersonalInfoPage.firstName, 5);
	}

	//Using Map
//	@Then("the system should display the user's account information")
//	public void the_system_should_display_the_user_s_account_information(Map<String, String> userInfoMap) {
//	    System.out.println(userInfoMap);
//		String expectedFirstName = userInfoMap.get("First Name");
//		String expectedLastName = userInfoMap.get("Last Name");
//		String expectedEmail = userInfoMap.get("Email");
//		
//		String actualFirstName = myPersonalInfoPage.firstName.getAttribute("Value");
//		String actualLastName = myPersonalInfoPage.lastName.getAttribute("Value");
//		String actualEmail = myPersonalInfoPage.email.getAttribute("Value");
//		
//		assertEquals(expectedFirstName, actualFirstName);
//		assertEquals(expectedLastName, actualLastName);
//		assertEquals(expectedEmail, actualEmail);
//		
//	}
	
	@Then("the system should display the user's account information")
	public void the_system_should_display_the_user_s_account_information(List<User> userCustomType) {
	    
	    User user = userCustomType.get(0);
	    
		
		  String expectedFirstName = user.getFirstName();
		  String expectedLastName = user.getLastName();
		  String expectedEmail = user.getEmail();
		  
		  String actualFirstName = myPersonalInfoPage.firstName.getAttribute("Value");
		  String actualLastName = myPersonalInfoPage.lastName.getAttribute("Value");
		  String actualEmail = myPersonalInfoPage.email.getAttribute("Value");
		  
		  assertEquals(expectedFirstName, actualFirstName);
		  assertEquals(expectedLastName, actualLastName); 
		  assertEquals(expectedEmail,actualEmail);
		 
		
	}
	
}
