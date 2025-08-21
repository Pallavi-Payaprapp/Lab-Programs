package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;


public class Lab14_TestNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String fname,String lname,String email,String telephone,String password,String cpassword) {
	  if(driver.getTitle().equals("Your Store")) {
		  System.out.println("Title is matched:"+driver.getTitle());
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
  public Object[][] dp() throws IOException {
	  String data[][]=new String[1][6];
	  String projectpath=System.getProperty("user.dir");
	  File f=new File(projectpath+"\\UserDetails.xlsx");
	  FileInputStream fs=new FileInputStream(f);
	  XSSFWorkbook workbook=new XSSFWorkbook(fs);
	  XSSFSheet worksheet=workbook.getSheetAt(0);
	  int rowcount=worksheet.getPhysicalNumberOfRows();
	  System.out.println("row:"+rowcount);
	  DataFormatter formatter = new DataFormatter();

	  for (int i=1; i<rowcount; i++) {
	      data[i-1][0]=formatter.formatCellValue(worksheet.getRow(i).getCell(0));
	      data[i-1][1]=formatter.formatCellValue(worksheet.getRow(i).getCell(1));
	      data[i-1][2]=formatter.formatCellValue(worksheet.getRow(i).getCell(2));
	      data[i-1][3]=formatter.formatCellValue(worksheet.getRow(i).getCell(3));
	      data[i-1][4]=formatter.formatCellValue(worksheet.getRow(i).getCell(4));
	      data[i-1][5]=formatter.formatCellValue(worksheet.getRow(i).getCell(5));
	  }
	  return data;
	  
    
  

}
}
