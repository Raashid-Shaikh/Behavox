package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.SearchFunctionality;

public class SearchTest extends TestBase{
	SearchFunctionality SF;
	public SearchTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		SF = new SearchFunctionality();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void searchBehavox() throws InterruptedException {
		SF.typeSearch();
		
		String expectedMessage = SF.errorCheck();
		String actualMessage = "Well, this is embarassing... We could not find any results that matched your search.";

		Assert.assertEquals(expectedMessage, actualMessage);
	}

}
