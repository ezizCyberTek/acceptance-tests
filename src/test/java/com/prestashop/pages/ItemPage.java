package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.prestashop.utilities.Driver;

public class ItemPage {
	
	public ItemPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(tagName="h1")
	public WebElement itemName;
	
	@FindBy(id="quantity_wanted")
	public WebElement itemCount;
	
	@FindBy(className="icon-plus")
	public WebElement plus;
	
	@FindBy(className="icon-minus")
	public WebElement minus;
	
	@FindBy(css = "#product_condition>.editable")
	public WebElement itemCondition;
	
	@FindBy(css = "#product_reference>.editable")
	public WebElement itemModel;
	
	@FindBy(id = "our_price_display")
	public WebElement itemPrice;
	
	@FindBy(xpath = "//tr[@class='even']/td[2]")
	public WebElement itemStyle;
	
	@FindBy(xpath = "//a[@class='color_pick selected']")
	public WebElement itemColor;
	
	//returns new select object
	public Select size() {
		return new Select(Driver.getDriver().findElement(By.id("group_1")));
	}
}
