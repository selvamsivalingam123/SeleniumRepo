package com.selenium;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.BaseClassNew;

public class AutomationGreensKart extends BaseClassNew{
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		GreensKartHomePage g = new GreensKartHomePage(driver);
		GreensKartCheckoutPage c = new GreensKartCheckoutPage(driver);
		
		g.getSearchBar().sendKeys("beet");
		Thread.sleep(2000);
//		g.getAddToCart().click();
		clickOnElement(g.getAddToCart());
		Thread.sleep(2000);
		g.getCartIcon().click();
		Thread.sleep(2000);
		g.getProceedToCheckout().click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(c.getPromocode()));
		
		c.getPromocode().sendKeys("1234567");
		clickOnElement(c.getApply());
		clickOnElement(c.getPlaceOrder());
		
		
		
		
		
//		WebElement searchBar = driver.findElement(By.xpath("//input[@class='search-keyword']"));
//		
//		searchBar.sendKeys("beet");
//		
//		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//		
//		driver.findElement(By.xpath("//img[@src='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']")).click();
//		
//		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}

}
