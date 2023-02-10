package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.resources.BaseClassNew;

public class TableDemo extends BaseClassNew{

	
	public static void main(String[] args) {
		browserLaunch("chrome");
		
		getUrl("https://www.w3schools.com/html/html_tables.asp");
		
		System.err.println("All data in the table");
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
		
		System.out.println(tableData);
		
		for (WebElement data : tableData) {
			String text = data.getText();
			System.out.println(text);
		}
		
		
		System.err.println("1st Column in the table");
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[1]"));
		
		for (WebElement data : column) {
			String text = data.getText();
			System.out.println(text);
		}
		
		
		System.err.println("Specific data");
		
		WebElement findElement = driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[5]/td[2]"));
		
		String text = findElement.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}
}
