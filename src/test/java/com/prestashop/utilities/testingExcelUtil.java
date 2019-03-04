package com.prestashop.utilities;

import java.util.List;
import java.util.Map;

public class testingExcelUtil {
	
	public static void main(String[] args) {
		ExcelUtil excelObject = new ExcelUtil("src/test/resources/com/prestashop/test data/Products.xlsx", "Sheet1");
		
		System.out.println(excelObject.columnCount());
		System.out.println(excelObject.rowCount());
		System.out.println(excelObject.getColumnsNames());
		
		String dataArray[][] = excelObject.getDataArray();
		
		for (String[] row : dataArray) {
			for (String value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		
		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for (Map<String, String> row : dataList) {
			System.out.println(row);
		}
		
		System.out.println(dataList.get(3).get("Product"));
		
		System.out.println(excelObject.getCellData(0, 0));
	}
	
}
