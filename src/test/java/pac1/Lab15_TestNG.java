package TestNG;

import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Lab15_TestNG {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
  @Test(dataProvider = "dp")
  public void f(String fname,String lname,String email,String telephone,String password,String cpassword) {
	  String title=driver.getTitle();
	  if(title.equals("Your Store")) {
		  System.out.println("Title is verified:"+driver.getTitle());
	  }
	  else {
		  System.out.println("Title is not matched");
	  }
	  driver.findElement(By.linkText("My Account")).click();
	  driver.findElement(By.linkText("Register")).click();
	  WebElement heading=driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
	  if(heading.isDisplayed()) {
		  System.out.println("Heading is displayed:"+heading.getText());
	  }
	  else {
		  System.out.println("Heading is not present");
	  }
	  driver.findElement(By.name("firstname")).sendKeys(fname);
	  driver.findElement(By.name("lastname")).sendKeys(lname);
	  driver.findElement(By.name("email")).sendKeys(email);
	  driver.findElement(By.name("telephone")).sendKeys(telephone);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("confirm")).sendKeys(cpassword);
	  driver.findElement(By.name("agree")).click();
	  driver.findElement(By.xpath("//input[@value='Continue']")).click();
	  WebElement successmsg=driver.findElement(By.xpath("//div[@id='content']/h1"));
	  if(successmsg.isDisplayed() && successmsg.getText().equals("Your Account Has Been Created!")) {
		  System.out.println("Message is displayed:"+successmsg.getText());
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() throws IOException, CsvException {
	  String[][] data1=new String[1][6];
	  String csvFile=projectpath+"\\USER_DETAILS.csv";
	    CSVReader csvReader=new CSVReader(new FileReader(csvFile));
	    List<String[]> data=csvReader.readAll();
	    for(int i=1;i<data.size();i++) {
	    	data1[i-1][0]=data.get(i)[0];
	    	data1[i-1][1]=data.get(i)[1];
	    	data1[i-1][2]=data.get(i)[2];
	    	data1[i-1][3]=data.get(i)[3];
	    	data1[i-1][4]=data.get(i)[4];
	    	data1[i-1][5]=data.get(i)[5];
	    }
	    return data1;
	  
	  
  }
}
