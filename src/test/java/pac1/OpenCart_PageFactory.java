package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenCart_PageFactory {
	
	@FindBy(linkText="Desktops")
	WebElement DesktopTab;
	@FindBy(linkText="Mac (1)")
	WebElement Mac;
	@FindBy(id="input-sort")
	WebElement sortDropdown;
	@FindBy(xpath="//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]")
	WebElement AddToCart;
	@FindBy(name="search")
	WebElement Search;
	@FindBy(xpath="//div[@id='search']//button")
	WebElement SearchButton;
	@FindBy(name="description")
	WebElement Searchcheck;
	
	public void clickDesktop() {
		DesktopTab.click();
		
	}
	public void clickMac() {
		Mac.click();
	}
	public void sortByDropdown() {
		Select sle=new Select(sortDropdown);
		sle.selectByVisibleText("Name (A - Z)");
		
	}
	public void clickAddCart() {
		AddToCart.click();
	}
	public void searchProduct(String Product) {
		Search.clear();
		Search.sendKeys(Product);
		SearchButton.click();
	}
    public void searchWithDescription(String Product) {
    	Search.clear();
		Search.sendKeys(Product);
		Searchcheck.click();
		SearchButton.click();
    }
	
	

}
