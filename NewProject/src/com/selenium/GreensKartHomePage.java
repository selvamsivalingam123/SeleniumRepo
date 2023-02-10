package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensKartHomePage {

	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@class='search-keyword']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement proceedToCheckout;

	public GreensKartHomePage(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	
}
