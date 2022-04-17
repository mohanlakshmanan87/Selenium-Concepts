package com.seleniumTask1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		
		String fb = driver.getTitle();
		
		System.out.println("Title is - " + fb);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		String fl = driver.getTitle();
		
		System.out.println("Title is = " + fl);
		
		driver.navigate().refresh();
		
		String cl = driver.getCurrentUrl();
		 
		System.out.println(" current url is" + cl);
		
		
		
		
		
		
	}
}
