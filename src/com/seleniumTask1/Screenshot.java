package com.seleniumTask1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

    public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.tnpsc.gov.in/");
		
	    driver.manage().window().maximize();	
	    
	    TakesScreenshot picture = (TakesScreenshot) driver;
		  
	    File sourcefile = picture.getScreenshotAs(OutputType.FILE);
	    
	    File destfile = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\sreenshots.png");
	    
	    FileHandler.copy(sourcefile, destfile);;
	    
	}
    
  }	
	    
	    
	   
	    
	    
	    
	    
	     
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	


