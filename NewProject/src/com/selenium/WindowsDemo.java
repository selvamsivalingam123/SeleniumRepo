package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.resources.BaseClassNew;

public class WindowsDemo extends BaseClassNew{

	public static void main(String[] args) throws Exception {
		
		browserLaunch("chrome");
		
		getUrl("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(mobiles).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todayDeals = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
		
		
		ac.contextClick(todayDeals).perform();
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//get window handle
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		String parentTitle = driver.getTitle();
		
		System.out.println(parentTitle);
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		
		//get window handles
		
		Set<String> allwindow = driver.getWindowHandles(); //random order
		
		ArrayList<String> a = new ArrayList<>(allwindow);  //insertion order
		
		Thread.sleep(2000);
		String title = driver.switchTo().window(a.get(1)).getTitle();
		
		System.out.println(title);
		Thread.sleep(2000);
		String title2 = driver.switchTo().window(a.get(2)).getTitle();
		System.out.println(title2);
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
