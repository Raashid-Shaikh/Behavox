package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class SearchFunctionality extends TestBase{
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	
	@FindBy(xpath="//li[@id='menu-item-10443']")
	WebElement searchIcon;
	
	@FindBy(xpath="//input[@class='search-field']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='no-search-results']")
	WebElement error;
	
	public SearchFunctionality() {
		PageFactory.initElements(driver, this);
	}
	

	public void typeSearch() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("Artificial Inteligence");
        new Actions(driver)
        .keyDown(Keys.ENTER)
        .perform();
        Thread.sleep(2000);
       
      
        
	}
	
	public String errorCheck() {
		  String G = error.getText();
	        System.out.println(G);
	        return G;
	}

}
