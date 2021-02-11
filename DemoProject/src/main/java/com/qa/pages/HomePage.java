package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	static WebDriver driver;

	public static WebDriver Search(WebDriver driver) throws InterruptedException {
		System.out.println("Home Page Test Starts");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		return driver;


	}

	
	
}
