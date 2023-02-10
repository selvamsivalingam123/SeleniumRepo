package com.selenium;

import org.openqa.selenium.By;

import com.resources.BaseClassNew;

public class CssSelectorDemo extends BaseClassNew {
	
	public static void main(String[] args) {
		
		browserLaunch("edge");
		getUrl("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Aravind");
		
		driver.findElement(By.cssSelector("[data-testid^='royal_p']")).sendKeys("password");
		
//		driver.findElement(By.cssSelector("[name='login']")).click();
		
		driver.findElement(By.cssSelector("[data-testid*='registration-for']")).click();
	}

}
