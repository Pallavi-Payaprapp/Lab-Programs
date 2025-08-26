package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q3 {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String search) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();
	  driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(search);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  List<WebElement> prodtitle = driver.findElements(By.cssSelector("h2.a-size-medium"));
	  for(int i =0;i<5;i++) {
		  String title = prodtitle.get(i).getAttribute("aria-label");
		  System.out.println((i+1)+": "+title);
	  }
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
  @DataProvider
  public Object[][] dp() {
      return new Object[][] {
          { "laptop" }  
      };
  }
}