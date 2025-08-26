package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Q4 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement dropdown=driver.findElement(By.name("my-select"));
	  Select sle=new Select(dropdown);
	  sle.selectByVisibleText("Two");
	  String selected=sle.getFirstSelectedOption().getText();
	  System.out.println("Selected Option:"+selected);
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
