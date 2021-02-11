package firstAssignment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.Browser;
import com.qa.pages.FilterPage;
import com.qa.pages.HomePage;
import com.qa.pages.MultipleProductPage;
import com.qa.pages.SingleProductPage;

public class AmazonTest {
	static WebDriver driver;

	@BeforeTest

	public void openBrowserTest() throws InterruptedException {
		driver = Browser.Chrome(driver);
	}

	@Test(priority = 1)

	public void homePageTest() throws InterruptedException {
		driver = HomePage.Search(driver);
	}

	@Test(priority = 2)
	public void selectBrandTest() throws InterruptedException {
		driver = FilterPage.SelectBrand(driver);
	}

	@Test(priority = 3)
	public void setPriceTest() throws InterruptedException {
		driver = FilterPage.setPrice(driver);
	}

	@Test(priority = 4)
	public void selectMemoryTest() throws InterruptedException {
		driver = FilterPage.SelectMemory(driver);
	}

	@Test(priority = 5)
	public void selectScreenTest() throws InterruptedException {
		driver = FilterPage.SelectScreenSize(driver);
	}

	@Test(priority = 6)
	public void selectProductTest() throws Throwable {
		driver = MultipleProductPage.SearchProduct(driver);
	}

	@Test(priority = 7)
	public void selectReviewTest() {
		driver = SingleProductPage.Review(driver);
	}

	@Test(priority = 8)
	public void getReviewTest() {
		driver = SingleProductPage.GetReview(driver);
	}
	
	@AfterTest
	
	public void closebrowser() {
		driver.quit();
	}

}
