package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		WebElement img = driver.findElement(By.xpath("(//a[text()='Sign in'])[1]"));
		
		String attribute = img.getAttribute("class");
		System.out.println(attribute);
		
		boolean displayed = img.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = img.isEnabled();
		System.out.println(enabled);
		
		boolean selected = img.isSelected();
		System.out.println(selected);
		
		Actions action = new Actions(driver);
		
		action.contextClick(img).perform();
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
