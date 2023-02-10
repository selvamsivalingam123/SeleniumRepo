package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/signup");

//		Thread.sleep(2000);

		driver.manage().window().fullscreen();
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2Flogin%2F%3Fprivacy_mutation_token%3DeyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcxMDgwMjQzLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%253D");
		
		
		
		
		
		
		
//		WebElement bDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		
//		
//		
//		Select s = new Select(bDay);
//		
//		s.selectByValue("23");
//		s.selectByIndex(23);
//		
//		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		

//		driver.navigate().back();
////		Thread.sleep(2000);
//		driver.navigate().forward();
////		Thread.sleep(2000);
//		driver.navigate().refresh();
////		Thread.sleep(2000);
//
//		driver.navigate().to("https://www.facebook.com/");
//
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//
//		String title = driver.getTitle();
//		System.out.println(title);
//
//		WebElement userName = driver.findElement(By.id("email"));
//		userName.sendKeys("arun@gmail.com");
//
//		Thread.sleep(2000);
//		
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("password");
//		
//		Thread.sleep(2000);
//		
//		WebElement logIn = driver.findElement(By.name("login"));
//		logIn.click();
//
//		String title2 = driver.getCurrentUrl();
//		System.out.println(title2);

	}
}
