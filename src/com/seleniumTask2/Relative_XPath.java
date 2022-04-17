package com.seleniumTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_XPath {
	
	


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium project_2\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://lumos.heymath.com/in");
		
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[contains(@class,'myheymathbtn')]"));
		
		signin.click();
		
		Thread.sleep(3000);
		
		WebElement userid = driver.findElement(By.xpath("//input[@placeholder='Enter your User ID']"));
		
		userid.sendKeys("123456789");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'password')]"));
		
		password.sendKeys("Mono1987");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'submitButton')]"));
		
		login.click();
		
		
	}
}