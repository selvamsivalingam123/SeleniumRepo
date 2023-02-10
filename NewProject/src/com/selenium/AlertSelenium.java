package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.BaseClassNew;

public class AlertSelenium extends BaseClassNew {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@name='alertbox']"));
		
		simpleAlert.click();
	
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		alertAccept();
		Thread.sleep(2000);
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmAlert.click();
		
		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().accept();
//		alertAccept();
		alertDismiss();
		
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myFunctionThree()']"));
		promptAlert.click();
		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Yes");
		alertSendkeys("Hello");
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		alertAccept();
	}

}
