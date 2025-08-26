package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q7 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  List<WebElement>names=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td[2]"));
      System.out.println("Names in first table:");
      for(WebElement name:names) {
          System.out.println(name.getText());
      }
      String email=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[td[2]='Jason']/td[3]")).getText();
      System.out.println("Email of Jason: " + email);
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
