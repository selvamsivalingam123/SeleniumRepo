package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(prime);
		
//		ac.click();
//		
		Thread.sleep(3000);
		ac.contextClick().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement singleDropdown = driver.findElement(By.id("option"));
//		
//		
//	
//		Select s = new Select(singleDropdown);
//		
//		
//		List<WebElement> options = s.getOptions();
//		
//		System.out.println(options);
//		
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(3000);
//		s.selectByIndex(1);
//		Thread.sleep(3000);
//		s.selectByValue("option 2");
//		Thread.sleep(3000);
//		s.selectByVisibleText("Option 3");
//		Thread.sleep(3000);
//		s.deselectByVisibleText("Option 3");
//		s.deselectAll();
		
		
		
//		WebElement multiple = driver.findElement(By.id("owc"));
//		Select s = new Select(multiple);
//		Thread.sleep(3000);
//		s.selectByValue("option 2");
//		Thread.sleep(3000);
//		s.selectByIndex(1);
//		Thread.sleep(3000);
//		s.selectByVisibleText("Option 3");
//		Thread.sleep(3000);
////		s.deselectByValue("Option 3");
//		s.deselectAll();
		
		
	}

}
