package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="search_query_top")
	public WebElement search;
	
	@FindBy(className="login")
	public WebElement signIn;
	
	/*
	 * takes a name of the product, builds css based on the name and locates the new
	 * product with new css and returns it
	 * @param product name
	 */
	public WebElement item(String item) {
		String css = "#center_column a.product-name[title='"+item+"']";
		return Driver.getDriver().findElement(By.cssSelector(css));
	}
	
}
