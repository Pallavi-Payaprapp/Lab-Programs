package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab12_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prob=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace1\\Aug2025\\configuration\\config.property");
		prob.load(fis);
		String url=prob.getProperty("url");
		String fname=prob.getProperty("firstname");
		String lname=prob.getProperty("lastname");
		String Email=prob.getProperty("email");
		String Phone=prob.getProperty("telephone");
		String password=prob.getProperty("password");
		String cpassword=prob.getProperty("confirm");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("telephone")).sendKeys(Phone);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirm")).sendKeys(cpassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		  WebElement successmsg=driver.findElement(By.xpath("//div[@id='content']/h1"));
		  if(successmsg.isDisplayed() && successmsg.getText().equals("Your Account Has Been Created!")) {
			  System.out.println("Message is displayed:"+successmsg.getText());
		  }
		

	}

}
