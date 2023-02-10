package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEdge {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Arun");
		
		WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
		surName.sendKeys("Aravind");
		
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileNo.sendKeys("9876543210");
		
		WebElement newPass = driver.findElement(By.xpath("//input[@type='password']"));
		newPass.sendKeys("asdfgh@123");
		
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		
		s.selectByValue("12");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1 = new Select(month);
		s1.selectByIndex(11);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s2 = new Select(year);
		s2.selectByVisibleText("2007");
		
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signUp.click();
		
		
		
		
		
		
	}

}
