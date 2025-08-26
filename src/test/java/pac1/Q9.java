package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q9 {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest=projectpath+"\\screenshot1.png";
		File detfile=new File(dest);
		FileUtils.copyFile(src, detfile);
		System.out.println("Screenshot saved at:"+dest);
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
