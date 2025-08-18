package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Lab8_TestNG {
	WebDriver driver;
  @Test (dataProvider = "dp")
  public void f(String search) throws InterruptedException {
	  driver.get("https://tutorialsninja.com/demo/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.linkText("Desktops")).click();
	  driver.findElement(By.linkText("Mac (1)")).click();
	  WebElement sort=driver.findElement(By.id("input-sort"));
	  Select sle=new Select(sort);
	  sle.selectByVisibleText("Name (A - Z)");
	  driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));
	  WebElement s=driver.findElement(By.name("search"));
	  s.sendKeys(search);
	  s.clear();
	  driver.findElement(By.xpath("//div[@id='search']//button")).click();
	  driver.findElement(By.name("description")).click();
	  
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
	  System.out.println("After method");
	  //driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Mobile"},
      new Object[] {"Monitors"},
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
