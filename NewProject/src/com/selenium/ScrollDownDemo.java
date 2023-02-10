package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.resources.BaseClass;

public class ScrollDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\msedgedriver.exe");
//
//		WebDriver driver = new EdgeDriver();
//
//		driver.get("https://www.amazon.in/");
		
		browserLaunch("Chrome");
		
		getUrl("https://www.amazon.in/");
		getCurrentTitle();
		
		dragAndDrop(null, null);
		

//		driver.manage().window().maximize();

		WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", logo);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		
		 js.executeScript("arguments[0].click();",signIn);
		 
		 
	}

}
