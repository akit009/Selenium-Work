package com.qa.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SingleProductPage {
	public static WebDriver Review(WebDriver driver) {
		System.out.println("Review Product Test Starts");

		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			String title1 = driver.getTitle();
			System.out.println(title1);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@id='acrCustomerReviewLink']//span[contains(text(),'ratings')]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select select = new Select(driver.findElement(By.xpath("//select[@data-action='a-dropdown-select']")));
			select.selectByValue("recent");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Select Product Test Fail");
			Assert.assertEquals("catch", "try");

		}
		return driver;

	}

	public static WebDriver GetReview(WebDriver driver) {
		System.out.println("Get Review Test Starts");

		try {
			System.out.println(" Inside Try");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			String title = driver.findElement(By.xpath("//a[@data-hook='review-title']//span"))
					.getAttribute("innerHTML");
			System.out.println("Review Title is :" + title);

			String review = driver
					.findElement(By.xpath("//div[@data-hook='review-collapsed']//span"))
					.getAttribute("innerHTML");
//			String review = driver.findElement(By.xpath(
//					"//div[contains(@id, 'customer_review')]//div[contains(@class, 'a-row a-spacing-small')]//span//div//div[@data-hook='review-collapsed']//span"))
//					.getText();
			System.out.println("Product Review is :" + review);

			return driver;

		} catch (Exception e) {
			System.out.println(" Inside catch");
			System.out.println("Select Product Test Fail");
			Assert.assertEquals("catch", "try");
		}
		return driver;

	}
}
