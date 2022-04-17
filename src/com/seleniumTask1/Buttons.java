package com.seleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	

	  public static void main(String[] args) {
		


			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Button.html");
			
			driver.manage().window().maximize();
			
			
			WebElement getposition = driver.findElement(By.id("position"));
			
			org.openqa.selenium.Point xyvalue = getposition.getLocation();
			
			int xvalue = xyvalue.getX();
			        
			int yvalue = xyvalue.getY();
			        
			System.out.println("The value of x is:"+ xvalue+" "+ "The value of y is:"+ yvalue);
			        
			
			
			WebElement findcolor = driver.findElement(By.id("color"));
			 
		    String color = findcolor.getCssValue("background-color");
			 
		    System.out.println("button color is"+" "+ color);
			 
			 
			 
			 WebElement findsize = driver.findElement(By.xpath("//button[@id='size']"));
			 
			 int height = findsize.getSize().getHeight();
			       
			 int width = findsize.getSize().getWidth();
			  
			 System.out.println("The height of box is:"+ height+" "+"The width of box is:"+ width);
			 
			 
			 
			 driver.findElement(By.id("home")).click();
			 
			 driver.quit();
			  
			  
			  
			         
	  }
}
			        
			       
			        
			        
			        
			        
			        
			        
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	
	


