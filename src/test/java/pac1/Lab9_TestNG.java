package TestNG;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Lab9_TestNG {
WebDriver driver;
	@Parameters("browser")
  @Test
  public void test1(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  if(driver.getTitle().equals("Your Store")) {
				  System.out.println("Title is Matched");
				  Assert.assertTrue(true);
			  }
			  else {
				  System.out.println("Title is not matched");
				  Assert.assertTrue(false);
			  }
			  driver.findElement(By.linkText("Desktops")).click();
			  driver.findElement(By.linkText("Mac (1)")).click();
			  WebElement macHeading = driver.findElement(By.xpath("//h2[text()='Mac']"));
			  if(macHeading.isDisplayed()) {
				  System.out.println("Heading is displayed");
				  Assert.assertTrue(true);
			  }
			  else {
				  System.out.println("Heading is not displayed");
				  Assert.assertTrue(false);
			  }
			  WebElement sort=driver.findElement(By.id("input-sort"));
			  Select sle=new Select(sort);
			  sle.selectByVisibleText("Name (A - Z)");
			  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			  WebElement addToCartBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")));
			  addToCartBtn.click();
			  WebElement s=driver.findElement(By.name("search"));
			  s.clear();
			  s.sendKeys("Mobile");
			  driver.findElement(By.xpath("//div[@id='search']//button")).click();
			  driver.findElement(By.name("description")).click();
  }
		
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 driver.get("https://tutorialsninja.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  if(driver.getTitle().equals("Your Store")) {
				  System.out.println("Title is Matched");
				  Assert.assertTrue(true);
			  }
			  else {
				  System.out.println("Title is not matched");
				  Assert.assertTrue(false);
			  }
			  driver.findElement(By.linkText("Desktops")).click();
			  driver.findElement(By.linkText("Mac (1)")).click();
			  WebElement macHeading = driver.findElement(By.xpath("//h2[text()='Mac']"));
			  if(macHeading.isDisplayed()) {
				  System.out.println("Heading is displayed");
				  Assert.assertTrue(true);
			  }
			  else {
				  System.out.println("Heading is not displayed");
				  Assert.assertTrue(false);
			  }
			  WebElement sort=driver.findElement(By.id("input-sort"));
			  Select sle=new Select(sort);
			  sle.selectByVisibleText("Name (A - Z)");
			  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			  WebElement addToCartBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")));
			  addToCartBtn.click();
			  WebElement s=driver.findElement(By.name("search"));
			  s.clear();
			  s.sendKeys("Mobile");
			  driver.findElement(By.xpath("//div[@id='search']//button")).click();
			  driver.findElement(By.name("description")).click();
	}
}
}	
 

