package com.seleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Concepts {

	


	public static void main(String[] args) throws  InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	
	   
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		
		WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		js.executeScript("arguments[0].scrollIntoView();",fb );
		
		Thread.sleep(3000);

	
	    js.executeScript("window.scrollBy(0,-5000);");
	  
		Thread.sleep(3000);

	    
		js.executeScript("window.scrollBy(0,3000);");
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
