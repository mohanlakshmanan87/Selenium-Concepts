package com.seleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_task {
	
	  public static void main(String[] args) throws InterruptedException {
		  
		  


			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://qa-www.tatasky.com/my-account/login/");
			
			driver.manage().window().maximize();
		
			WebElement mobno = driver.findElement(By.xpath("//input[@type='tel']")); 
			 
			mobno.sendKeys("9500027364");
			
			Thread.sleep(3000);
			 
			WebElement text = driver.findElement(By.xpath("//h1[text()='Welcome to a new & exciting Tata Sky!']"));
			   
			String s=text.getText();
			 
			System.out.println(s);
			
			//driver.findElement(By.xpath("//h1[contains(text(),'Welcome' )]"));
			
			WebElement login = driver.findElement(By.xpath("//button[contains(@type,'button')]"));
			
			login.click();
		
	        driver.findElement(By.xpath("(//div[@id='my-account-root'])[1]"));
	        
	       // driver.close();
	        
	        
	     }     
	        
	        
	  }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			 

			
			
			 
			 
			 
			  
			  
			
			
			
	
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	


