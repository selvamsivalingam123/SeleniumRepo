package com.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.BaseClassNew;

public class SeleniumDemo extends BaseClassNew {
	
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		browserLaunch("ChRome");
		
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		
		WebElement cucumber = driver.findElement(By.xpath("//img[@src='./images/cucumber.jpg']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(cucumber));
		
//		mouseOver(cucumber);
		
		actions("contextclick", cucumber);
		javaScriptClick(cucumber);
//		
//		Wait wait = new FluentWait(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(5))
//				.ignoring(Exception.class);
	}

}
