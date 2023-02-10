package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

//		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		driver.switchTo().frame("singleframe");

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello World");

//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(firstFrame);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]")));
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		text.sendKeys("Hello world");
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single If')]")).click();
	}

}
 	