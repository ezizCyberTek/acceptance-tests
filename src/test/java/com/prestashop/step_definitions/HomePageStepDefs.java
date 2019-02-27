package com.prestashop.step_definitions;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.SigninPage;
import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import cucumber.api.java.en.*;

public class HomePageStepDefs {
	
	String title;
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	    System.out.println("Open the home page");
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    Driver.getDriver().manage().window().fullscreen();
	    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("the user enters a search term")
	public void the_user_enters_a_search_term() {
	   System.out.println("Enter search term: France national team t shirt");
	   HomePage homePage = new HomePage();
	   homePage.search.sendKeys("t shirt");
	}

	@Then("the search box should contain the search term")
	public void the_search_box_should_contain_the_search_term() {
	   System.out.println("Verifying search term");
	   HomePage homePage = new HomePage();
	   String actual = homePage.search.getAttribute("value");
	   assertEquals("t shirt", actual);
	   //Driver.getDriver().close();
	}
	
	@When("the user gets the title of the page")
	public void the_user_gets_the_title_of_the_page() {
	    title = Driver.getDriver().getTitle();
	}

	@Then("title should be Search - My Store")
	public void title_should_be_Search_My_Store() {
	    assertEquals("My Store", title);
	}
	
	@When("the user clicks on Sign in link")
	public void the_user_clicks_on_Sign_in_link() {
	    HomePage homePage = new HomePage();
	    homePage.signIn.click();
	}

	@Then("username and password fields should be displayed")
	public void username_and_password_fields_should_be_displayed() {
	   SigninPage  signinPage = new SigninPage();
	   
	   assertTrue(signinPage.loginEmail.isDisplayed());
	   assertTrue(signinPage.pasword.isDisplayed());
	   
	}
	
}
