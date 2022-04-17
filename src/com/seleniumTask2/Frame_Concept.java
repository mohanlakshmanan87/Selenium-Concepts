package com.seleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
	  //single Frame
		
	    driver.switchTo().frame("singleframe");
	   
	    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	   
	    textbox.sendKeys("Selenium");
	   
	  //Default content(from frame to webpage) 
	   
	    driver.switchTo().defaultContent();
	    
	   //multi Frame 
	    
	    WebElement iframebutton = driver.findElement(By.xpath("//a[@href='#Multiple']"));
	    iframebutton.click();
	   
	   //switch to outerframe
	    WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(outerframe);
	    
	   //Switch to innerframe 
	    WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(innerframe);    
	    
	    WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox2.sendKeys("Mono");
	    
	   //Switch from inner frame to outer frame
	     driver.switchTo().parentFrame();
	    
	   //Switch from outer frame to webpage
	     driver.switchTo().defaultContent();
	 
}	
	}
