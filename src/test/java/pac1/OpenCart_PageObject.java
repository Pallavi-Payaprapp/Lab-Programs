package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenCart_PageObject {
	WebDriver driver;
	
	public OpenCart_PageObject(WebDriver driver2) { 
		this.driver=driver2;
	}
	
	By DesktopTab=By.linkText("Desktops");
	By Mac=By.linkText("Mac (1)");
	By sort=By.id("input-sort");
	By AddToCart=By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]");
	By Search=By.name("search");
	By SearchButton=By.xpath("//div[@id='search']//button");
	By  SearchCheck=By.name("description");
	
	public void clickDesktop() {
		driver.findElement(DesktopTab).click();
		
	}
	public void clickMac() {
		driver.findElement(Mac).click();
	}
	public void sortByDropdown() {
		Select sle=new Select(driver.findElement(sort));
		sle.selectByVisibleText("Name (A - Z)");
		
	}
	public void clickAddCart() {
		driver.findElement(AddToCart).click();
	}
	public void searchProduct(String Product) {
		driver.findElement(Search).clear();
		driver.findElement(Search).sendKeys(Product);
		driver.findElement(SearchButton).click();
	}
    public void searchWithDescription(String Product) {
    	driver.findElement(Search).clear();
		driver.findElement(Search).sendKeys(Product);
    	driver.findElement(SearchCheck).click();
    	driver.findElement(SearchButton).click();
    }
	
	

}
