package com.prestashop.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.prestashop.utilities.ConfigurationReader;
import com.prestashop.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks {
	
	@Before
	public void setUp() {	
		Driver.getDriver().manage().window().fullscreen();
	    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@After 
	public void tearDown(Scenario scenario) {
		//only takes screenshot if the scenario fails
		if(scenario.isFailed()) {
			//taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			//adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		
		Driver.closeDriver();
	}
	
	@Before("@amazon_check")
	public void setUpAmazon() {
		Driver.getDriver().manage().window().fullscreen();
	    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Driver.getDriver().get("https://amazon.com");
	}
}
