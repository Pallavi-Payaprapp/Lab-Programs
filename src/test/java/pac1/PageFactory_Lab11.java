package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactory_Lab11 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String Product) throws InterruptedException {
	  OpenCart_PageFactory obj=PageFactory.initElements(driver,OpenCart_PageFactory.class);
	  obj.clickDesktop();
	  obj.clickMac();
	  obj.sortByDropdown();
	  Thread.sleep(3000);
	  obj.clickAddCart();
	  obj.searchProduct(Product);
	  obj.searchWithDescription(Product);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
	  
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Mobile"},
      new Object[] {"Monitors"},
    };
  }
}
