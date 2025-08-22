package TestNG;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Lab16_TestNG {
	WebDriver driver;
	String projectpath=System.getProperty("user.dir");
  @Test(dataProvider = "dp")
  public void f(String fname,String lname,String email,String phone,String pwd,String cpwd){
	  String title=driver.getTitle();
	  if(title.equals("Your Store")) {
		  System.out.println("Title is Verified:"+driver.getTitle());
	  }
	  else {
		  System.out.println("Title is not verified");
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
	  driver.findElement(By.name("telephone")).sendKeys(phone);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("confirm")).sendKeys(cpwd);
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
  public Object[][] dp() throws ParserConfigurationException, SAXException, IOException {
	  String[][] data1=new String[2][6];
	  File file=new File(projectpath+"\\UserDetails.xml");
	  DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
	  DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();

	  Document doc=dBuilder.parse(file);
	  doc.getDocumentElement().normalize();

	  System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

	  NodeList nList=doc.getElementsByTagName("user");

	  for (int i=0; i<nList.getLength(); i++) {
	      Node node=nList.item(i);

	      if (node.getNodeType()==Node.ELEMENT_NODE) {
	          Element element=(Element)node;

	         data1[i][0]=element.getElementsByTagName("firstname").item(0).getTextContent();
	         data1[i][1]=element.getElementsByTagName("lastname").item(0).getTextContent();
	         data1[i][2]=element.getElementsByTagName("email").item(0).getTextContent();
	         data1[i][3]=element.getElementsByTagName("telephone").item(0).getTextContent();
	         data1[i][4]=element.getElementsByTagName("password").item(0).getTextContent();
	         data1[i][5]=element.getElementsByTagName("confirmpassword").item(0).getTextContent();
	        
	          System.out.println("FirstName: "+data1[i][0]);
	          System.out.println("LastName: "+data1[i][1]);
	          System.out.println("Email: "+data1[i][2]);
	          System.out.println("Phone: "+ data1[i][3]);
	          System.out.println("Password: "+data1[i][4]);
	          System.out.println("Confirm Password: "+data1[i][5]);
	          
	          
	  

    
  }
 }
	  return data1;
  }
}
