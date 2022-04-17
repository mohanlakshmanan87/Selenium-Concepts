package com.Automationproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Runner {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Emailid
		
		WebElement mailid = driver.findElement(By.id("email_create"));
		
		mailid.sendKeys("bensmith4201@gmail.com");
		
		// Create an account
		
	    WebElement createaccount = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		 
		createaccount.click();
		
		
		//Title select Gender
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
		
		gender.click();
		
		//firstname
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		
		firstname.sendKeys("mono");
		
		//lastname
		
        WebElement lastname = driver.findElement(By.id("customer_lastname"));
		
		lastname.sendKeys("mohan");
		
		//password
		
		WebElement password = driver.findElement(By.id("passwd"));
		
		password.sendKeys("mahi@12345");
		
		//days
		
		WebElement days = driver.findElement(By.id("days"));
		
		Select s= new Select(days);
		s.selectByValue("19");
		
		
		//month
		
		WebElement month = driver.findElement(By.id("months"));
		
		Select s1= new Select(month);
		s1.selectByValue("10");
		
		// year
		
		WebElement year = driver.findElement(By.id("years"));

		Select s2= new Select(year);
		s2.selectByValue("1987");
	
	    //company name
	
		WebElement companyname = driver.findElement(By.id("company"));
		companyname.sendKeys("Inspirisys solution pvt ltd");
	
		//Address1
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("NO.123 Kingley Board club street");
		
		//Adress2
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Dowlath towers, 2nd floor");
		
		//city
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("seattle");
		
		//State
		
		WebElement state = driver.findElement(By.id("id_state"));
		 
		Select s3= new Select(state);
		s3.selectByValue("47");
	
		//Postalcode
		
		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("98101");
		
		//country
		
		WebElement country = driver.findElement(By.id("id_country"));
		 
		Select s4= new Select(country);
		s4.selectByValue("21");
		
		//Additional information
		WebElement additionalinformation = driver.findElement(By.id("other"));
		additionalinformation.sendKeys("Access front line");
		
		//mobile number
		
		WebElement phno= driver.findElement(By.id("phone_mobile"));
		phno.sendKeys("999888770");
		
		//Alias name
		WebElement alias= driver.findElement(By.id("alias"));
		alias.sendKeys("WALES OF USA");
		
		//Register account
		
		WebElement register= driver.findElement(By.id("submitAccount"));
		register.click();
		
	
	
	
	}
}
