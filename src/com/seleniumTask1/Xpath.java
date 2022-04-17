package com.seleniumTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	

	public static void main(String[] args) throws InterruptedException { 
		
		


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement FE = driver.findElement(By.xpath("//input[@type='text']"));
		
		FE.sendKeys("123456");
		
		driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		WebElement FL = driver.findElement(By.xpath("//h2[contains(text( ),'Facebook')]"));
		
		String text = FL.getText();
		          
		System.out.println(text);
	
	
		WebElement login = driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]"));
		
		login.click();
	
	
	
	    
	
	
	
	}

}
