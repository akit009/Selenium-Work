package com.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MultipleProductPage {
	public static WebDriver SearchProduct(WebDriver driver) throws Throwable {
		System.out.println("Select Product Test Starts");
		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//span[contains(text(),'(Product) RED')]")).click();

			List<WebElement> dynamicElement = driver.findElements(By.xpath("//span[contains(text(),'(Product) RED')]"));
			if (dynamicElement.size() != 0) {
				System.out.println("Element present");
				driver.findElement(By.xpath("//span[contains(text(),'(Product) RED')]")).click();
			} else {
				System.out.println("Element not present");
			}

		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Select Product Test Fail");
			Assert.assertEquals("catch", "try");
		}

		return driver;

	}

}
