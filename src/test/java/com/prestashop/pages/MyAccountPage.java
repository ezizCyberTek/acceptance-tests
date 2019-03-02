package com.prestashop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class MyAccountPage {
	
	public MyAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	public WebElement fullName;
	
	@FindBy(className = "logout")
	public WebElement logOut;
	
	@FindBy(xpath="//a[@title='Information']")
	public WebElement myPersonalInfo;
	
}
