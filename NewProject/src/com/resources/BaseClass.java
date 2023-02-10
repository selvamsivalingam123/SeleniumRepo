package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver ;
	
	public static WebDriver browserLaunch(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();


//			driver.manage().window().maximize();
			return driver;
			
		} else if (browserName.equalsIgnoreCase("edge")) {
			
		
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\msedgedriver.exe");
			
			driver = new EdgeDriver();
			
			driver.manage().window().maximize();

		}
		return driver;
		
		
	}
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	public static void getCurrentTitle() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(	currentUrl);
	}

	public static void dragAndDrop(WebElement source1,WebElement target2) {
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(source1, target2);
		
	}
	
}
