package com.seleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTest {
	
	
	
	  public static void main(String[] args) {
		


			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("http://leafground.com/pages/Edit.html");
			  
			
			WebElement mailid = driver.findElement(By.id("email"));
			
			mailid.sendKeys("mohan87@gmail.com");
			
			
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("welcome our Home");
			
			
			
			WebElement gettext = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
			
			   String m = gettext.getAttribute("value");
			   
			   System.out.println("default text is :"+ " "+ m);
			   
			   
			   
			   WebElement clrtext = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
			   
			   clrtext.clear();
			   
			   
			   
			   WebElement disablebox = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
			   
			   boolean a = disablebox.isEnabled();
			   
			   System.out.println("If box is enabled:"+ " "+ a);
			   
			   
			
			
			
			
			   
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	

}
