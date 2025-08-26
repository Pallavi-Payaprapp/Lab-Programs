package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q8 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  String pwindow=driver.getWindowHandle();
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
	  Set<String>windows=driver.getWindowHandles();
	  for (String win:windows) {
          if (!win.equals(pwindow)) {
              driver.switchTo().window(win);
              System.out.println("Child Window Title:"+driver.getTitle());
              driver.close(); 
          }
          
      }
	  driver.switchTo().window(pwindow);
      System.out.println("Parent Window Title:"+driver.getTitle());
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/windows");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
