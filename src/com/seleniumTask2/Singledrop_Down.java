package com.seleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singledrop_Down {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.manage().window().maximize();
	
	    WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
	    
	    firstname.sendKeys("Mono");
	    
	    WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    
	    surname.sendKeys("Mohan");
	    
	    
	    WebElement mobno = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    
	    mobno.sendKeys("9500027364");
		 
	   
	    WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	    
	    password.sendKeys("abs12345");
	    
	    WebElement date = driver.findElement(By.id("day"));
	    
	    Select s= new Select(date);
	    
	    s.selectByValue("19");
	    
	    
        WebElement month = driver.findElement(By.id("month"));
        
        Select s1= new Select(month);
        
        s1.selectByIndex(9);
        
        

        WebElement year = driver.findElement(By.id("year"));
        
        Select s2= new Select(year);
        
        s2.selectByVisibleText("1987");
        
        
	}

}
        
         
        
         
	
	
	
	
	
	
	
	
	
