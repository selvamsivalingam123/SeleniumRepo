package com.resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClassNew {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", 
						"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\msedgedriver.exe");
				
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
//		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void getTitile() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	public static void mouseOver(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public static void actions(String action , WebElement element ) {
		Actions ac= new Actions(driver);
		if (action.equalsIgnoreCase("mouseHover")) {
			 
			ac.moveToElement(element).perform();
		} else if (action.equalsIgnoreCase("contextClick")) {
			ac.contextClick(element).perform();
		}
		
	}
	
	
	public static void javaScriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	
//	public static void alert(String action, String value) {
//		if (action.equalsIgnoreCase("accept")) {
//			driver.switchTo().alert().accept();
//		}else if (action.equalsIgnoreCase("dismiss")) {
//			driver.switchTo().alert().dismiss();
//		}else if (action.equalsIgnoreCase("sendkeys")) {
//			driver.switchTo().alert().sendKeys(value);
//		}
//	}
//	
	
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alertSendkeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
}
