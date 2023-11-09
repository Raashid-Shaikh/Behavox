package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LandingPage extends TestBase{
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu-item-655']")
	WebElement NavProducts;
	
	@FindBy(xpath="//li[@id='menu-item-12802']")
	WebElement NavSolutions;
	

	@FindBy(xpath="//li[@id='menu-item-213']")
	WebElement NavCompany;
	
	@FindBy(xpath="//li[@id='menu-item-14292']")
	WebElement NavBlog;
	
	
	@FindBy(xpath="//li[@id='menu-item-878']")
	WebElement NavResources;
	

	public void navBarClick() throws InterruptedException {
		
		action.moveToElement(NavProducts);
		Thread.sleep(2000);
	
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavSolutions));
		action.moveToElement(NavSolutions);
		Thread.sleep(2000);
		
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavCompany));
		action.moveToElement(NavCompany);
		Thread.sleep(2000);
		NavCompany.click();
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavBlog));
		action.moveToElement(NavBlog);
		Thread.sleep(2000);
	
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavResources));
		action.moveToElement(NavResources);
		Thread.sleep(2000);
		
		NavResources.click();
		
		Thread.sleep(2000);
	}
}
