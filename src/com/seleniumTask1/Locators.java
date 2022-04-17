package com.seleniumTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Locators {



	public static void main(String[] args) throws InterruptedException { 
		
		


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.id("email"));
		
		mail.sendKeys("bensmith4201@gmail.com");
		
		WebElement passwd = driver.findElement(By.id("pass"));
		
		passwd.sendKeys("tendulkar200");
		
		WebElement button = driver.findElement(By.name("login"));
		
		Thread.sleep(3000);
		
		button.click();
		 
		 
		











}
}