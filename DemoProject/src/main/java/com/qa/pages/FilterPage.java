package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterPage {

	static WebDriver driver;

	public static WebDriver SelectBrand(WebDriver driver) throws InterruptedException {
		System.out.println("Select Brand Test Starts");
		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[@id='p_89/Apple']/span/a/span")).click();
		} catch (Exception e) {
			System.out.println(" Inside catch");
			driver.findElement(By.xpath("//span[text()='iOS']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[@id='p_89/Apple']/span/a/span")).click();
		}
		return driver;

	}

	public static WebDriver setPrice(WebDriver driver) throws InterruptedException {
		System.out.println("Set Price Test Starts");
		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			driver.findElement(By.xpath("//span[contains(text(),'20,000')]")).click();
		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Set Price Test Fail");
			Assert.assertEquals("catch", "try");
		}

		return driver;

	}

	public static WebDriver SelectMemory(WebDriver driver) throws InterruptedException {
		System.out.println("Select Memory Test Starts");
		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			driver.findElement(By.xpath("//span[text()='64 GB']")).click();
		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Select Memory Test Fail");
			Assert.assertEquals("catch", "try");
		}

		return driver;

	}

	public static WebDriver SelectScreenSize(WebDriver driver) throws InterruptedException {
		System.out.println("Select Screen Size Test Starts");
		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.xpath("//li[@aria-label='5.5 Inches & Above']")).click();
		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Select Screen Test Fail");
			Assert.assertEquals("catch", "try");
		}

		return driver;

	}

}
