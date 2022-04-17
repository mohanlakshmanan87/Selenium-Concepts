package com.seleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_methods {
 
	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_Concepts\\Driver\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		

		 driver.get("https://www.yadavmatrimony.com/login/index.php");
		
		 driver.manage().window().maximize();
		
		
		 WebElement id = driver.findElement(By.id("idEmail"));
		 
		 id.sendKeys("mohanlakshmanan87@gmail.com");
		 
		 
		 WebElement password = driver.findElement(By.id("password"));
		 
		 password.sendKeys("12345");
		 
		
		 String p1= id.getAttribute("name");
	
		 System.out.println(p1);
		 
		 String p2 = id.getAttribute("value");
		   
		 System.out.println(p2);
		 
		 
		 boolean displayed = id.isDisplayed();
		 System.out.println(displayed); 
		 
		 //password.clear();
		
		 boolean enabled = password.isEnabled();
		 System.out.println(enabled);
		
		 WebElement login = driver.findElement(By.id("frmsubmit"));
		 
		 boolean selected = login.isSelected();
		 System.out.println(selected);
		 
		 login.click();
		
		
	
	}

}
