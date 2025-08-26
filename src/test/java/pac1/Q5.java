package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q5 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	  Alert alert=driver.switchTo().alert();
	  System.out.println("The Message is: "+alert.getText());
	  alert.accept();
	  String result=driver.findElement(By.id("result")).getText();
      System.out.println("Result message: " + result);
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
