package Selenium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LAB5_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		String title=driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("Title is displayed: "+title);
		}
		else {
			System.out.println("Title is not displayed");
		}
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement heading=driver.findElement(By.xpath("//h1[text()='Register Account']"));
		if(heading.isDisplayed()) {
			System.out.println("Heading Register Account is displayed");
		}
		else {
			System.out.println("Heading Register account is not displayed");
		}
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//WebElement warning=driver.findElement(By.xpath("//div[contains(text(),'Warning: You must agree to the Privacy Policy!')]"));
		//if(warning.isDisplayed()) {
			//System.out.println("Warning message displayed: "+warning.getText());
		//}
		//else {
			//System.out.println("Warning not displayed");
		//}
		
		String FirstName="ABC";
		WebElement FirstNameBox=driver.findElement(By.id("input-firstname"));
		FirstNameBox.clear();
		FirstNameBox.sendKeys(FirstName);
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//WebElement FirstNameError=driver.findElement(By.xpath("//div[contains(text(),'First Name must be between')]"));
		//if(FirstNameError.isDisplayed()) {
			//System.out.println("First Name Error: "+FirstNameError.getText());
		//}
		//else {
			//System.out.println("No Error");
		//}
		
		String LastName="XYZ";
		WebElement LastNameBox=driver.findElement(By.id("input-lastname"));
		LastNameBox.clear();
		LastNameBox.sendKeys(LastName);
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//WebElement LastNameError=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between')]"));
		//if(LastNameError.isDisplayed()) {
			//System.out.println("Last Name Error: "+LastNameError.getText());
		//}
		//else {
			//System.out.println("No Error");
		//}
		
		WebElement Email=driver.findElement(By.id("input-email"));
		Email.clear();
		Email.sendKeys("pzu@gmail.com");
		
		WebElement Phone=driver.findElement(By.id("input-telephone"));
		Phone.clear();
		Phone.sendKeys("1112223334");
		
		WebElement Password=driver.findElement(By.id("input-password"));
		Password.clear();
		Password.sendKeys("abc@123");
		
		WebElement ConfirmPassword=driver.findElement(By.id("input-confirm"));
		ConfirmPassword.clear();
		ConfirmPassword.sendKeys("abc@123");
		
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		
		System.out.println("Your Account has been created");
		
		
		
		
		
		
		

	}

}
