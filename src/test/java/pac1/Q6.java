package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Q6 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	  WebElement checkbox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
	  checkbox1.click();
	  Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 not selected!");
      Assert.assertTrue(checkbox2.isSelected(), "Checkbox 2 not selected!");
      System.out.println("Both checkbox are selected");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
