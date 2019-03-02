package com.prestashop.step_definitions;

import com.prestashop.pages.HomePage;
import com.prestashop.pages.ItemPage;

import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductInformationUsingListsMapsStepDefs {
	
	HomePage homePage = new HomePage();
	ItemPage itemPage = new ItemPage();
	
	@Then("the user should see {string}")
	public void the_user_should_see(String productName) {
	    assertTrue(homePage.item(productName).isDisplayed());
	}
	
	@Then("the user should see following products")
	public void the_user_should_see_following_products(List<String> products) {
	   for (String string : products) {
		   System.out.println(string);
		   assertTrue(homePage.item(string).isDisplayed());
	   }
	}
	
	//Using Lists
	@Then("the product should be available in the following sizes:")
	public void the_product_should_be_available_in_the_following_sizes(List<String> sizes) {
	   
		for (String expectedSize : sizes) {
			System.out.println(expectedSize);
		}
	    
		//getting drop down values to 'actualList' List
	    List<String> actualList = new ArrayList<String>();
	    for (WebElement optionElement : itemPage.size().getOptions()) { //getOptions - returns all options that belong to drop down
	    	actualList.add(optionElement.getText()); // adding all drop down values
		}
	    
	    //comparing 2 lists
	    assertEquals(sizes, actualList);
	    
	}
	
	//using Maps
	@Then("the system should display the product information:")
	public void the_system_should_display_the_product_information(Map<String, String> product) {
	   
		String expectedName = product.get("name");
		assertEquals(expectedName, itemPage.itemName.getText());
		
	    String expectedCount = product.get("count");
	    assertEquals(expectedCount, itemPage.itemCount.getAttribute("value"));
	    
	    String expectedCondition = product.get("condition");
	    assertEquals(expectedCondition, itemPage.itemCondition.getText());
	    
	    String expectedSize = product.get("size");
	    assertEquals(expectedSize, itemPage.size().getFirstSelectedOption().getText());
	    
	    String expectedPrice = product.get("price");
	    assertEquals(expectedPrice, itemPage.itemPrice.getText());
	    
	    
	    
	}
	
}
