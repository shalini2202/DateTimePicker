package com.dateTimePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTimePicker {
	
	@Test
	public void dateNTime() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		driver.manage().window().maximize();
		
		WebElement date = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		
		Thread.sleep(2000);
		
		date.sendKeys("22022018");
		date.sendKeys(Keys.TAB);
		date.sendKeys("1135PM");
		
		System.out.println("date fill successfully");
		
		WebElement actual = driver.findElement(By.xpath("//div[@style='font-size:15px;margin-left:50px;']"));
		Assert.assertTrue(actual.equals("22021992"));
		System.out.println("successful validation");
		
		
	}

}
