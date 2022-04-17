package com.seleniumTask2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		//Simple Alert
		WebElement button1 = driver.findElement(By.xpath("(//button)[1]"));
		 
		button1.click();
		
		Thread.sleep(3000);
		
		
		Alert simpleAlert = driver.switchTo().alert();
		
		simpleAlert.accept();
		
		
		//confirm Alert
		
		 WebElement button2 = driver.findElement(By.xpath("(//button)[2]"));
		
		 button2.click();
		 
		 Thread.sleep(3000);
		 
		   
		 Alert confirmAlert = driver.switchTo().alert();
		 
		 confirmAlert.accept();
		 
	  // confirmAlert.dismiss();
		 
		 
		 
       //Prompt Alert	   
	 
		  WebElement button3 = driver.findElement(By.xpath("(//button)[3]"));
		  
		  button3.click();
		  
		  Thread.sleep(3000);
		  
		  Alert promptAlert = driver.switchTo().alert();
		  
		  promptAlert.sendKeys("Greens Technologies");
		   
		  String text = promptAlert.getText();
		   
		  System.out.println(text);
		   
		  promptAlert.accept();
		   
	   // promptAlert.dismiss();
		  
	}
}	
		  
		  
	
	
	
