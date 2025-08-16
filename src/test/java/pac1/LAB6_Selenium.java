package Selenium_Pac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB6_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		//1.Login with credentials created in Lab 1
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("pzu@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		
		//2.Go to 'Components' tab and click
		driver.findElement(By.linkText("Components")).click();
		
		//3.Select 'Monitors'
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		//4.Select 25 from 'Show' dropdown
		WebElement show=driver.findElement(By.id("input-limit"));
		Select sle=new Select(show);
		sle.selectByIndex(1);
		
		//5.Click on 'Add to cart' for the first item
		driver.findElement(By.xpath("(//button[contains(@onclick,'cart.add')])[1]")).click();
		
		//6.Click on 'Specification' tab
		driver.findElement(By.linkText("Apple Cinema 30\"")).click();
		driver.findElement(By.linkText("Specification")).click();
		
		//8.Click on 'Add to Wish list' button.
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
    
        
        //9.Verify message 'Success: You have added Apple Cinema 30" to your wish list!'
        String msg = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText();
        System.out.println("Message: " + msg);
        
        //10.Enter 'Mobile' in ' Search' text box.
        WebElement search=driver.findElement(By.name("search"));
        search.clear();
        search.sendKeys("Mobile");
        
        //11.Click on 'Search' button
        driver.findElement(By.xpath("//div[@id='search']//button")).click();
        
        //12.Click on 'Search in product descriptions' check box
        driver.findElement(By.name("description")).click();
        driver.findElement(By.id("button-search")).click();
        
        //13.Click on link 'HTC Touch HD' for the mobile 'HTC Touch HD'
        driver.findElement(By.linkText("HTC Touch HD")).click();
        
        //14.Clear '1' from 'Qty' and enter '3'
        WebElement quantity=driver.findElement(By.id("input-quantity"));
        quantity.clear();
        quantity.sendKeys("3");
        
        //15.Click on 'Add to Cart' button
        driver.findElement(By.id("button-cart")).click();
       
        
        //16.Verify success message 'Success: You have added HTC Touch HD to your  shopping cart!'
        String msg1 = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText();
        System.out.println("Message: "+msg1);
        
        
        //17.Click on 'View cart' button adjacent to search button
        driver.findElement(By.id("cart-total")).click();
        driver.findElement(By.linkText("View Cart")).click();
        
        //19.Click on 'Checkout' button
        driver.findElement(By.linkText("Checkout")).click();
        
        //20.Click on 'My Account' dropdown
        driver.findElement(By.linkText("My Account")).click();
        
        //21.Select 'Logout' from dropdown
        driver.findElement(By.linkText("Logout")).click();
        
        //23.Click on 'Continue'
        driver.findElement(By.linkText("Continue")).click();




	}

}
