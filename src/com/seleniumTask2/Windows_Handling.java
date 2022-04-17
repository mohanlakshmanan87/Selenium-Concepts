package com.seleniumTask2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		Actions ac= new Actions(driver);
		ac.contextClick(electronics).build().perform();
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
        WebElement books = driver.findElement(By.xpath("//a[text()='Books']"));
	    ac.contextClick(books).build().perform();	 
	   
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		// get window handles
		
		   Set<String> windowHandles = driver.getWindowHandles();
		   
		   for(String fn : windowHandles) {
			   
			   String title = driver.switchTo().window(fn).getTitle();
			   
			   System.out.println(title);
			   
		   }
		   
     String mytitle="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
		   
 	
		for (String fn : windowHandles) {
			
			if(driver.switchTo().window(fn).getTitle().equals(mytitle)) {
				
			 break;
		}
		
		}	
		  
		   

		
		
		
		
		
		
		
		
	
	}
	
}