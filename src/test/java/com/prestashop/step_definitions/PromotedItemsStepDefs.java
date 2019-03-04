package com.prestashop.step_definitions;

import java.util.List;
import java.util.Map;
import com.prestashop.pages.HomePage;
import com.prestashop.pages.ItemPage;
import com.prestashop.utilities.BrowserUtils;
import com.prestashop.utilities.Driver;
import com.prestashop.utilities.ExcelUtil;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;


public class PromotedItemsStepDefs {
	
	HomePage homepage = new HomePage();
	ItemPage itemPage = new ItemPage();
	
	@Then("system should display the promoted items")
	public void system_should_display_the_promoted_items() {
		
		ExcelUtil excelObject = new ExcelUtil("src/test/resources/com/prestashop/test data/Products.xlsx", "Sheet1");
		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for(int i=0; i<dataList.size(); i++) {
			String executeFlag = dataList.get(i).get("Execute");
			
			if(executeFlag.equalsIgnoreCase("y")) {
				
				String expectedProduct = dataList.get(i).get("Product");
				assertTrue(homepage.item(expectedProduct).isDisplayed());
				
			}
		}
	
	}

	@Then("the item details should be correct")
	public void the_item_details_should_be_correct() {
		ExcelUtil excelObject = new ExcelUtil("src/test/resources/com/prestashop/test data/Products.xlsx", "Sheet1");
		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for(int i=0; i<dataList.size(); i++) {
			String executeFlag = dataList.get(i).get("Execute");
			
			if(executeFlag.equalsIgnoreCase("y")) {
				
				String expectedProduct = dataList.get(i).get("Product");
				String expectedPrice = dataList.get(i).get("Price");
				String expectedModel = dataList.get(i).get("Model");
				String expectedStyles = dataList.get(i).get("Styles");
				String expectedColor = dataList.get(i).get("Color");
				
				homepage.item(expectedProduct).click();
				BrowserUtils.waitForVisibility(itemPage.itemPrice, 5);
				
				String actualProduct = itemPage.itemName.getText();
				String actualPrice = itemPage.itemPrice.getText();
				String actualModel = itemPage.itemModel.getText();
				String actualStyles = itemPage.itemStyle.getText();
				String actualColor = itemPage.itemColor.getAttribute("name");
				
				if(expectedPrice.endsWith(".0")) {
					expectedPrice = "$" + expectedPrice + "0";
				} else {
					expectedPrice = "$" + expectedPrice;
				}
				
				assertEquals(expectedProduct, actualProduct);
				assertEquals(expectedPrice, actualPrice);
				assertEquals(expectedModel, actualModel);
				assertEquals(expectedStyles, actualStyles);
				assertEquals(expectedColor, actualColor);
				
				//write pass
				excelObject.setCellData("pass", "Status", i+1);
				
				Driver.getDriver().navigate().back();
				BrowserUtils.waitForVisibility(homepage.item(actualProduct), 5);
			
			} else {
				excelObject.setCellData("skipped", "Status", i+1);
			}
		}
	}
	
}
