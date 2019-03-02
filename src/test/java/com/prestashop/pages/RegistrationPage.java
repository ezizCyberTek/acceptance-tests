package com.prestashop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prestashop.utilities.Driver;

public class RegistrationPage {
	
	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "id_gender1")
	public WebElement title;
	
	@FindBy(id = "customer_firstname")
	public WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	public WebElement lastName;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(id = "days")
	public WebElement days;
	
	@FindBy(id = "months")
	public WebElement months;
	
	@FindBy(id = "years")
	public WebElement years;
	
	@FindBy(id = "firstname")
	public WebElement firstNameAddress;
	
	@FindBy(id = "lastname")
	public WebElement lastNameAddress;
	
	@FindBy(id = "company")
	public WebElement company;
	
	@FindBy(id = "address1")
	public WebElement address;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(id = "id_state")
	public WebElement state;
	
	@FindBy(id = "postcode")
	public WebElement zipCode;
	
	@FindBy(id = "phone_mobile")
	public WebElement phone;
	
	@FindBy(id = "alias")
	public WebElement aliasAddress;
	
	@FindBy(id = "submitAccount")
	public WebElement submitAccount;
	
}
